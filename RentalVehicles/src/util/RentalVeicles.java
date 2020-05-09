package util;

import entities.Vehicle;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class RentalVeicles {

    public static Vehicle createVehicles() {
        Vehicle vehicles = new Vehicle();

        vehicles.setBrand(JOptionPane.showInputDialog("Enter vehicle brand"));
        vehicles.setValue(Double.parseDouble(JOptionPane.showInputDialog("Enter the rental value")));
        vehicles.setColor(JOptionPane.showInputDialog("Enter the color of vehicle"));
        vehicles.setPlate(JOptionPane.showInputDialog("insert the vehicle plate"));
        vehicles.setOccupants(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of occupants")));

        return vehicles;
    }

    public static void rentVehicle(List<Vehicle> vehicles) {
        
        var id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id of vehicle"));
        Vehicle vehicle = vehicles.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
        vehicle.setSituation(true);
        
    }

    public static int removeVehicle(List<Vehicle> vehicles) {

        var id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id of vehicle"));
        Vehicle vehicle = vehicles.stream().filter(v -> v.getId() == id).findFirst().orElse(null);

        return vehicle.getId();
    }

    public static List<Vehicle> carsAvailable(List<Vehicle> vehicles) {
        List<Vehicle> availableVehicles = vehicles.stream().filter(v -> v.getSituation().equals(false)).collect(Collectors.toList());

        return availableVehicles;
    }
}
