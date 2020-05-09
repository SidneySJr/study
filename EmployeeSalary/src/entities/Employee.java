package entities;

/**
 * @author sidney
 */
public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
        var increase = grossSalary * percentage / 100;
        grossSalary += increase;
        return increase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Employee: "
                + "\nName: " + name
                + "\nGrossSalary: " + String.format("%.2f", grossSalary)
                + "\nTax: " + String.format("%.2f", tax)
                + "\nNet Salary: " + String.format("%.2f", netSalary());
    }

}
