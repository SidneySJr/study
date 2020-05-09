package entities;

/**
 * @author sidney
 */
public class Rent {

    private static int cod;
    private String name;
    private String email;
    private int roomNumber;

    public Rent() {
        cod++;
    }

    public Rent(String name, String email, int roomNumber) {
        cod++;
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Rent"
                + "\nName: " + name
                + "\nEmail: " + email
                + "\nRoomNumber: " + roomNumber;
    }

}
