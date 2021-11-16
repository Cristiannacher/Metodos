import java.util.Scanner;

public class Nota {

    public static void calificacion(int num){

        if ((num>=0) && (num<=2)){
            System.out.println("Muy Deficiente");
        } else if ((num>=3) && (num<=4)){
            System.out.println("Insuficiente");
        } else if (num==5){
            System.out.println("Suficiente");
        } else if (num==6){
            System.out.println("Bien");
        } else if ((num>=7) && (num<=8)){
            System.out.println("Notable");
        } else if ((num>=9) && (num<=10)){
            System.out.println("Sobresaliente");
        } else System.out.println("Eso no es un numero el 1 al 10");
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce una nota");
        int num = introducir.nextInt();

        calificacion(num);
    }
}
