package application;

import entities.Product;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author renoa
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products;
        Product product;
        products = new ArrayList<>();

        do {

            var option = Integer.parseInt(JOptionPane.showInputDialog("Products system: "
                    + "\n 1 - New products"
                    + "\n 2 - Add quantity"
                    + "\n 3 - Remove quantity"
                    + "\n 4 - Check products"));

            switch (option) {
                case 1:
                    product = createProduct();
                    products.add(product);
                    break;
                case 2:
                    String searchInsert = JOptionPane.showInputDialog("Enter the name of produtc");

                    products.stream().filter((product1) -> (product1.getName().equals(searchInsert))).forEachOrdered((product1) -> {
                        var quantityInsert = Integer.parseInt(JOptionPane.showInputDialog("Quantity"));
                        product1.addProducts(quantityInsert);
                        JOptionPane.showMessageDialog(null, product1.toString());
                    });

                    break;
                case 3:
                    String searchRemove = JOptionPane.showInputDialog("Enter the name of product");

                    products.stream().filter((product1) -> (product1.getName().equals(searchRemove))).forEachOrdered((product1) -> {
                        var quantityRemove = Integer.parseInt(JOptionPane.showInputDialog("Quantity"));
                        product1.removeProducts(quantityRemove);
                        JOptionPane.showMessageDialog(null, product1.toString());
                    });
                    break;
                case 4:

            }

        } while (true);
    }

    public static Product createProduct() throws HeadlessException, NumberFormatException {
        Product product;
        
        JOptionPane.showMessageDialog(null, "Enter the product data: ");
        var name = JOptionPane.showInputDialog("Name: ");
        var price = Double.parseDouble(JOptionPane.showInputDialog("Price: "));
        var quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity: "));

        product = new Product(name, price, quantity);

        return product;
    }

}
