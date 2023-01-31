/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionexcel;

import Controlador.ControladorExcel3;
import Modelo.ModeloExcel3;
import Presentacion.Agua;

/**
 *
 * @author AlejandroSaenz
 */
public class GestionExcel3 {
    public static void main(String[] args) {
        ModeloExcel3 modeloE = new ModeloExcel3();
        Agua vistaE = new Agua();
        ControladorExcel3 contraControladorExcel = new ControladorExcel3(vistaE, modeloE);
       
       vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    }
    
}
