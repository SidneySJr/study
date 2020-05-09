package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author sidney
 */
public class Employee {

    private static Integer cod = 100;
    private Integer id = cod;
    private String name;
    private String lastName;
    private String cpf;
    private Double salary;
    private Date birth;

    public Employee() {
        cod++;
    }

    public Employee(String name, String lastName, String cpf, Double salary, String birth) {
        cod++;
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
        this.salary = salary;
        try {
            this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        } catch (ParseException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterSalary(Double newSalary) {
        salary = newSalary;
    }

    public Integer getCod() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalary() {
        return salary;
    }

    public String getBirth() {
        return new SimpleDateFormat("dd/MM/yyyy").format(birth);
    }

    public void setBirth(String birth) {
        try {
            this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        } catch (ParseException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Employee:"
                + "\nId: " + id
                + "\nName: " + name + " " + lastName
                + "\nCpf: " + cpf
                + "\nBirth: " + new SimpleDateFormat("dd/MM/yyyy").format(birth)
                + "\nSalary: " + String.format("%.2f", salary);
    }

}
