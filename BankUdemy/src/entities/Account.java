package entities;

import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class Account {

    private static int cod;
    private User user;
    private int number;
    private double saldo;
    private boolean active;

    public Account() {
        cod++;
        this.number = (int) (Math.random() * 10000 - 999);
        this.active = true;
    }

    public Account(User user, double saldo) {
        cod++;
        this.user = user;
        this.number = (int) (Math.random() * 999 + 10000);
        this.saldo = saldo;
        this.active = true;
    }

    public static int getCod() {
        return cod;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Account:"
                + "\nUser: " + user
                + "\nNumber: " + number
                + "\nSaldo: " + String.format("%.2f", saldo)
                + "\nActive: " + active;
    }

}
