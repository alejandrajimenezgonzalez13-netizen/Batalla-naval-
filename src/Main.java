//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println(" BATALLA NAVAL");

       String[][]tablero  = new String[5][5];

       //*Llenar el tablero *//
        for(int i =0; i< tablero.length; i++){
            for (int j=0; j < tablero[i].length; j++){
                tablero[i][j] = "~";
            }
        }

        //* Mostrar el tablero *//
        for(int i=0; i< tablero.length; i++){
            for(int j=0; j<tablero[i].length; j++ ){
                System.out.print(tablero[i][j] +" ");
            }
            System.out.println();
        }


        //* Colocar barcos *//
        tablero[1][2]= "B";
        tablero [3][4] = "B";

        for(int i=0; i< tablero.length; i++){
            for(int j=0; j< tablero[i].length; i++){

            }
        }






    }

}