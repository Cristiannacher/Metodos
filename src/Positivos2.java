import java.util.Scanner;

public class Positivos2 {

    public static int positivos2(int[] numeros){

        int contador = 0;

        for(int i = 0; i<numeros.length; i++){
            if(numeros [i]>0){
                contador++;
            }
        }
        return  contador;
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce 10 numeros");

        int[] numeros = new int[10];

        for(int i = 0; i<numeros.length; i++){
            int num = introducir.nextInt();
            numeros[i] = num;
        }
        System.out.println("Hay "+positivos2(numeros)+" numeros positivos");
    }
}
