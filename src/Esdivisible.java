import java.util.Scanner;

public class Esdivisible {

    public static boolean esDivisible(int num1, int num2){
        return (num1%num2 == 0);
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce 2 numeros");
        int num1 = introducir.nextInt();
        int num2 = introducir.nextInt();

        System.out.println(esDivisible(num1,num2));


    }
}
