package application;

import entities.Product;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Product[] products;
        var total = 0.0;

        var numberOfProduct = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of products"));
        products = new Product[numberOfProduct];

        for (int i = 0; i < products.length; i++) {
            products[i] = createProduct();
            total += products[i].getPrice();
        }

        var averagePrice = total / numberOfProduct;

        JOptionPane.showMessageDialog(null, "The average price of products is: R$" + averagePrice);

    }

    public static Product createProduct() throws NumberFormatException, HeadlessException {
        Product product = new Product();
        product.setName(JOptionPane.showInputDialog("Enter the name of product"));
        product.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter the price of product R$")));

        return product;
    }
}
