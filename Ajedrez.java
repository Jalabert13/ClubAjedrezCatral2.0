
import java.util.Scanner;

    public class Ajedrez {
        static String letraF;
        static String posicion;
        static String blancas = "";
        static String[][] tab = {
                {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
                {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
                {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
                {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
                {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
                {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
                {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
                {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}
        };
        public static String inicio() {
            int cont = 0;
            int error = 0;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("¡¡Buenas!!");
                System.out.println("P-Peón");
                System.out.println("T-Torre");
                System.out.println("C-Caballo");
                System.out.println("A-Álfil");
                System.out.println("R-Rey");
                System.out.println("D-Dama");
                System.out.println("¿Qué pieza quieres situar en el tablero?");
                letraF = sc.nextLine();
                switch (letraF) {
                    case "P", "p": {
                        cont = 1;
                        System.out.println("Ejecutando el peón.");
                        break;
                    }
                    case "T", "t": {
                        cont = 1;
                        System.out.println("Ejecutando la torre.");
                        break;
                    }
                    case "C", "c": {
                        cont = 1;
                        System.out.println("Ejecutando el caballo.");
                        break;
                    }
                    case "A", "a": {
                        cont = 1;
                        System.out.println("Ejecutando el álfil.");
                        break;
                    }
                    case "R", "r": {
                        cont = 1;
                        System.out.println("Ejecutando el rey.");
                        break;
                    }
                    case "D", "d": {
                        cont = 1;
                        System.out.println("Ejecutando la dama.");
                        break;
                    }
                    default: {
                        System.out.println("ERROR, no puedes poner otra letra que no sea las pedidas. Gracias");
                        break;
                    }
                }
            } while (cont == 0);
            //PARA SACAR LAS BLANCAS O LAS NEGRAS.
            do {
                System.out.println("¿Quieres usar las blancas o las negras? (B/N)");
                blancas = sc.next();
                if (blancas.equals("N") || blancas.equals("B")) {
                    System.out.println("Vas a jugar con " + blancas);
                    error++;
                } else {
                    System.out.println("Error, tienes que elegir (B/N).");
                }
            } while (error == 0);
            //PARA SACAR LA POSICIÓN.
            error = 0;
            do {
                System.out.println("Posición: ");
                posicion = sc.next();
                for (int i = 0; i < 8; i++) {
                    for (int o = 0; o < 8; o++) {
                        if (posicion.equals(tab[i][o])) {
                            error++;
                        }
                    }
                }
                if (error == 1) {
                    return "La posición es " + posicion;
                } else {
                    System.out.println("ERROR, esa posición no existe.");
                }
            }while (error != 1);
            return "";
        }

static String Reina() {
    String letras = "abcdefgh";
    String numeros = "12345678";
    String let = posicion.substring(0,1);
    String num = posicion.substring(1,2);
    int l = letras.indexOf(let);
    int n = Integer.parseInt(num);
    int opn = 8 - n;
    String mov = "";
    int opn2 = opn;
    int opn3 = 9 - opn;
    System.out.println(opn3);
    for (int i = 0; i < numeros.length(); i++){
        if (tab[i][l] != posicion) {
            mov += " " + tab[i][l] + " ";
        }
    }
    for (int i = 0; i < letras.length(); i++){
        if (tab[i][l] != posicion) {
            mov += " " + tab[opn2][i] + " ";
        }
    }
    String d;
    for (int i = 0; i < 8; i++) {
        for (int o = 0; o < 8; o++) {
            d = tab[i][o];
            if (d.charAt(0) == posicion.charAt(0) && d.charAt(1) == posicion.charAt(1)){
                for (int u = 0; u < 8; u++) {
                    try {
                        mov += " " + tab[i + u][o + u] + " ";
                    }catch (ArrayIndexOutOfBoundsException e){

                    }
                }
                for (int a = 0; a < 8; a++) {
                    try {
                        mov += " " + tab[i - a][o - a] + " ";
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                }
                for (int b = 0; b < 8; b++) {
                    try {
                        mov += " " + tab[i + b][o - b] + " ";
                    }catch (ArrayIndexOutOfBoundsException e){

                    }
                }
                for (int c = 0; c < 8; c++) {
                    try {
                        mov += " " + tab[i - c][o + c] + " ";
                    }catch (ArrayIndexOutOfBoundsException e){

                    }
                }
            }
        }
    }

    return "Los movimientos que podría hacer son " + mov;
}


        public static String Alfil(){
            String letras = "abcdefgh";
            String numeros = "12345678";
            String let = posicion.substring(0,1);
            String num = posicion.substring(1,2);
            int l = letras.indexOf(let);
            int n = Integer.parseInt(num);
            int opn = 8 - n;
            int opn2 = opn;
            int opn3 = 8 - opn;
            System.out.println(opn3);




            return " ";
        }

        public static String Torre () {
            //String posarray = tab[opn][l];
            String letras = "abcdefgh";
            String numeros = "12345678";
            String let = posicion.substring(0,1);
            String num = posicion.substring(1,2);
            int l = letras.indexOf(let);
            int n = Integer.parseInt(num);
            int opn = 8 - n;
            String mov = "";
            int opn2 = opn;
            int opn3 = 9 - opn;
            System.out.println(opn3);
            for (int i = 0; i < numeros.length(); i++){
                mov += " " + tab[i][l] + " ";
            }
            for (int i = 0; i < letras.length(); i++){
                mov += " " + tab[opn2][i] + " ";
            }
            return "Los movimientos que podría hacer son " + mov;
        }

        static String Peon(){
            String letras = "abcdefgh";
            String let = posicion.substring(0, 1);
            String num = posicion.substring(1, 2);
            int l = letras.indexOf(let);
            int n = Integer.parseInt(num);
            int opn = 8 - n;
            String mov = "";
            if (blancas.equals("B")) {
                if (num.equals("2")) {
                    for (int i = 0; i < 2; i++) {
                        opn--;
                        mov += " " + tab[opn][l] + " ";
                    }
                } else if (num.equals("1")) {
                    System.out.println("El peon no puede estar en la casilla " + posicion);
                    mov += "0";
                } else if (num.equals("8")) {
                    System.out.println("El peon no puede avanzar mas de la casilla " + posicion);
                    mov += "0";
                } else
                    for (int i = 0; i < 1; i++) {
                        opn--;
                        mov += " " + tab[opn][l] + " ";
                    }
            }else {
                if (num.equals("7")) {
                    for (int i = 7; i > 5; i--) {
                        opn--;
                        mov += " " + tab[opn][l] + " ";
                    }
                } else if (num.equals("8")) {
                    System.out.println("El peon no puede estar en la casilla " + posicion);
                    mov += 0;
                } else if (num.equals("1")) {
                    System.out.println("El peon no puede avanzar mas de la casilla " + posicion);
                    mov += "0";
                } else
                    for (int i = 0; i < 1; i++) {
                        opn--;
                        mov += " " + tab[opn][l] + " ";
                    }
            }
            return "Los movimientos que podría hacer son " + mov;
        }








        public static void main(String[] args) {
            Ajedrez fin = new Ajedrez();
            System.out.println(inicio());
            System.out.println(Reina());
            /*System.out.println(Peon());*/ //HECHO
            /*System.out.println(Torre());*/ //HECHO
            System.out.println(Alfil());
        }

    }

