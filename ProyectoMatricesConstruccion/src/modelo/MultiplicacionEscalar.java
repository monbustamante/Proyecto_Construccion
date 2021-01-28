/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author monts
 */
public class MultiplicacionEscalar {
    private int escalar;
    
    public int multiplicarPorEscalar(int[][] matriz, int escalar){
        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.format("%d \t", (escalar * matriz[i][j]));
            }
	System.out.print("\n");
	}
        return 0;
    }
    
}
