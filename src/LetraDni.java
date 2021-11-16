import java.util.Scanner;

public class LetraDni {

    public static char letraDni(int dni){

        int division = dni % 23;

        char letra = ' ';

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E',};

        letra = letras[division];
        return letra;
    }

    public static void main(String[] args) {

        Scanner introducri = new Scanner(System.in);
        System.out.println("Introduce un DNI valido sin letra");
        int dni = introducri.nextInt();

        System.out.println("El DNI completo es "+dni+ letraDni(dni));
    }
}
