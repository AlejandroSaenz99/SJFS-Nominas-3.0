
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Presentacion.Agua;
import Modelo.ModeloExcel;
import Modelo.ModeloExcel3;
import Presentacion.NominaExtra;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ControladorExcel3 implements ActionListener{
    ModeloExcel3 modeloE = new ModeloExcel3();
    Agua vistaE= new Agua();
    JFileChooser selecArchivo = new JFileChooser();
    File archivo,Archivo2;
    int contAccion=0;
    
    public ControladorExcel3(Agua vistaE, ModeloExcel3 modeloE){
        this.vistaE= vistaE;
        this.modeloE=modeloE;
        //this.vistaE.btnImportar.addActionListener(this);
        this.vistaE.xd.addActionListener(this);
        this.vistaE.xd1.addActionListener(this);
        
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
            if(selecArchivo.showDialog(null, "Exportar Camion")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){

                    JOptionPane.showMessageDialog(null, modeloE.ExportarCamion(archivo, vistaE.TablaEncabezado,vistaE.TablaCamion,vistaE.TablaSubTotal1,vistaE.TablaSubTotalYTD,vistaE.TablaTotal,vistaE.TablaDeduccionYTDNombre,vistaE.TablaDeduccionCamionYTD,vistaE.TablaDeduccionTotalYTD,vistaE.TablaDeduccionCamionNombre,vistaE.TablaDeducciones,vistaE.TablaTotalDeduccion) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));

                }else{
                    JOptionPane.showMessageDialog(null, "add \".xls\" or \".xlsx\" to the end of the file name.");
                }
            }
        }
        if(e.getSource() == vistaE.xd1){
            if(selecArchivo.showDialog(null, "Exportar Camion")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){

                    JOptionPane.showMessageDialog(null, modeloE.ExportarChofer(archivo, vistaE.TablaEncabezado2,vistaE.TablaChofer,vistaE.TablaSubTotal,vistaE.TablaSubTotalYTD,vistaE.TablaPaga,vistaE.TablaDeduccionCamionNombre,vistaE.TablaDeduccionChofer,vistaE.TablaDeduccionChoferTotal) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));

                }else{
                    JOptionPane.showMessageDialog(null, "add \".xls\" or \".xlsx\" to the end of the file name.");
                }
            }
        }
        
    }
    
}
