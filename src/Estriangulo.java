import java.util.Scanner;

public class Estriangulo {

    public static boolean esTriangulo(int num1, int num2, int num3) {

        boolean triangulo = true;

        if (num1 > num2 + num3) {
            triangulo = false;
        } else if (num2 > num1 + num3) {
            triangulo = false;
        } else if (num3 > num1 + num2) {
            triangulo = false;
        }
        return triangulo;
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        int num1 = introducir.nextInt();
        int num2 = introducir.nextInt();
        int num3 = introducir.nextInt();

        System.out.println(esTriangulo(num1, num2, num3));
    }
}
