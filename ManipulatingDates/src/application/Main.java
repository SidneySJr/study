package application;

import entities.BirthDayPerson;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) throws HeadlessException, ParseException {

        Locale.setDefault(Locale.US);

        List<BirthDayPerson> birthdays;
        birthdays = new ArrayList<>();

        menu(birthdays);

    }

    public static void menu(List<BirthDayPerson> birthdays) throws HeadlessException, ParseException {
        Integer menu;
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Birthdays"
                        + "\nSelect a option"
                        + "\n 1- Insert birthday"
                        + "\n 2- Check birthday"
                        + "\n 3- Alter birthday"));
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }

            if (menu != null) {
                switch (menu) {
                    case 1:
                        birthdays.add(createBirthday());
                        break;
                    case 2:
                        checkBirthday(birthdays);
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
            }
        } while (menu != null);
    }

    public static void checkBirthday(List<BirthDayPerson> birthdays) throws HeadlessException, ParseException {
        var search = JOptionPane.showInputDialog("Insert the name or month of birthday");
        BirthDayPerson birthday = new BirthDayPerson();
        try {
            if (Integer.parseInt(search) > 0 && Integer.parseInt(search) < 13) {
                birthdays = birthday.searchForMonth(birthdays, Integer.parseInt(search));
                for (BirthDayPerson birthday1 : birthdays) {
                    calculateTime(birthday1);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            birthday = birthday.searchForName(birthdays, search);
            calculateTime(birthday);
        }
    }

    public static void calculateTime(BirthDayPerson birthday) throws HeadlessException {

        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        cal.setTime(date);
        var day = cal.get(Calendar.DAY_OF_MONTH);
        var month = cal.get(Calendar.MONTH);
        var year = cal.get(Calendar.YEAR);

        cal.setTime(birthday.getBirth());
        var day2 = cal.get(Calendar.DAY_OF_MONTH);
        var month2 = cal.get(Calendar.MONTH);
        var year2 = cal.get(Calendar.YEAR);
        if (month2 < month) {
            JOptionPane.showMessageDialog(null, "You already made the birthday this year");
        } else if (month == month2 && day == day2) {
            JOptionPane.showMessageDialog(null, "Congratulations today is your birthday");
        } else {
            day2 -= day;
            month2 -= month;
            year -= year2;
            JOptionPane.showMessageDialog(null, "For " + birthday.getName() + " missing"
                    + "\n" + month2 + " Months"
                    + "\n" + day2 + " Days"
                    + "\nturn to " + year + "years");
        }
    }

    public static BirthDayPerson createBirthday() throws HeadlessException, ParseException {
        var name = JOptionPane.showInputDialog("Insert the name of birthday");
        var birth = JOptionPane.showInputDialog("Insert the birth of birthday");
        BirthDayPerson birthday = new BirthDayPerson(name, birth);
        return birthday;
    }
}
