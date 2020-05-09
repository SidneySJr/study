package foreach;

import javax.swing.JOptionPane;

/**
 * @author sidney
 */
public class ForEach {

    public static void main(String[] args) {

        String[] vect = new String[]{"Sidney", "Renoá"};
        
        for (String nome : vect) {
            System.out.println(nome);
        }

    }

}
