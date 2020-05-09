package entities;

/**
 * @author sidney
 */
public class Product {

    private static int cod;
    private String name;
    private double price;

    public Product() {
        cod++;
    }

    public Product(String name, double price) {
        cod++;
        this.name = name;
        this.price = price;
    }

    public static int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product"
                + "\nName: " + name
                + "\nPrice: " + String.format("%.2f", price);
    }

}
