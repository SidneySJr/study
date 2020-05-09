package application;

import entities.Account;
import entities.User;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;
import util.CashMachine;

/**
 * @author sidney
 */
public class Main {

    private static Account account;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int menu;
        do {
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog("====== Bank Udemy ======"
                        + "\nSelect a option:"
                        + "\n 1- Create account"
                        + "\n 2- Cash machine"));
            } catch (HeadlessException | NumberFormatException e) {
                menu = 0;
            }

            switch (menu) {
                case 1:
                    account = createAccount();
                    break;
                case 2:
                    cashMachine();
                    break;
                default:
                    if (menu != 0) {
                        JOptionPane.showMessageDialog(null, "Not found");
                    }
                    break;
            }
        } while (menu != 0);

    }

    public static void cashMachine() throws HeadlessException {
        var menu = Integer.parseInt(JOptionPane.showInputDialog("====== Cash Machine ======"
                + "\n 1- Withdraw"
                + "\n 2- Deposit"
                + "\n 3- Verify account"));
        switch (menu) {
            case 1:
                var withdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for withdraw"));
                CashMachine.withdraw(account, withdraw);
                break;
            case 2:
                var deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for deposit"));
                CashMachine.deposit(account, deposit);
                break;
            case 3:
                verifyAccount(account);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Not found");
                break;

        }
    }

    public static Account createAccount() throws HeadlessException, NumberFormatException {
        User user = new User();
        user.setName(JOptionPane.showInputDialog("Enter your name"));
        user.setCpf(JOptionPane.showInputDialog("Enter your CPF"));
        user.setBirth(JOptionPane.showInputDialog("Type your birth (dd/mm/yyyy)"));

        Account accountLocal = new Account();
        accountLocal.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Enter your initial deposit")));
        accountLocal.setUser(user);

        return accountLocal;
    }

    public static void verifyAccount(Account account) {
        JOptionPane.showMessageDialog(null, account);
    }

}
