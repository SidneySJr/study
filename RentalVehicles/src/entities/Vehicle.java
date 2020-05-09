package entities;

/**
 * @author sidney
 */
public class Vehicle {

    private Integer id = count;
    private String brand;
    private Double value;
    private String color;
    private String plate;
    private Boolean situation;
    private static int count;
    private Integer occupants;

    public Vehicle() {
        count++;
        situation = true;
    }

    public Vehicle(String brand, Double value, String color, String plate, Integer occupants) {
        count++;
        this.brand = brand;
        this.value = value;
        this.color = color;
        this.plate = plate;
        this.situation = true;
        this.occupants = occupants;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Boolean getSituation() {
        return situation;
    }

    public void setSituation(Boolean situation) {
        this.situation = situation;
    }

    public Integer getOccupants() {
        return occupants;
    }

    public void setOccupants(Integer occupants) {
        this.occupants = occupants;
    }

    @Override
    public String toString() {
        return "Vehicles"
                + "\nId: " + id
                + "\nBrand: " + brand
                + "\nValue: " + String.format(".2f", value)
                + "\nColor: " + color
                + "\nPlate: " + plate
                + "\nSituation: " + situation
                + "\nOccupants: " + occupants;
    }

}
