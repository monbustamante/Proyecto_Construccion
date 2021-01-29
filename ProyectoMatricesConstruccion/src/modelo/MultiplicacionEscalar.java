/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Esta clase realiza la multiplicación de una matriz por un escalar.
 * @version 1.1
 * @author Montserrat Bustamante Rentería
 */
public class MultiplicacionEscalar {
    private int escalar;
    
    /*
     * Esta función toma la matriz de tipo entero y la multiplica por el escalar
     * @param matriz Matriz de enteros
     * @param escalar Número entero que se multiplicará por la matriz
     * @return matrizResultado Matriz resultante de la multiplicación de la matriz por escalar
    */
    public int[][] multiplicarPorEscalar(int[][] matriz, int escalar){
        int numFilas = matriz.length;
        int numColumnas = matriz[0].length;
        int[][] matrizResultado;
        
        for(int i = 0; i < numFilas ; i++){
            for(int j = 0; j < numColumnas; j++){
               matrizResultado[i][j] = escalar * matriz[i][j];
            }
	}
        return matrizResultado;
    }
    
    /*
     * Esta función muestra el resultado de la multiplicación de la matriz por el escalar.
    */
    public void imprimirMatriz(String matrizTittle, int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println(matrizTittle);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }    
    }
    
}
