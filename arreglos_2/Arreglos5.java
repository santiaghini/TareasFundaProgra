/* Escribir un programa que visualice un cuadrado mágico de orden
impar n comprendido entre 3 y 11; el usuario debe elegir el valor
de n. Un cuadrado mágico se compone de número enteros comprendimos
entre 1 y n. La suma de los números que ﬁguran en cada fila,
columna y diagonal son iguales.

Ejemplo:
8 1 6
3 5 7
4 9 2

Un método de generación consiste en situar el número 1 en centro de
la primera fila, el número siguiente en la casilla situada por encima
y a la derecha, y así sucesivamente. El cuadrad es cíclico:
la línea encima de la primera es, de hecho, la última y la columna
a la derecha de la última es la primera. En el caso de que el número
generado caiga en una casilla ocupada, se elige la casilla situada encima
del número que acaba de ser situado.

_______________________________________________________________________
* Desarrollado por Santiago Hernández, Gerardo Anglada e Isaac Harari *
*            Tecnológico de Monterrey Campus Santa Fe                 *
_______________________________________________________________________
*/

import java.util.Scanner;

public class Arreglos5{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Dame un número impar: ");
    int n = sc.nextInt();
    int[][] cuadroMagico = new int[n][n];

    int num = 1;
    int fila = 0;
    int col = n / 2;
    int curr_fila;
    int curr_col;
    while (num <= n * n) {
        cuadroMagico[fila][col] = num;
        num++;
        curr_fila = fila;
        curr_col = col;
        fila -= 1;
        col += 1;
        if (fila == -1) {
            fila = n - 1;
        }
        if (col == n) {
            col = 0;
        }
        if (cuadroMagico[fila][col] != 0) {
            fila = curr_fila + 1;
            col = curr_col;
            if (fila == -1) {
                fila = n - 1;
            }
        }
    }

    for (int i = 0; i < cuadroMagico.length; i++) {
        for (int j = 0; j < cuadroMagico.length; j++) {
            System.out.print(cuadroMagico[i][j] + " ");
        }
        System.out.println();
    }

  }

}

/*
____________________RESULTADO EN TERMINAL____________________

MacBook-Air-de-Manuel:arreglos_2 hergutair$ java Arreglos5
Dame un número impar: 3
8 1 6
3 5 7
4 9 2
MacBook-Air-de-Manuel:arreglos_2 hergutair$ java Arreglos5
Dame un número impar: 5
17 24 1 8 15
23 5 7 14 16
4 6 13 20 22
10 12 19 21 3
11 18 25 2 9
*/
