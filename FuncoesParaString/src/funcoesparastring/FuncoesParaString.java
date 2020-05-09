package funcoesparastring;

/**
 * @author renoa
 */
public class FuncoesParaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String original = "String Original   ";

        String s01 = original.toUpperCase();
        String s02 = original.toLowerCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('n', 'x');
        String s07 = original.replace("Original", "Alterada");
        int i = original.indexOf("in");
        int lastI = original.lastIndexOf("in");

        System.out.println("Original: - " + original + "-");
        System.out.println("toUpperCase: - " + s01 + "-");
        System.out.println("toLowerCase: - " + s02 + "-");
        System.out.println("trim: - " + s03 + "-");
        System.out.println("substring(2): - " + s04 + "-");
        System.out.println("substring(2, 9): - " + s05 + "-");
        System.out.println("replace('n', 'x'): - " + s06 + "-");
        System.out.println("replace(Original, Alterada): - " + s07 + "-");
        System.out.println("indexOf(in): - " + i + "-");
        System.out.println("lastIndexOf(in): - " + lastI + "-");

        System.out.println("");

        String s = "Algumas funçoes para trabalhar com Strings";
        System.out.println("Original: " + s + "\n");

        String[] vect = s.split(" ");

        for (int indice = 0; indice < vect.length; indice++) {
            System.out.println(indice + " " + vect[indice] + "\n");
        }
    }

}
