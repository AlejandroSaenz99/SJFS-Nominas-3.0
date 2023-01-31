/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionexcel;
import Modelo.ModeloExcel;
import Presentacion.Sistema;
import Controlador.ControladorExcel;
import Controlador.ControladorExcel2;
import Modelo.ModeloExcel2;
import Presentacion.NominaExtra;

/**
 *
 * @author ricardo
 */
public class GestionExcel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloExcel2 modeloE = new ModeloExcel2();
        NominaExtra vistaE = new NominaExtra();
        ControladorExcel2 contraControladorExcel = new ControladorExcel2(vistaE, modeloE);
       
       vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    }
    
}