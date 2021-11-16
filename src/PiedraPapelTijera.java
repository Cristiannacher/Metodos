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
        double porjugador;
        double poria;
        double porempate;

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
        porjugador = jugador/(jugadas.length/2.0) *100;
        poria = IA/(jugadas.length/2.0) *100;
        porempate = empate/(jugadas.length/2.0) * 100;

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
        porpiedra = piedra/jugadas.length + 100;
        portijera = tijera/jugadas.length + 100;
        porpapel = papel/jugadas.length + 100;

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
        // Para usar todos los metodos y que funcione el programa he utilizado un bucle que va de 2 en
        // porque son 10 jugadas pero solo 5 rondas i 2 jugadas por cada ronda.

        // El bucle empiza pidiendo la jugada al jugador, seguidamente se le asigna el resultado aleatorio a un
        // estring porque si nos al volver a utilizar aleatorio seria otro resultado, luego se imprime la jugada
        // de la ia por pantallañ.

        // Por ultimo se introduce la jugada del jugador (que siempre seran los numeros impares de la array)
        // y la jugada de la ia (que simpre seran los nomero pares de la array) en la array que utilizamos
        // en el metodo muestraestadisticas

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

