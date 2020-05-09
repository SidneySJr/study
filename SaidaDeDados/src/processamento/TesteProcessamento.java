package processamento;

/**
 * @author renoa
 */
public class TesteProcessamento {

    public static void main(String[] args) {

        int x, y;
        double z;

        x = 5;
        y = 2 * x;
        z = y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        double b = 6;
        double B = 8;
        double h = 5;

        double area = ((b + B) / 2.0) * h;

        System.out.println(area);

        int a = 5;
        int c = 2;

        double resultado = (double) a / c; //(Casting) conversão explicita de tipo

        System.out.println(resultado);

    }
}
