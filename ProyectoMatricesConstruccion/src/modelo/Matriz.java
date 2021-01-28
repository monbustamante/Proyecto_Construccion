/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Equipo Los Aprobados ;) 
 */

public class Matriz {
    private int numeroFilas;             
    private int numeroColumnas;
    private int[][] datos;

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public int getNumeroColumnas() {
        return numeroColumnas;
    }

    public void setNumeroColumnas(int numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }
    
    public Matriz(int numeroColumnas, int numeroFilas){
        this.numeroColumnas = numeroColumnas;
        this.numeroFilas = numeroFilas;
    }
    
    public Matriz(int[][] datos){
        //Llenado de matriz
    }
    
    public boolean esCuadrada(Matriz M){
        if(M.getNumeroColumnas() == M.getNumeroFilas()){
            return true;
        }
        else {
            return false;
        }
    }
}
