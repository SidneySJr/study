package entities;

/**
 * @author sidney
 */
public class Retangle {

    private double width;
    private double height;

    private double area() {
        return width * height;
    }

    private double perimeter() {
        return (width + height) * 2;
    }

    private double diagonal() {
        return Math.pow(width, 2) + Math.pow(height, 2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Retangle: "
                + "\n Width: " + width
                + "\n Height: " + height
                + "\n Area: " + String.format("%.2f", area())
                + "\n Perimetro: " + String.format("%.2f", perimeter())
                + "\n Diagonal: " + String.format("%.2f", diagonal());
    }

}
