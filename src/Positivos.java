import java.util.Scanner;

public class Positivos {

    public static void positivos(int num) {

        if (num > 0) {
            System.out.println(num + " es positivo");
        } else if (num < 0) {
            System.out.println(num + " es negativo");
        } else System.out.println("0 es neutro");
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("introducre 10 numeros");

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            int num = introducir.nextInt();
            numeros[i] = num;
        }
        for (int i = 0; i < numeros.length; i++) {
            positivos(numeros[i]);
        }
    }
}
