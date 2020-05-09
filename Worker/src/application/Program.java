package application;

import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Program {

    public static void main(String[] args) throws HeadlessException, ParseException {
        Locale.setDefault(Locale.US);
        List<Worker> workers;
        workers = new ArrayList<>();

        menu(workers);
    }

    public static void menu(List<Worker> workers) throws HeadlessException, ParseException {
        Integer menu;
        do {
            try {

                menu = Integer.parseInt(JOptionPane.showInputDialog("Control system"
                        + "\nSelect a option"
                        + "\n 1-Add worker"
                        + "\n 2-Add contract"
                        + "\n 3-Remove contract"
                        + "\n 4-Income per month"
                        + "\n 5-Worker information"));
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }

            if (menu != null) {
                switch (menu) {
                    case 1:
                        workers.add(createWorker());
                        break;
                    case 2:
                        addContract(workers);
                        break;
                    case 3:
                        removeContract(workers);
                        break;
                    case 4:
                        incomePerMonth(workers);
                        break;
                    case 5:
                        workerInfo(workers);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Not found");
                        break;
                }
            }
        } while (menu != null);
    }

    public static void workerInfo(List<Worker> workers) throws HeadlessException {
        Worker worker = selectPerName(workers);
        JOptionPane.showMessageDialog(null, worker);
    }

    public static void incomePerMonth(List<Worker> workers) throws HeadlessException, NumberFormatException {
        Worker worker;
        try {
            worker = selectPerName(workers);
            var month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month of contract"));
            var year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of contract"));
            try {
                JOptionPane.showMessageDialog(null, "Income month " + month + ": " + worker.income(year, month));
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Not found");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Not found");
        }
    }

    public static void addContract(List<Worker> workers) throws ParseException, HeadlessException, NumberFormatException {
        Worker worker = selectPerName(workers);
        if (worker != null) {
            worker.addContract(createContract());
            JOptionPane.showMessageDialog(null, "Contract added");
        } else {
            JOptionPane.showMessageDialog(null, "Not found");
        }
    }

    public static void removeContract(List<Worker> workers) throws HeadlessException, NumberFormatException {
        if (removePerId(workers)) {
            JOptionPane.showMessageDialog(null, "Contract removed");
        } else {
            JOptionPane.showMessageDialog(null, "Contract not foud");
        }
    }

    public static boolean removePerId(List<Worker> workers) throws HeadlessException, NumberFormatException {
        Worker worker;
        try {
            worker = selectPerName(workers);
            var id = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of contract"));
            return worker.getContracts().removeIf(c -> c.getId().equals(id));
        } catch (HeadlessException | NumberFormatException e) {
            return false;
        }
    }

    public static Worker selectPerName(List<Worker> workers) throws HeadlessException {
        Worker worker;
        var name = JOptionPane.showInputDialog("Enter the name of worker");
        try {
            worker = workers.stream().filter(w -> w.getName().equals(name)).findFirst().orElse(null);
        } catch (Exception e) {
            worker = null;
        }
        return worker;
    }

    public static HourContract createContract() throws ParseException, NumberFormatException, HeadlessException {
        HourContract hc = new HourContract();
        try {
            hc.setId(Integer.parseInt(JOptionPane.showInputDialog("Enter ID of contract")));
            try {
                hc.setDate(JOptionPane.showInputDialog("Enter the date of contract dd/mm/yyyy"));
            } catch (HeadlessException | ParseException e) {
                hc.setDate(null);
            }
            hc.setHours(Integer.parseInt(JOptionPane.showInputDialog("Enter the hours of contract")));
            hc.setValuePerHour(Double.parseDouble(JOptionPane.showInputDialog("Enter the value of contract per hour")));
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            hc = null;
        }
        return hc;
    }

    public static Worker createWorker() throws HeadlessException {
        Worker worker = new Worker();
        try {
            worker.setId(Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of worker")));
            worker.setName(JOptionPane.showInputDialog("Enter the name of worker"));
            var level = JOptionPane.showInputDialog("Select the level of worker\nJUNIOR - MID_LEVEL - SENIOR");
            worker.setLevel(WorkerLevel.valueOf(level.toUpperCase()));
            worker.settingBaseSalary();
        } catch (HeadlessException | NumberFormatException e) {
            worker = null;
        }
        JOptionPane.showMessageDialog(null, worker);
        return worker;
    }
}
