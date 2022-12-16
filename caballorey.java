import java.util.Scanner;

public class caballorey {
    private static Scanner sc = new Scanner(System.in);
    private static String letraF;
    private static String posicion;
    private static String[][] tab = {
            {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
            {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
            {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
            {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}
    };

    public static String RecorrerArray(String[][] tab2) {
        int error = 0;
        System.out.println("Ficha: ");
        letraF = sc.nextLine();
        System.out.println("Posición: ");
        posicion = sc.nextLine();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (posicion.equals(tab[i][j])) {
                    error++;
                }
            }
        }
        if (error == 1) {
            System.out.println("BIEN");
        } else {
            System.out.println("ERROR");
        }
        return "";
    }

    public static String Caballo(String[][] tab2, String pos2) {
        String p = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                p = tab2[i][j];
                if (p.charAt(0) == pos2.charAt(0) && p.charAt(1) == pos2.charAt(1)){
                    System.out.println("El Caballo se puede mover hacia " + tab2[i - 1][j - 2] + ", " + tab2[i + 1][j - 2] + ", " + tab2[i - 2][j - 1] + ", " + tab2[i + 2][j - 1] + ", " + tab2[i - 2][j + 1] + ", " + tab2[i + 2][j + 1] + ", " + tab2[i - 1][j + 2] + ", " + tab2[i + 1][j + 2]);
                }

            }
        }
        return "";
    }

    public static String Rey(String[][] tab3, String position) {
        String d = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                d = tab3[i][j];
                if (d.charAt(0) == position.charAt(0) && d.charAt(1) == position.charAt(1)){
                    System.out.println("El Rey se puede mover hacia " + tab3[i - 1][j + 1] + ", " + tab3[i][j + 1] + ", " + tab3[i + 1][j + 1] + ", " + tab3[i - 1][j - 1] + ", " + tab3[i][j - 1] + ", " + tab3[i + 1][j - 1] + ", " + tab3[i - 1][j] + ", " + tab3[i + 1][j]);
                }

            }
        }
        return " ";
    }

    public static void main(String[] args) {
        RecorrerArray(tab);
        Caballo(tab, posicion);
        Rey(tab, posicion);


    }
}

