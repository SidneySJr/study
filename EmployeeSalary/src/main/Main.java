package main;

import entities.Employee;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {

        Employee employee;
        employee = new Employee();

        JOptionPane.showMessageDialog(null, "Enter the data of employee");
        var name = JOptionPane.showInputDialog("Enter the name of employee");
        var grossSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter the groos salary of employee"));
        var tax = Double.parseDouble(JOptionPane.showInputDialog("Enter wage tax"));

        employee.setName(name);
        employee.setGrossSalary(grossSalary);
        employee.setTax(tax);

        JOptionPane.showMessageDialog(null, employee);

        var percentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the perncentage of increase salary"));

        employee.increaseSalary(percentage);

        JOptionPane.showMessageDialog(null, employee);

    }
}
