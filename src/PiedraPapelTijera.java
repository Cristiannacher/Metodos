import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static String aleatorio() {

        String[] maquina = {"Piedra", "Papel", "Tijera"};

        int aleatorio = (int) (Math.random() * maquina.length);

        return maquina[aleatorio];
    }

    public static String ganador(String jugadau, String jugadai) {

        String resultado;

        if (jugadau.equals("Piedra") && jugadai.equals("Papel")) {
            resultado = "IA";
        } else if (jugadau.equals("Piedra") && jugadai.equals("Tijera")) {
            resultado = "Usuario";
        } else if (jugadau.equals("Papel") && jugadai.equals("Piedra")) {
            resultado = "Usuario";
        } else if (jugadau.equals("Papel") && jugadai.equals("Tijera")) {
            resultado = "IA";
        } else if (jugadau.equals("Tijera") && jugadai.equals("Piedra")) {
            resultado = "IA";
        } else if (jugadau.equals("Tijera") && jugadai.equals("Papel")) {
            resultado = "Usuario";
        } else resultado = "Empate";

        return resultado;
    }

    public static void musestraEstadisticas(String[] jugadas) {

        int jugador = 0;
        int IA = 0;
        int empate = 0;
        int porjugador;
        int poria;
        int porempate;

        int piedra = 0;
        int papel = 0;
        int tijera = 0;
        int porpiedra;
        int portijera;
        int porpapel;

        for (int i = 0; i < jugadas.length - 1; i += 2) {
            if (ganador(jugadas[i], jugadas[i + 1]).equals("Usuario")) {
                jugador++;
            } else if (ganador(jugadas[i], jugadas[i + 1]).equals("IA")) {
                IA++;
            } else empate++;
        }
        porjugador = jugador * 20;
        poria = IA * 20;
        porempate = empate * 20;

        for (int i = 0; i < jugadas.length; i++) {
            switch (jugadas[i]) {
                case "Piedra": piedra++;
                break;
                case "Papel" : papel++;
                break;
                case "Tijera" : tijera++;
                break;
            }
        }
        porpiedra = piedra * 10;
        portijera = tijera * 10;
        porpapel = papel * 10;

        System.out.println("El jugador ha gandado " + porjugador + "%");
        System.out.println("La maquina ha gandado " + poria + "%");
        System.out.println("Han empatado un " + porempate + "%");
        System.out.println("Ha salido " + porpiedra + "%" + "piedra");
        System.out.println("Ha salido " + portijera + "%" + "tijera");
        System.out.println("Ha salido " + porpapel + "%" + "papel");
    }


    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce Piedra Papel o Tijera");

        String[] jugadas = new String[10];

        for (int i = 0; i < jugadas.length - 1; i += 2) {
            String jugador = introducir.next();
            String aleatorio = aleatorio();
            System.out.println(aleatorio);
            jugadas[i] = jugador;
            jugadas[i + 1] = aleatorio;
        }

        musestraEstadisticas(jugadas);
    }
}

