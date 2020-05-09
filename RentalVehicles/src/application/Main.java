package application;

import entities.Vehicle;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import util.RentalVeicles;
import static util.RentalVeicles.createVehicles;

/**
 * @author renoa
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Vehicle> vehicles;
        vehicles = new ArrayList<>();

        menu(vehicles);

    }

    public static void menu(List<Vehicle> vehicles) {
        Integer menu;
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Rental of Vehicles"
                        + "Select a option"
                        + "\n 1-Rent vehicle"
                        + "\n 2-Insert vehicle"
                        + "\n 3-Remove vehicle"
                        + "\n 4-Available vehicles"));
            } catch (HeadlessException | NumberFormatException e) {
                menu = null;
            }
            if (menu != null) {
                switch (menu) {
                    case 1:
                        RentalVeicles.rentVehicle(vehicles);
                        break;
                    case 2:
                        vehicles.add(createVehicles());
                        break;
                    case 3:
                        vehicles.remove(RentalVeicles.removeVehicle(vehicles));
                        break;
                    case 4:
                        List<Vehicle> availableVehicles = RentalVeicles.carsAvailable(vehicles);
                        availableVehicles.forEach((availableVehicle) -> {
                            JOptionPane.showMessageDialog(null, availableVehicle);
                        });
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Not found");
                        break;
                }
            }
        } while (menu != null);
    }
}
