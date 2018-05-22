/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.main;

import java.util.Arrays;

/**
 *
 * @author Java-LM
 */
public class PruebaRegex {
    public static void main(String[] args) {
        String prueba = "hola      mundo";
        System.out.println( Arrays.toString(prueba.split("\\s+")) );
    }
}
