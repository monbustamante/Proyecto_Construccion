/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Esta clase contiene las operaciones que resuelven un sistema de ecuaciones utilizando el método Gauss-Jordan
 * @author Montserrat Bustamante Rentería
 */
public class SistemaEcuacionesGJ {
    
    /*
     * Este método 
    */
    private static float[][] pivote(float matriz[][], int pivote, int variable){
        float temp = matriz[pivote][pivote];
        
        for (int i=0; i < (variable+1); i++) {
            matriz[pivote][i] = matriz[pivote][i] / temp;
        }           
        return matriz;
    }
    
    /*
     * Este método realiza 
    */
    private static float[][] hacerCeros(float matriz[][], int pivote, int variable){
        for (int i=0; i < variable; i++) {
            if (i != pivote) {
                float valor = matriz[i][pivote];
                for (int j=0; j < (variable+1); j++) {
                    matriz[i][j] = ((-valor)*matriz[pivote][j])+matriz[i][j];
                }
            }
        }
        return matriz;
    }

    /*
     * Este método resuelve el sistema de ecuaciones con el método Gauss Jordan
     * @param matriz Una matriz de tipo flotante
     * @variable Un numero de tipo entero (CHECAR)
     * @return respuesta El valor de x.
    */
    static int resolverSistema(float[][] matriz, int n) { 
    int i, j, k = 0, c, flag = 0, m = 0; 
    float pro = 0; 
      
    // Performing elementary operations 
    for (i = 0; i < n; i++) { 
        if (matriz[i][i] == 0)  
        { 
            c = 1; 
            while ((i + c) < n && matriz[i + c][i] == 0)  
                c++;          
            if ((i + c) == n)  
            { 
                flag = 1; 
                break; 
            } 
            for (j = i, k = 0; k <= n; k++)  
            { 
                float temp = matriz[j][k]; 
                matriz[j][k] = matriz[j+c][k]; 
                matriz[j+c][k] = temp; 
            } 
        } 
  
        for (j = 0; j < n; j++)  
        { 
              
            // Excluding all i == j 
            if (i != j)  
            { 
                  
                // Converting Matrix to reduced row 
                // echelon form(diagonal matrix) 
                float p = matriz[j][i] / matriz[i][i]; 
  
                for (k = 0; k <= n; k++)                  
                    matriz[j][k] = matriz[j][k] - (matriz[i][k]) * p;              
            } 
        } 
    } 
        return flag; 
    } 
    
    /*
     * Este método devuelve el valor de x del sistema de ecuaciones.
    */
    void imprimirResultado(float a[][], int n, int flag) {
    System.out.println("Que chingue su madre el america");
    System.out.print("Result is : "); 
  
    if (flag == 2)      
    System.out.println("Infinite Solutions Exists");  
    else if (flag == 3)      
    System.out.println("No Solution Exists"); 
      
      
    // Printing the solution by dividing constants by 
    // their respective diagonal elements 
    else { 
        for (int i = 0; i < n; i++)          
            System.out.print(a[i][n] / a[i][i] +" ");      
    } 
    
    // To check whether infinite solutions  
    // exists or no solution exists 
    
    /*
     * Este método revisa si el sistema de ecuaciones tiene infinitas soluciones o no tiene solución.
     * @return flag Si es igual a 2 es porque el sistema de ecuaciones tiene soluciones infinitas; si es igual a 3, no tiene solución
    */
    static int checkConsistency(float[][] matriz, int n, int flag) {
        int i, j; 
        float sum; 
      
    // flag == 2 for infinite solution 
    // flag == 3 for No solution 
        flag = 3; 
        for (i = 0; i < n; i++) { 
            sum = 0; 
            for (j = 0; j < n; j++)      
                sum = sum + matriz[i][j]; 
            if (sum == matriz[i][j])  
                flag = 2;      
        } 
        return flag; 
    } 
}
    
   
}
