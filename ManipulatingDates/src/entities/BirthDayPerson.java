package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sidney
 */
public class BirthDayPerson {

    private String name;
    private Date birth;
    private Integer month;
    private final SimpleDateFormat sdf;

    public BirthDayPerson() {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    public BirthDayPerson(String name, String birth) throws ParseException {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.name = name;

        this.birth = sdf.parse(birth);
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.birth);
        month = cal.get(Calendar.MONTH) + 1;
    }

    public BirthDayPerson searchForName(List<BirthDayPerson> birthdays, String search) {
        BirthDayPerson birthday = birthdays.stream().filter(b -> b.getName().equals(search)).findFirst().orElse(null);
        return birthday;
    }

    public List<BirthDayPerson> searchForMonth(List<BirthDayPerson> birthdays, Integer search) {
        birthdays = birthdays.stream().filter(b -> b.getMonth().equals(search)).collect(Collectors.toList());
        return birthdays;
    }

    public Date getBirth() {
        return birth;
    }

    public Integer getMonth() {
        return month;
    }

    public void setBirth(String birth) throws ParseException {
        this.birth = sdf.parse(birth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BirthDayPerson"
                + "\nName: " + name
                + "\nBirth: " + sdf.format(birth);
    }

}
