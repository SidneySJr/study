package Main;

import entities.Student;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author renoa
 */
public class main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Student> students;
        students = new ArrayList<>();

        int menu;

        do {
            menu = 0;
            try {

                menu = Integer.parseInt(JOptionPane.showInputDialog("====== School System ======"
                        + "\n 1- Calculate Average"
                        + "\n 2- Verify aproved"
                        + "\n 3- Verify reproved"));

            } catch (HeadlessException | NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Exiting");

            }

            switch (menu) {
                case 1:
                    students.add(calculateAverage());
                    break;
                case 2:
                    verifyAproved(students);
                    break;
                case 3:
                    verifyReproved(students);
                    break;
                default:
                    if (menu != 0) {
                        JOptionPane.showMessageDialog(null, "Option not found");
                    }
                    break;
            }

        } while (menu != 0);
    }

    public static void verifyReproved(List<Student> students) throws HeadlessException {
        for (Student student : students) {
            if (student.getAverage() < 7) {
                JOptionPane.showMessageDialog(null, student);
            }
        }
    }

    public static void verifyAproved(List<Student> students) throws HeadlessException {
        for (Student student : students) {
            if (student.getAverage() >= 7) {
                JOptionPane.showMessageDialog(null, student);
            }
        }
    }

    public static Student calculateAverage() throws NumberFormatException, HeadlessException {

        var name = JOptionPane.showInputDialog("Enter the name of student");
        var grade1 = Float.parseFloat(JOptionPane.showInputDialog("Type the student's first note"));
        var grade2 = Float.parseFloat(JOptionPane.showInputDialog("Type the student's second note"));
        var grade3 = Float.parseFloat(JOptionPane.showInputDialog("Type the student's third note"));
        Student student = new Student(name, grade1, grade2, grade3);

        if (student.getAverage() >= 7) {
            student.setSituation("PASS");
        } else {
            student.setSituation("FAILED");
        }

        JOptionPane.showMessageDialog(null, student);

        return student;

    }
}
