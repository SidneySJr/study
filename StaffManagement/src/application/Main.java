package application;

import entities.Employee;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Employee> employees;
        employees = new ArrayList<>();

        menu(employees);
    }

    public static void menu(List<Employee> employees) throws NumberFormatException, HeadlessException {
        Integer menu;
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Staff Mangement"
                        + "\n Select a option:"
                        + "\n 1- Edit employee"
                        + "\n 2- Insert employee"
                        + "\n 3- Remove employee"
                        + "\n 4- List of employees"));
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }

            if (menu != null) {
                switch (menu) {
                    case 1:
                        editEmployee(employees);
                        break;
                    case 2:
                        employees.add(createEmployee());
                        break;
                    case 3:
                        removeEmployee(employees);
                        break;
                    case 4:
                        listEmployee(employees);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Not found");
                        break;
                }
            }
        } while (menu != null);
    }

    public static void removeEmployee(List<Employee> employees) throws HeadlessException, NumberFormatException {
        var id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id of employee"));
        Employee employee = employees.stream().filter(x -> x.getCod().equals(id)).findFirst().orElse(null);
        Integer change = JOptionPane.showConfirmDialog(null, "Do you want too remove this employee" + employee);
        if (change == 0) {
            employees.removeIf(x -> x.getCod().equals(employee.getCod()));
        }
    }

    public static void listEmployee(List<Employee> employees) {
        employees.forEach((employee) -> {
            JOptionPane.showMessageDialog(null, employee);
        });
    }

    public static void editEmployee(List<Employee> employees) throws NumberFormatException, HeadlessException {

        Integer id = Integer.parseInt(JOptionPane.showInputDialog("Enter employee ID"));
        Employee employee = employees.stream().filter(x -> x.getCod().equals(id)).findFirst().orElse(null);

        Integer menu;
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Edit Employee"
                        + "\n Select a option:"
                        + "\n 1- Edit name"
                        + "\n 2- Edit CPF"
                        + "\n 3- Edit birth"
                        + "\n 4- Edit salay"
                        + "\n 5- Edit last name"));

            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }

            if (menu != null) {
                switch (menu) {
                    case 1:
                        employee.setName(JOptionPane.showInputDialog("The current name is " + employee.getName()
                                + "\nEnter the new name:"));
                        JOptionPane.showMessageDialog(null, "The new name is " + employee.getName());
                        break;
                    case 2:
                        employee.setCpf(JOptionPane.showInputDialog("The current CPF is " + employee.getCpf()
                                + "\nEnter the new CPF:"));
                        JOptionPane.showMessageDialog(null, "The new CPF is " + employee.getCpf());
                        break;
                    case 3:
                        employee.setBirth(JOptionPane.showInputDialog("The current birth date is " + employee.getBirth()
                                + "\nEnter the new birth date: (dd/mm/yyyy)"));
                        JOptionPane.showMessageDialog(null, "The new birth is " + employee.getBirth());
                        break;
                    case 4:
                        var salary = Double.parseDouble(JOptionPane.showInputDialog("the current salary is " + employee.getSalary()
                                + "\nEnter the new salary"));
                        employee.alterSalary(salary);
                        JOptionPane.showMessageDialog(null, "The new salary is " + employee.getSalary());
                        break;
                    case 5:
                        employee.setLastName(JOptionPane.showInputDialog("The current last name is " + employee.getLastName()
                                + "\nEnter the new last name:"));
                        JOptionPane.showMessageDialog(null, "The new last name is " + employee.getLastName());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Not found");
                        break;
                }
            }
        } while (menu != null);
    }

    public static Employee createEmployee() throws HeadlessException, NumberFormatException {

        var name = JOptionPane.showInputDialog("Enter the name of employee");
        var lastName = JOptionPane.showInputDialog("Enter the last name of employee");
        var cpf = JOptionPane.showInputDialog("Enter the CPF of employee");
        var birth = JOptionPane.showInputDialog("Enter the birth date of employee(dd/mm/yyyy)");
        var salary = Double.parseDouble(JOptionPane.showInputDialog("Enter the salary of employee"));
        Employee employee = new Employee(name, lastName, cpf, salary, birth);
        JOptionPane.showMessageDialog(null, employee);

        return employee;
    }

}
