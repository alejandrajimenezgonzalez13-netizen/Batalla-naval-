import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[][] tablero = new String[10][10];


        System.out.println("----------- --BATALLA NAVAL--------  ");

        System.out.println("""
                Instrucciones.
                1.~ = Agua.
                2.B = Barco.
                3.X = Impacto.
                4.O = Disparo fallido.
                """);
        System.out.println("Objetivo: encontrar y destruir todos los barcos ");

        System.out.println();

        //*Llenar el tablero *//
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ~ ";
            }
        }

        //* Mostrar numeros de las columnas *//
        System.out.print(" ");
        for (int j = 0; j < tablero[0].length; j++) {
            System.out.print(j + "   ");
        }
        System.out.println();



        //*Llenar el tablero *//
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " ~ ";
            }
        }

        // Crear los barcos*//
        tablero[2][3] = "B";
        tablero[2][4] = "B";
        tablero[5][6] = "B";

        //*Mostrar *//
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();


            // ===== Disparos ===== //

            Scanner teclado = new Scanner(System.in);

            System.out.print("Fila: ");
            int fila = teclado.nextInt();

            System.out.print("Columna: ");
            int columna = teclado.nextInt();


            // Revisar disparo
            if(tablero[fila][columna].equals("B")){

                System.out.println("¡Impacto!");

                tablero[fila][columna] = "X";

            }
            else{

                System.out.println("Disparo fallido");

                tablero[fila][columna] = "O";

            }
        }
    }
}