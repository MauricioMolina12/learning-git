package sudoku;

import java.util.*;

public class sudoku {

    public static void Sod(int Vec[][], int dif) {

        switch (dif) {
            case 1: //SODUKU FACIL
                Vec[0][3] = 9;
                Vec[0][8] = 6;
                Vec[1][0] = 5;
                Vec[1][8] = 9;
                Vec[2][1] = 4;
                Vec[2][6] = 1;
                Vec[3][2] = 6;
                Vec[3][4] = 3;
                Vec[3][5] = 1;
                Vec[3][6] = 9;
                Vec[3][8] = 8;
                Vec[4][0] = 2;
                Vec[4][3] = 5;
                Vec[4][5] = 9;
                Vec[4][8] = 7;
                Vec[5][0] = 8;
                Vec[5][2] = 3;
                Vec[5][3] = 7;
                Vec[5][4] = 4;
                Vec[5][6] = 2;
                Vec[6][2] = 8;
                Vec[6][7] = 5;
                Vec[7][0] = 9;
                Vec[7][8] = 4;
                Vec[8][0] = 6;
                Vec[8][5] = 5;
                break;
            case 2: //SODUKU NORMAL
                Vec[0][1] = 8;
                Vec[0][3] = 5;
                Vec[0][6] = 7;
                Vec[1][1] = 2;
                Vec[1][5] = 7;
                Vec[1][8] = 9;
                Vec[2][4] = 4;
                Vec[2][5] = 9;
                Vec[2][8] = 3;
                Vec[3][2] = 4;
                Vec[3][4] = 2;
                Vec[3][6] = 6;
                Vec[4][1] = 9;
                Vec[4][7] = 5;
                Vec[5][2] = 5;
                Vec[5][4] = 1;
                Vec[5][6] = 9;
                Vec[6][0] = 7;
                Vec[6][3] = 4;
                Vec[6][4] = 6;
                Vec[7][0] = 2;
                Vec[7][3] = 1;
                Vec[7][7] = 3;
                Vec[8][2] = 8;
                Vec[8][5] = 3;
                Vec[8][7] = 6;
                break;
            case 3: //SODUKU DIFICIL
                Vec[0][2] = 7;
                Vec[0][4] = 2;
                Vec[1][1] = 5;
                Vec[1][2] = 8;
                Vec[1][5] = 3;
                Vec[1][6] = 4;
                Vec[2][5] = 4;
                Vec[2][7] = 7;
                Vec[2][8] = 1;
                Vec[3][2] = 5;
                Vec[3][5] = 8;
                Vec[3][7] = 1;
                Vec[3][8] = 7;
                Vec[4][0] = 7;
                Vec[4][3] = 9;
                Vec[4][5] = 6;
                Vec[4][8] = 8;
                Vec[5][0] = 3;
                Vec[5][1] = 8;
                Vec[5][3] = 5;
                Vec[5][6] = 6;
                Vec[6][0] = 5;
                Vec[6][1] = 3;
                Vec[6][3] = 7;
                Vec[7][2] = 6;
                Vec[7][3] = 3;
                Vec[7][6] = 7;
                Vec[7][7] = 9;
                Vec[8][4] = 5;
                Vec[8][6] = 1;
                break;
            case 4: //SODUKU MUY DIFICIL
                Vec[0][1] = 1;
                Vec[0][7] = 9;
                Vec[1][0] = 8;
                Vec[1][1] = 4;
                Vec[1][5] = 2;
                Vec[2][3] = 3;
                Vec[2][4] = 8;
                Vec[2][6] = 2;
                Vec[3][3] = 9;
                Vec[3][6] = 8;
                Vec[3][7] = 5;
                Vec[3][8] = 3;
                Vec[5][0] = 5;
                Vec[5][1] = 3;
                Vec[5][2] = 8;
                Vec[5][5] = 6;
                Vec[6][2] = 1;
                Vec[6][4] = 7;
                Vec[6][5] = 9;
                Vec[7][3] = 5;
                Vec[7][7] = 6;
                Vec[7][8] = 7;
                Vec[8][1] = 2;
                Vec[8][8] = 9;
                break;
        }
    }

    public static void Emat(int Vec[][]) {
        int i, j, count = 0, count2 = 0;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                System.out.print(Vec[i][j] + "\t");
                count++;
                if (count % 3 == 0 && count % 9 != 0) {
                    System.out.print("|\t");
                }
            }
            System.out.println("");
            count2++;
            if (count2 % 3 == 0 && count2 % 9 != 0) {
                System.out.print("------------------------+-------------------------------+-------------------------");
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random rnd = new Random();
        int opc = 0, opc3, gdificulty = 0, i, j, punt = 0;
        String name = "Pedro";
        boolean zero = true;
        Player Player1 = new Player(gdificulty, punt, name);
        do {
            System.out.println("¡Bienvenido a Sudoku!");
            System.out.println("Seleccione una opción");
            System.out.println("1. Comenzar a jugar");
            System.out.println("2. Instrucciones");
            System.out.println("3. Puntuaciones");
            System.out.println("4. Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1: //HACER LOS PROCESOS DEL JUEGO
                    int game[][] = new int[9][9];

                    //ELEJIR DIFICULTAD
                    do {
                        System.out.println("\nSeleccione La dificultad");
                        System.out.println("1. Facil");
                        System.out.println("2. Intermedio");
                        System.out.println("3. Dificil");
                        System.out.println("3. Muy dificil");
                        opc3 = read.nextInt();

                        switch (opc3) {
                            case 1:
                                gdificulty = 1;
                                System.out.println("Dificultad facil seleccionada\n");
                                break;
                            case 2:
                                gdificulty = 2;
                                System.out.println("Dificultad intermedia seleccionada\n");
                                break;
                            case 3:
                                gdificulty = 3;
                                System.out.println("Dificultad dificil seleccionada\n");
                                break;
                            case 4:
                                gdificulty = 4;
                                System.out.println("Dificultad muy dificil seleccionada\n");
                                break;
                            default:
                                System.out.println("Opcion errada o salió del menú");
                        }
                    } while (opc3 > 4);

                    Sod(game, gdificulty); // ESCRIBIR EL SUDOKU SEGUN LA DIFICULTAD
// CONTADOR DE 0´S
                    int cont = 0;
                    if (gdificulty == 1) {
                        for (i = 0; i < 9; i++) {
                            for (j = 0; j < 9; j++) {
                                if (game[i][j] == 0) {
                                    cont++;
                                }
                            }

                        }
                        punt = cont * 3;
                    } else if (gdificulty == 2) {
                        for (i = 0; i < 9; i++) {
                            for (j = 0; j < 9; j++) {
                                if (game[i][j] == 0) {
                                    cont++;
                                }
                            }

                        }
                        punt = cont * 5;
                    } else if (gdificulty == 3) {
                        for (i = 0; i < 9; i++) {
                            for (j = 0; j < 9; j++) {
                                if (game[i][j] == 0) {
                                    cont++;
                                }
                            }

                        }
                        punt = cont * 7;
                    } else if (gdificulty == 4) {
                        for (i = 0; i < 9; i++) {
                            for (j = 0; j < 9; j++) {
                                if (game[i][j] == 0) {
                                    cont++;
                                }
                            }

                        }
                        punt = cont * 9;
                    }
                    Emat(game); // ESCRIBIR MATRIZ
// PROCESOS DE COLOCACION DE NUMEROS
                    do {
                        boolean rep = false;
                        boolean numV = false;
                        do {
                            System.out.println("Ingrese fila: ");
                            int f = read.nextInt();
                            System.out.println("Ingrese Columna: ");
                            int c = read.nextInt();
                            System.out.println("Numero: ");
                            int aux = read.nextInt();
// CODIGO PARA NO CAMBIAR NUMEROS PREESCRITOS
// JUEGO FACIL
                            if (gdificulty == 1 && ((f == 0 && c == 3) || (f == 0 && c == 8) || (f == 1 && c == 0) || (f == 1 && c == 8) || (f == 2 && c == 1) || (f == 2 && c == 6) || (f == 3 && c == 2) || (f == 3 && c == 4) || (f == 3 && c == 5) || (f == 3 && c == 6) || (f == 3 && c == 8) || (f == 4 && c == 0) || (f == 4 && c == 3) || (f == 4 && c == 5) || (f == 4 && c == 8) || (f == 5 && c == 0) || (f == 5 && c == 2) || (f == 5 && c == 3) || (f == 5 && c == 4) || (f == 5 && c == 6) || (f == 6 && c == 2) || (f == 6 && c == 7) || (f == 7 && c == 0) || (f == 7 && c == 8) || (f == 8 && c == 0) || (f == 8 && c == 5))) {
                                rep = true;
                                numV = true;
                                System.out.println("Este numero no se puede cambiar");
                            }
// JUEGO NORMAL
                            if (gdificulty == 2 && ((f == 0 && c == 1) || (f == 0 && c == 3) || (f == 0 && c == 6) || (f == 1 && c == 1) || (f == 1 && c == 5) || (f == 1 && c == 8) || (f == 2 && c == 4) || (f == 2 && c == 5) || (f == 2 && c == 8) || (f == 3 && c == 2) || (f == 3 && c == 4) || (f == 3 && c == 6) || (f == 4 && c == 1) || (f == 4 && c == 7) || (f == 5 && c == 2) || (f == 5 && c == 4) || (f == 5 && c == 6) || (f == 6 && c == 0) || (f == 6 && c == 3) || (f == 6 && c == 4) || (f == 7 && c == 0) || (f == 7 && c == 3) || (f == 7 && c == 7) || (f == 8 && c == 2) || (f == 8 && c == 5) || (f == 8 && c == 7))) {
                                rep = true;
                                numV = true;
                                System.out.println("Este numero no se puede cambiar");
                            }
// JUEGO DIFICIL
                            if (gdificulty == 3 && ((f == 0 && c == 2) || (f == 0 && c == 4) || (f == 1 && c == 1) || (f == 1 && c == 2) || (f == 1 && c == 5) || (f == 1 && c == 6) || (f == 2 && c == 5) || (f == 2 && c == 7) || (f == 2 && c == 8) || (f == 3 && c == 2) || (f == 3 && c == 5) || (f == 3 && c == 7) || (f == 3 && c == 8) || (f == 4 && c == 0) || (f == 4 && c == 3) || (f == 4 && c == 5) || (f == 4 && c == 8) || (f == 5 && c == 0) || (f == 5 && c == 1) || (f == 5 && c == 3) || (f == 5 && c == 6) || (f == 6 && c == 0) || (f == 6 && c == 1) || (f == 6 && c == 3) || (f == 7 && c == 2) || (f == 7 && c == 3) || (f == 7 && c == 6) || (f == 7 && c == 7) || (f == 8 && c == 4) || (f == 8 && c == 6))) {
                                rep = true;
                                numV = true;
                                System.out.println("Este numero no se puede cambiar");
                            }
// JUEGO MUY DIFICIL
                            if (gdificulty == 4 && ((f == 0 && c == 1) || (f == 0 && c == 7) || (f == 1 && c == 0) || (f == 1 && c == 1) || (f == 1 && c == 5) || (f == 2 && c == 3) || (f == 2 && c == 4) || (f == 2 && c == 6) || (f == 3 && c == 3) || (f == 3 && c == 6) || (f == 3 && c == 7) || (f == 3 && c == 8) || (f == 5 && c == 0) || (f == 5 && c == 1) || (f == 5 && c == 2) || (f == 5 && c == 5) || (f == 6 && c == 2) || (f == 6 && c == 4) || (f == 6 && c == 5) || (f == 7 && c == 3) || (f == 7 && c == 7) || (f == 7 && c == 8) || (f == 8 && c == 1) || (f == 8 && c == 8))) {
                                rep = true;
                                numV = true;
                                System.out.println("Este numero no se puede cambiar");
                            }
// CODIGO PARA VERIFICAR EN 3x3
                            int fIni = 0, fFin = 0, cIni = 0, cFin = 0;
                            if (f >= 0 && f < 3 && c > 0 && c < 3) {
                                fIni = 0;
                                fFin = 3;
                                cIni = 0;
                                cFin = 3;
                            } else if (f >= 3 && f < 6 && c >= 0 && c < 3) {
                                fIni = 3;
                                fFin = 6;
                                cIni = 0;
                                cFin = 3;
                            } else if (f >= 6 && f < 9 && c >= 0 && c < 3) {
                                fIni = 6;
                                fFin = 9;
                                cIni = 0;
                                cFin = 3;
                            } else if (f >= 0 && f < 3 && c >= 3 && c < 6) {
                                fIni = 0;
                                fFin = 3;
                                cIni = 3;
                                cFin = 6;
                            } else if (f >= 3 && f < 6 && c >= 3 && c < 6) {
                                fIni = 3;
                                fFin = 6;
                                cIni = 3;
                                cFin = 6;
                            } else if (f >= 6 && f < 9 && c >= 3 && c < 6) {
                                fIni = 6;
                                fFin = 9;
                                cIni = 3;
                                cFin = 6;
                            } else if (f >= 0 && f < 3 && c >= 6 && c < 9) {
                                fIni = 0;
                                fFin = 3;
                                cIni = 6;
                                cFin = 9;
                            } else if (f >= 3 && f < 6 && c >= 6 && c < 9) {
                                fIni = 3;
                                fFin = 6;
                                cIni = 6;
                                cFin = 9;
                            } else if (f >= 6 && f < 9 && c >= 6 && c < 9) {
                                fIni = 6;
                                fFin = 9;
                                cIni = 6;
                                cFin = 9;
                            }

                            for (i = fIni; i < fFin; i++) {
                                for (j = cIni; j < cFin; j++) {
                                    int auxn = game[i][j];
                                    System.out.println("Auxn " + auxn);
                                    if (auxn != 0 && auxn == aux) {
                                        rep = true;
                                    }
                                }
                            }
// CODIGO PARA VERIFICAR EN 3x3
// CODIGO PARA VERIFICAR EN COLUMNA
                            for (int y = 0; y < 9; y++) {
                                int PosicionAnalizando = game[y][c];
                                if (PosicionAnalizando == aux && y != f || numV == true) {
                                    rep = true;
                                } else {
                                    game[f][c] = aux;
                                }
                            }
// CODIGO PARA VERIFICAR FILA
                            for (int y = 0; y < 9; y++) {
                                int PosicionAnalizando = game[f][y];
                                if (PosicionAnalizando == aux && y != c || numV == true) {
                                    rep = true;
                                } else {
                                    game[f][c] = aux;
                                }
                            }

                            if (rep == true && numV == false) {
                                System.out.println("Numero repetido, ingresar otro.");
                                game[f][c] = 0;
                            }
                            numV = false;
                            rep = false;
                        } while (rep == true);
// VERIFICAR SI LA MATRIZ TIENE 0
                        for (i = 0; i < 9; i++) {
                            for (j = 0; j < 9; j++) {
                                if (game[i][j] == 0) {
                                    zero = true;
                                } else {
                                    zero = false;
                                }
                            }
                        }
                        Emat(game); // ESCRIBIR MATRIZ
                    } while (zero == true);

                    System.out.println("Sudoku completado, Feliciaciones!");
                    System.out.println("Su puntuacion es " + punt);
                    int mayorpunt = 0;
                    if (punt > mayorpunt) {
                        mayorpunt = punt;
                        System.out.println("¡Felicidades!, acaba de conseguir un nuevo record");
                    } else {
                        System.out.println("Suerte para la proxima, conseguirás un nuevo reocrd");
                    }
                    break;
                case 2:// MUESTRA LAS INSTRUCCIONES
                    System.out.println("Sudoku es un juego matematico comprendido con numeros del 1-9 dividido en 9 casillas de 3x3.\nPara comenzar a jugar Sudoku debes rellenar cada cuadro de 3x3 con los numeros posibles, sin repetir. \nDe igual forma no se puede repetir los numeros en la misma fila y/o columna. \nPor ultimo, para ganar se debe completar todo el cuadro 9x9 teniendo en cuenta lo anterior dicho.\nEn este programa solo se permite cambiar las casillas correspondientes con 0.\n");
                    break;
                case 3:
                    Player Player2 = new Player(3, 750, "Carlos");
                    Player Player3 = new Player(2, 324, "Patty");
                    Player1.Imprimir();
                    Player2.Imprimir();
                    Player3.Imprimir();
                    break;
                default:
                    System.out.println("Opcion errada o salió del menú");
            }

        } while (opc < 4);
    }
}
