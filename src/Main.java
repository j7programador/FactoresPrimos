
import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("¡Este programa haya los factores primos de un numero!");
        System.out.println("############### Ingrese el número: ##################");

        long numero = scanner.nextLong();
        boolean esPrimo;

        for(int i = 2; i < numero; i++) {
            esPrimo = true;
            if (numero % i == 0) {
                for (int j = 3; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if(esPrimo) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
