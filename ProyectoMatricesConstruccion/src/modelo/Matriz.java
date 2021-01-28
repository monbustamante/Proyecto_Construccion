/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Esta clase representa las matrices con las que se realizarán las operaciones.
 * @version 1.0, 27/01/2021
 * @author Equipo Los Aprobados ;) 
 */

public class Matriz {
    private int numeroFilas;             
    private int numeroColumnas;
    private int[][] datos;
    
    /*
     * Este constructor crea una matriz con las dimensiones establecidas.
     * @param numeroColumnas el número de columnas que tendrá la Matriz
     * @param numeroFilas el número de filas que tendrá la Matriz
    */
    public Matriz(int numeroColumnas, int numeroFilas){
        this.numeroColumnas = numeroColumnas;
        this.numeroFilas = numeroFilas;
    }
    
    /*
     * Este constructor crea una Matriz llenada con sus elementos !!!!!!!!
    */
    public Matriz(int[][] datos){
        //Llenado de matriz
    }

    /*
     * @return número de tipo de entero que representa el número de filas de la matriz.
    */
    public int getNumeroFilas() {
        return numeroFilas;
    }
    
    /*
     * Establece el número de filas de la matriz.
     * @param número de tipo entero numeroFilas
    */
    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }
    
    /*
     * @return número de tipo de entero que representa el número de columnas de la matriz.
    */
    public int getNumeroColumnas() {
        return numeroColumnas;
    }

    /*
     * Establece el número de columnas de la matriz.
     * @param número de tipo entero numeroColumnas
    */
    public void setNumeroColumnas(int numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }
    
    
    
    /**
     * Este método indica si la Matriz ingresada es cuadrada, es decir,
     * que su número de filas y de columnas es el mismo.
     * Esta función se utilizará para verificar que las Matrices cumplen con esta propiedad
     * para que algunas de las operaciones puedan realizarse.
     * @param M Una matriz de números enteros
     * @return true si la matriz es cuadrada, false si no es cuadrada.
    */
    public boolean esCuadrada(Matriz M){
        if(M.getNumeroColumnas() == M.getNumeroFilas()){
            return true;
        }
        else {
            return false;
        }
    }
    
    // Podria ser la funcion de llenado de la matriz
    public Matriz llenarMatriz(Matriz M){
        return M;
    }
}
