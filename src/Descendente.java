import java.util.Scanner;

public class Descendente {

    public static void ascendente(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else if (num1 < num2){
            System.out.println(num2);
            System.out.println(num1);
        } else System.out.println("Los numeros son iguales");
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("introduce 2 numeros");
        int num1 = introducir.nextInt();
        int num2 = introducir.nextInt();

        ascendente(num1,num2);
    }
}
