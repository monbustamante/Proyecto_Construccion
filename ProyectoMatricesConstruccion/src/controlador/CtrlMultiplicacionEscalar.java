/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 * Controlador de Multiplicación por escalar.
 * @author Montserrat Bustamante Rentería
 */
public class CtrlMultiplicacionEscalar {
    private VistaOperaciones vo;
    private List<JTextField> valoresDeMatrizA;
    private JTextField escalar;
    private int filas, columnas;

    public CtrlEscalarMatrices(VistaOperaciones vo) {
        this.vo = vo;
        valoresDeMatrizA = new ArrayList<>();
        escalar = new JTextField();
        
        adaptarDiseñoDeVista();

        vo.getjButtonRegresar().addActionListener(this);
        vo.getjButtonResolver().addActionListener(this);
        vo.getjButtonGenerarMatrices().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(vo.getjButtonGenerarMatrices() == ae.getSource()) {
            generarMatrices();
        }     
        if(vo.getjButtonResolver() == ae.getSource()) {
            imprimirResultado(resolverEscalar());
        }
        if(vo.getjButtonRegresar() == ae.getSource()) {
            vo.setVisible(false);
        }
    }
    
    public void adaptarDiseñoDeVista() {
        vo.getjLabelTituloVista().setText("Multiplicación por Escalar");
        vo.getColumnasMatrizB().setVisible(false);
        vo.getFilasMatrizB().setVisible(false);
        vo.getjLabeMatrizB().setText("Escalar");
    }
    
    public void generarMatrices() {  
        limpiarMatrices();
        obtenerValoresFilasColumnas();
        
        vo.getPanelMatrizA().setLayout( new GridLayout(filas, columnas) );
        vo.getPanelMatrizB().setLayout( new GridLayout(filas, columnas) );  
        
        int totalDeValores = filas * columnas;
        for (int i = 0; i < totalDeValores; i++) {
            JTextField valorMatrizA = new JTextField("valorMatrizA" + i);
            valorMatrizA.setPreferredSize( new Dimension( 35, 35 ) );
            valorMatrizA.setText("");
            vo.getPanelMatrizA().add(valorMatrizA);
            valoresDeMatrizA.add(valorMatrizA);
            vo.getPanelMatrizA().updateUI();
        }
        
        escalar = new JTextField("escalar");
        escalar.setPreferredSize( new Dimension( 40, 40 ) );
        escalar.setText("");
        vo.getPanelMatrizB().add(escalar);
        vo.getPanelMatrizB().updateUI();
    }
    
    public void limpiarMatrices() {
        vo.getPanelMatrizA().removeAll();
        valoresDeMatrizA.clear();
        vo.getPanelMatrizB().removeAll();
    }
    
    public void obtenerValoresFilasColumnas() {
        filas = 1;
        columnas = 1;
        try {
            filas = Integer.parseInt(vo.getFilasMatrizA().getSelectedItem().toString());
            columnas = Integer.parseInt(vo.getColumnasMatrizA().getSelectedItem().toString());
        } catch (NumberFormatException e) {
        }
    }
    
    public void imprimirResultado(int[][] matrizResultante) {
        vo.getjTextAreaResultado().setText("");
        String resultado = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += "          " + matrizResultante[i][j] + "  ";
            }
            resultado += "\n";
        }
        vo.getjTextAreaResultado().setText(resultado);
    }
    
    public int[][] resolverEscalar() {
        int[][] matrizA = new int[filas][columnas];
        int i = 0, j = 0;
        for (JTextField valorMatrizA : valoresDeMatrizA) {
            if(j == columnas){
                i++;
                j = 0;
            }
            matrizA[i][j] = Integer.parseInt(valorMatrizA.getText());
            j++; 
        } 
        
        int[][] matrizResultante;
        int valorEscalar = Integer.parseInt(escalar.getText());
        // MultiplicacionEscalar escalar = new multiplicacionPorEscalar();
        matrizResultante = escalar.multiplicarPorEscalar(matrizA, valorEscalar);
        return matrizResultante;
    }
}
