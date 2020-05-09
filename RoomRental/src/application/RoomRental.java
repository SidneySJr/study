package application;

import entities.Rent;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class RoomRental {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rent[] roomRental = new Rent[10];

        menu(roomRental);

    }

    public static void menu(Rent[] roomRental) throws HeadlessException, NumberFormatException {
        int menu;
        
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Select option"
                        + "\n 1- Rent a room"
                        + "\n 2- Check rooms"));

            } catch (HeadlessException | NumberFormatException e) {
                menu = 0;
            }

            switch (menu) {
                case 1:
                    Rent rent = createReservation(roomRental, listOfRooms(roomRental));
                    try {
                        roomRental[rent.getRoomNumber() - 1] = rent;
                    } catch (Exception e) {

                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, listOfRooms(roomRental));
                    break;
                default:
                    if (menu != 0) {
                        JOptionPane.showMessageDialog(null, "Not found");
                    }
                    break;
            }

        } while (menu != 0);
    }

    public static String listOfRooms(Rent[] roomRental) {
        var listOfRooms = "";
        for (int i = 0; i < roomRental.length; i++) {
            if (roomRental[i] != null) {
                listOfRooms += "Room " + (i + 1) + " Occupied\n";
            } else {
                listOfRooms += "Room " + (i + 1) + " Free\n";
            }
        }
        return listOfRooms;
    }

    public static Rent createReservation(Rent[] roomRental, String listOfRooms) throws HeadlessException, NumberFormatException {
        Rent rent = new Rent();

        rent.setRoomNumber(selectingRoom(listOfRooms, roomRental));
        if (rent.getRoomNumber() != 0) {
            rent.setName(JOptionPane.showInputDialog("Enter the name of client"));
            rent.setEmail(JOptionPane.showInputDialog("Entre the email of client"));
            return rent;
        } else {
            return null;
        }
    }

    public static int selectingRoom(String listOfRooms, Rent[] roomRental) throws HeadlessException {

        int numberOfRoom = 0;
        try {
            do {

                numberOfRoom = (Integer.parseInt(JOptionPane.showInputDialog("Choise a room"
                        + "\n" + listOfRooms)));

                if (numberOfRoom > 0 && numberOfRoom <= 10) {
                    if (roomRental[numberOfRoom - 1] == null) {
                        return numberOfRoom;
                    } else {
                        JOptionPane.showMessageDialog(null, "Busy room");
                        return 0;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Room does not exist");
                    return 0;
                }

            } while (numberOfRoom == 0);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Exiting");
        }
        return numberOfRoom;
    }

}
