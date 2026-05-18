import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void mostrarMenu() {


        System.out.println("----------- --BATALLA NAVAL--------  ");
        System.out.println();
        System.out.println("Objetivo: encontrar y destruir todos los barcos ");
        System.out.println();

        System.out.println("""
                Menu
                1.Reglas.
                2.jugar.
                3.salir.
                """);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] tablero = new String[10][10];
        int opcionm = 0;
        int posicion = 0;


        while (opcionm != 3) {

            mostrarMenu();

            opcionm = teclado.nextInt();


            switch (opcionm) {
                case 1:
                    System.out.println("Reglas");
                    System.out.println("""
                            Instrucciones.
                            1.~ = Agua.
                            2.B = Barco.
                            3.X = Impacto.
                            4.O = Disparo fallido.
                            """);

                    System.out.println("Regresar al menu 1.");
                    opcionm = teclado.nextInt();

                    break;
                case 2:
                    int fila = 0;
                    int columna = 0;

                    System.out.println("----JUGAR----");
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

                    //* Mostrar numeros de columnas*//
                    System.out.print("");
                    for (int j = 0; j < tablero.length; j++) {
                        System.out.print(j + "    ");
                    }

                    System.out.println();

                    //*Mostrar el tablero ocultando barcos *//
                    for (int i = 0; i < tablero.length; i++) {
                        System.out.print(i + "   ");
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print("  ~ ");
                        }
                        System.out.println();
                    }

                    System.out.println("Ingrese la fila");
                    fila = teclado.nextInt();

                    System.out.println("ingrese la columna ");
                    columna = teclado.nextInt();


                    System.out.println("Regresar al menu 2.");
                    opcionm = teclado.nextInt();

                    break;
                case 3:

                    System.out.println(" Saliendo del juego....");
                    System.out.println(" Gracias por jugar Batalla Naval1");
                    System.out.println("Regresar al menu 3.");
                    opcionm = teclado.nextInt();

                    break;
            }





        }

    }

}


