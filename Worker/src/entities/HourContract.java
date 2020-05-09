package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sidney
 */
public class HourContract {
    
    private Integer id;
    private Date date;
    private Double valuePerHour;
    private Integer hours;
    
    public HourContract() {
    }
    
    public HourContract(String date, Double valuePerHour, Integer hours) throws ParseException {
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    
    public double totalValue() {
        return valuePerHour * hours;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(String date) throws ParseException {
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }
    
    public Double getValuePerHour() {
        return valuePerHour;
    }
    
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    
    public Integer getHours() {
        return hours;
    }
    
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    
    @Override
    public String toString() {
        return "HourContract"
                + "\nID: " + id
                + "\nDate: " + new SimpleDateFormat("MM/yyyy").format(date)
                + "\nValuePerHour: " + valuePerHour
                + "\nHours: " + hours;
    }
    
}
