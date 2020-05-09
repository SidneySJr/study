package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author sidney
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<String> list;
        list = new ArrayList<>();

        list.add("Sidney");
        list.add("Renoá");
        list.add("Sidney");
        list.add("Renoá1");
        list.add(1, "João");

        list.forEach((x) -> {
            System.out.println(x);
        });
        System.out.println("-----------------\n");

        //list.remove("Sidney");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'S'); // Remova o predicado X "->(tal que)" onde o valor de X comece com a letra S; 
        System.out.println(list);

        System.out.println("-----------------\n");

        System.out.println("Index of João: " + list.indexOf("João"));
        System.out.println("Index of Sidney: " + list.indexOf("Sidney"));

        System.out.println("-----------------\n");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList()); // Seleciona apenas os elementos que começão com a letra R
        System.out.println(result);

        System.out.println("-----------------\n");
        
        String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null); // Encontrar o primeiro elemento com a letrar R
        System.out.println(name);
    }
}
