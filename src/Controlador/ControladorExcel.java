/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Presentacion.Sistema;
import Modelo.ModeloExcel;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


public class ControladorExcel implements ActionListener{
    ModeloExcel modeloE = new ModeloExcel();
    Sistema vistaE= new Sistema();
    JFileChooser selecArchivo = new JFileChooser();
    File archivo,Archivo2;
    int contAccion=0;
  
     
     public ControladorExcel(Sistema vistaE, ModeloExcel modeloE){
        this.vistaE= vistaE;
        this.modeloE=modeloE;
        //this.vistaE.btnImportar.addActionListener(this);
        this.vistaE.xd.addActionListener(this);
        this.vistaE.xd1.addActionListener(this);
        vistaE.btnImportar.addActionListener(this);
    }
    
    public void AgregarFiltro(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        contAccion++;
        if(contAccion==1)AgregarFiltro();
        
        
        
        if(e.getSource() == vistaE.xd){
            if(selecArchivo.showDialog(null, "Viajes Camion")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){

                    JOptionPane.showMessageDialog(null, modeloE.ExportarCamion(archivo, vistaE.TablaEncabezado,vistaE.TablaViajes,vistaE.TablaSubTotal,vistaE.TablaSubTotalYTD,vistaE.TablaTotal,vistaE.TablaDeduccionYTDNombre,vistaE.TablaDeduccionCamionYTD,vistaE.TablaSemana14,vistaE.TablaDeduccionTotalYTD,vistaE.TablaDeduccionCamionNombre,vistaE.TablaDeducciones,vistaE.TablaTotalDeduccion) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));

                }else{
                    JOptionPane.showMessageDialog(null, "add \".xls\" or \".xlsx\" to the end of the file name.");
                }
            }
        }
        
        if(e.getSource() == vistaE.xd1){
            if(selecArchivo.showDialog(null, "Viajes Driver")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){

               JOptionPane.showMessageDialog(null, modeloE.Exportar(archivo, vistaE.TablaEncabezado2,vistaE.TablaViajes2,vistaE.TablaSubTotal2,vistaE.TablaSubTotalYTD2,vistaE.TablaTotal2,vistaE.TablaDeduccionChoferNombre,vistaE.TablaDeduccionChofer,vistaE.TablaDeduccionChoferTotal,vistaE.TablaDeduccionChoferTotalYTD,vistaE.TablaTrabajoExtraNombre,vistaE.TablaTrabajoExtra,vistaE.TablaTrabajoExtraTotal) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));

                }else{
                    JOptionPane.showMessageDialog(null, "add \".xls\" or \".xlsx\" to the end of the file name.");
                }
            }
        }
       
        
        if(e.getSource()==vistaE.btnImportar){
            if(selecArchivo.showDialog(null, "Seleccionar Archivo")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                //ALT + 124 ||
                if(archivo.getName().endsWith("xls")||archivo.getName().endsWith("xlsx")){
                    JOptionPane.showMessageDialog(null, modeloE.Importar(archivo,vistaE.Tablita));
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccionar formato Valido");
                }
            }
        }
       
    }
    
}


