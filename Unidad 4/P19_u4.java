/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p19_u4;
import java.util.Scanner;
/**
 *
 * @author richy
 */
public class P19_u4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int fila = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columna = sc.nextInt();

        int[][] matrix = new int[fila][columna];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] result = countEvenOdd(matrix);

        System.out.println("La cantidad de números pares es: " + result[0]);
        System.out.println("La cantidad de números impares es: " + result[1]);
    }

    public static int[] countEvenOdd(int[][] matrix) {
        int fila = matrix.length;
        int columna = matrix[0].length;

        int cpar = 0;
        int cimpar = 0;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matrix[i][j] % 2 == 0) {
                    cpar++;
                } else {
                    cimpar++;
                }
            }
        }

        return new int[]{cpar, cimpar};
    }
}