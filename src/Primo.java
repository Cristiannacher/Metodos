import java.util.Scanner;

public class Primo {

    public static boolean esPrimo(int  num) {

        boolean esprimo = true;

        if (num % 2 == 0 && num != 2) {
            esprimo = false;
        } else {
            for (int i = 3; i <num/2; i++) {
                if ( num % i == 0) {
                    esprimo = false;
                }
            }
        }
        return esprimo;

    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es primo");
        int num = introducir.nextInt();

        if (esPrimo(num)) {
            System.out.println("El numero " + num + " es primo");
        } else System.out.println("El numero " + num + " no es primo");


    }
}
