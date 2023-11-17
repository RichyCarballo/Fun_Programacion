/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p10_u4;

/**
 *
 * @author richy
 */
public class P10_u4 {

    public static void main(String[] args) {
        String[] paises = { "Madagascar", "España", "México", "Peru", "Reino Unido de Gran Bretaña e Irlanda del Norte" };

        double longitudPromedio = CalcularLongitudPromedio(paises);
        System.out.println("Longitud Promedio de las Palabras: " + longitudPromedio);
    }

    static double CalcularLongitudPromedio(String[] arreglo) {
        int totalCaracteres = 0;

        for (String palabra : arreglo) {
            totalCaracteres += palabra.length();
        }

        return (double)totalCaracteres / arreglo.length;
    }
}
