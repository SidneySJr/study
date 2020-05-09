package util;

import entities.Account;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class CashMachine {

    double cash;

    public static void withdraw(Account account, Double withdraw) {
        
        
        if(withdraw < 0){
            JOptionPane.showMessageDialog(null, "Invalid value");
        }else{
            
        account.setSaldo(account.getSaldo() - withdraw);
        
        if (account.getSaldo() < 0) {
            account.setSaldo(account.getSaldo() + withdraw);
            JOptionPane.showMessageDialog(null, "Unrealized");
            JOptionPane.showMessageDialog(null, account);
        } else {
            JOptionPane.showMessageDialog(null, "Operation performed");
            JOptionPane.showMessageDialog(null, account);
        }
        }

    }

    public static void deposit(Account account, double deposit) {
        try {
            if (account.isActive()) {
                account.setSaldo(account.getSaldo() + deposit);
                JOptionPane.showMessageDialog(null, "Deposit made");
                JOptionPane.showMessageDialog(null, account);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Unrealized");
        }
    }

}
