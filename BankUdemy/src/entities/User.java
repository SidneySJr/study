package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class User {

    static int cod;
    String name;
    String cpf;
    Date birth;

    public User() {
        cod++;
    }

    public User(String name, String cpf, String birth) {
        cod++;
        this.name = name;
        try {
            if (cpf.length() == 11) {
                this.cpf = cpf;
            }
        } catch (Exception e) {
            e.notifyAll();
            JOptionPane.showMessageDialog(null, "Unrealized");
        }
        try {
            this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        } catch (ParseException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        try {
            this.birth = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        } catch (ParseException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "User:"
                + "\nName: " + name
                + "\nCpf: " + cpf
                + "\nBirth: " + new SimpleDateFormat("dd/MM/yyyy").format(birth);
    }

}
