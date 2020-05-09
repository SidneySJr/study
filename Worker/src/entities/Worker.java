package entities;

import entities.enums.WorkerLevel;
import static entities.enums.WorkerLevel.JUNIOR;
import static entities.enums.WorkerLevel.MID_LEVEL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author sidney
 */
public class Worker {

    private Integer id;
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker() {
    }

    public Worker(Integer id, String name, WorkerLevel level, Department department) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract constract) {
        contracts.remove(constract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }

        }
        return sum;
    }

    public void settingBaseSalary() {
        switch (level) {
            case JUNIOR:
                baseSalary = 3000.00;
                break;
            case MID_LEVEL:
                baseSalary = 5000.00;
                break;
            default:
                baseSalary = 8000.00;
                break;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalery() {
        return baseSalary;
    }

    public void setBaseSalery(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker"
                + "\nID: " + id
                + "\nName: " + name
                + "\nLevel: " + level
                + "\nDepartment: " + department
                + "\nBaseSalery: " + baseSalary
                + "\nContracts: " + contracts.size();
    }

}
