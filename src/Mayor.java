import java.util.Scanner;

public class Mayor {

    public static void mayor() {
        System.out.println("Es mayor de edad");
    }

    public static void menor() {
        System.out.println("Es menor de edad");
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = introducir.nextInt();

        if(num>18){
            mayor();
        }else menor();
    }
}
