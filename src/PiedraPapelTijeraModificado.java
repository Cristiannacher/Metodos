import java.util.Scanner;

public class PiedraPapelTijeraModificado {

    public enum Jugadas {
        PIEDRA,
        PAPEL,
        TIJERA
    }

    public enum Participantes{
        USUARIO,
        IA,
        EMPATE
    }

    public static Jugadas aleatorio() {

        Jugadas[] maquina = {Jugadas.PIEDRA, Jugadas.PAPEL, Jugadas.TIJERA};

        int aleatorio = (int) (Math.random() * maquina.length);

        return maquina[aleatorio];
    }

    public static Participantes ganador(Jugadas jugadau, Jugadas jugadai) {

        Participantes resultado;

        if (jugadau.equals(Jugadas.PIEDRA) && jugadai.equals(Jugadas.PAPEL)) {
            resultado = Participantes.IA;
        } else if (jugadau.equals(Jugadas.PIEDRA) && jugadai.equals(Jugadas.TIJERA)) {
            resultado = Participantes.USUARIO;
        } else if (jugadau.equals(Jugadas.PAPEL) && jugadai.equals(Jugadas.PIEDRA)) {
            resultado = Participantes.USUARIO;
        } else if (jugadau.equals(Jugadas.PAPEL) && jugadai.equals(Jugadas.TIJERA)) {
            resultado = Participantes.IA;
        } else if (jugadau.equals(Jugadas.TIJERA) && jugadai.equals(Jugadas.PIEDRA)) {
            resultado = Participantes.IA;
        } else if (jugadau.equals(Jugadas.TIJERA) && jugadai.equals(Jugadas.PAPEL)) {
            resultado = Participantes.USUARIO;
        } else resultado = Participantes.EMPATE;

        return resultado;
    }

    public static void musestraEstadisticas(Jugadas[] jugadas) {

        int jugador = 0;
        int IA = 0;
        int empate = 0;
        double porjugador;
        double poria;
        double porempate;

        int piedra = 0;
        int papel = 0;
        int tijera = 0;
        double porpiedra;
        double portijera;
        double porpapel;

        for (int i = 0; i < jugadas.length - 1; i += 2) {
            if (ganador(jugadas[i], jugadas[i + 1]) == Participantes.USUARIO) {
                jugador++;
            } else if (ganador(jugadas[i], jugadas[i + 1]) == Participantes.IA) {
                IA++;
            } else empate++;
        }
        porjugador = jugador/(jugadas.length/2.0) *100;
        poria = IA/(jugadas.length/2.0) *100;
        porempate = empate/(jugadas.length/2.0) * 100;

        for (int i = 0; i < jugadas.length; i++) {
            switch (jugadas[i]) {
                case PIEDRA: piedra++;
                break;
                case PAPEL: papel++;
                break;
                case TIJERA: tijera++;
                break;
            }
        }
        porpiedra = piedra/(double) jugadas.length * 100;
        portijera = tijera/(double)jugadas.length * 100;
        porpapel = papel/(double)jugadas.length * 100;

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


        Jugadas[] jugadas = new Jugadas[10];
        // Para usar todos los metodos y que funcione el programa he utilizado un bucle que va de 2 en
        // porque son 10 jugadas pero solo 5 rondas i 2 jugadas por cada ronda.

        // El bucle empiza pidiendo la jugada al jugador, seguidamente se le asigna el resultado aleatorio a un
        // estring porque si nos al volver a utilizar aleatorio seria otro resultado, luego se imprime la jugada
        // de la ia por pantallañ.

        // Por ultimo se introduce la jugada del jugador (que siempre seran los numeros impares de la array)
        // y la jugada de la ia (que simpre seran los nomero pares de la array) en la array que utilizamos
        // en el metodo muestraestadisticas

        for (int i = 0; i < jugadas.length - 1; i += 2) {
            Jugadas jugador = Jugadas.valueOf(introducir.next().toUpperCase());
            Jugadas aleatorio = aleatorio();
            System.out.println(aleatorio);
            jugadas[i] = jugador;
            jugadas[i + 1] = aleatorio;
        }

        musestraEstadisticas(jugadas);
    }
}

