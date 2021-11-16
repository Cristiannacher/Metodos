import java.util.Scanner;

public class NumMayor {

    public static void numeroMayor(int[] numeros1) {

        int mayor = numeros1[0];

        for (int i = 0; i < 3; i++) {
            if (mayor < numeros1[i]) {
                mayor = numeros1[i];
            }
        }
        System.out.println(mayor);
    }


    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            int num = introducir.nextInt();
            numeros[i] = num;
        }
        numeroMayor(numeros);
    }
}
