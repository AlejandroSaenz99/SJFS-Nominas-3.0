
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import Presentacion.Sistema;
import Modelo.ModeloExcel;
import Modelo.ModeloExcel2;
import Presentacion.NominaExtra;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ControladorExcel2 implements ActionListener{
    ModeloExcel2 modeloE = new ModeloExcel2();
    NominaExtra vistaE= new NominaExtra();
    JFileChooser selecArchivo = new JFileChooser();
    File archivo,Archivo2;
    int contAccion=0;
    
    public ControladorExcel2(NominaExtra vistaE, ModeloExcel2 modeloE){
        this.vistaE= vistaE;
        this.modeloE=modeloE;
        //this.vistaE.btnImportar.addActionListener(this);
        this.vistaE.g1.addActionListener(this);
        this.vistaE.g2.addActionListener(this);
    }
    
    public void AgregarFiltro(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        contAccion++;
        if(contAccion==1)AgregarFiltro();
        
        
        
        if(e.getSource() == vistaE.g1){
            if(selecArchivo.showDialog(null, "Exportar")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){

                    //JOptionPane.showMessageDialog(null, modeloE.Exportar(archivo, vistaE.tabla2) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));

                }else{
                    JOptionPane.showMessageDialog(null, "add \".xls\" or \".xlsx\" to the end of the file name.");
                }
            }
        }if(e.getSource() == vistaE.g2){
            if(selecArchivo.showDialog(null, "Exportar Mecanico")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){

                    JOptionPane.showMessageDialog(null, modeloE.Exportar(archivo, vistaE.TablaPagoMecanico,vistaE.TablaSubTotal,vistaE.TablaYTDSubTotal,vistaE.TablaTotalPay,vistaE.TablaDeduccionMecanicoYTD,vistaE.TablaDeduccoinesYTDTotal,vistaE.TablaDeduccionMecanico,vistaE.TablaTotalDeducciones,vistaE.TablaDeduccionYTDMecanicoNombre,vistaE.TablaTotalDeducciones2) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));

                }else{
                    JOptionPane.showMessageDialog(null, "add \".xls\" or \".xlsx\" to the end of the file name.");
                }
            }
        }
    }
    
}

