/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author AlejandroSaenz
 */
public class ModeloExcel {
   Workbook wb;
      
    
      public String Importar(File archivo, JTable tabla){
        String mensaje="Error en la Importacion";
        DefaultTableModel modelo=new DefaultTableModel();
        tabla.setModel(modelo);
        
        try {
            //CREA ARCHIVO CON EXTENSION XLS Y XLSX
            wb=WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja=wb.getSheetAt(0);
            Iterator FilaIterator=hoja.rowIterator();
            int IndiceFila=-1;
            
            //VA SER VERDADERO SI EXISTEN FILAS POR RECORRER
            while (FilaIterator.hasNext()) {                
                //INDICE FILA AUMENTA 1 POR CADA RECORRIDO
                IndiceFila++;
                Row fila=(Row)FilaIterator.next();
                //RECORRE LAS COLUMNAS O CELDAS DE UNA FILA YA CREADA
                Iterator ColumnaIterator=fila.cellIterator();
                //ASIGNAMOS EL MAXIMO DE COLUMNA PERMITIDO
                Object[]ListaColumna=new Object[9999];
                int IndiceColumna=-1;
                //VA SER VERDADERO SI EXISTEN COLUMNAS POR RECORRER
                while (ColumnaIterator.hasNext()) {                    
                    //INDICE COLUMNA AUMENTA 1 POR CADA RECORRIDO
                    IndiceColumna++;
                    Cell celda=(Cell)ColumnaIterator.next();
                    //SI INDICE FILA ES IGUAL A "0" ENTONCES SE AGREGA UNA COLUMNA
                    if(IndiceFila==0){
                        modelo.addColumn(celda.getStringCellValue());
                    }else{
                        if(celda!=null){
                            switch (celda.getCellType()){
                                case Cell.CELL_TYPE_NUMERIC:
                                    ListaColumna[IndiceColumna]=(float)(celda.getNumericCellValue());
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    ListaColumna[IndiceColumna]=celda.getStringCellValue();
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:
                                    ListaColumna[IndiceColumna]=celda.getBooleanCellValue();
                                    break;
                                    
                                    default:
                                        ListaColumna[IndiceColumna]=celda.getDateCellValue();
                                        break;
                            }
                        }
                    }
                }
                
                if(IndiceFila!=0)modelo.addRow(ListaColumna);
            }
            mensaje="Importacion Exitosa";
            
        } catch (Exception e) {
        }
        return mensaje;
    }
    
         public String Exportar(File archivo, JTable TablaEncabezado2,JTable TablaViajes2,JTable TablaSubTotal,JTable TablaSubTotalYTD2,JTable TablaTotal2,JTable TablaDeduccionChoferNombre, JTable TablaDeduccionChofer, JTable TablaDeduccionChoferTotal,JTable TablaDeduccionChoferTotalYTD,JTable TablaTrabajoExtraNombre, JTable TablaTrabajoExtra,JTable TablaTrabajoExtraTotal){
         String respuesta="the file is open.";
        int numFila=TablaEncabezado2.getRowCount(), numColumna=TablaEncabezado2.getColumnCount();
        int numFila2=TablaViajes2.getRowCount(), numColumna2=TablaViajes2.getColumnCount();
        int numFila3=TablaSubTotal.getRowCount(), numColumna3=TablaSubTotal.getColumnCount();
        int numFila4=TablaSubTotalYTD2.getRowCount(), numColumna4=TablaSubTotalYTD2.getColumnCount();
        int numFila5=TablaTotal2.getRowCount(), numColumna5=TablaTotal2.getColumnCount();
       int numFila6=TablaDeduccionChoferNombre.getRowCount(), numColumna6=TablaDeduccionChoferNombre.getColumnCount();
       int numFila7=TablaDeduccionChofer.getRowCount(), numColumna7=TablaDeduccionChofer.getColumnCount();
       int numFila8=TablaDeduccionChoferTotal.getRowCount(), numColumna8=TablaDeduccionChoferTotal.getColumnCount();
       int numFila9=TablaDeduccionChoferTotalYTD.getRowCount(), numColumna9=TablaDeduccionChoferTotalYTD.getColumnCount();
       int numFila10=TablaTrabajoExtraNombre.getRowCount(), numColumna10=TablaTrabajoExtraNombre.getColumnCount();
       int numFila11=TablaTrabajoExtra.getRowCount(), numColumna11=TablaTrabajoExtra.getColumnCount();
        int numFila12=TablaTrabajoExtraTotal.getRowCount(), numColumna12=TablaTrabajoExtraTotal.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Nomina");
        hoja.getPrintSetup().setLandscape(true);
            Font font = wb.createFont();
            font.setBoldweight(Font.BOLDWEIGHT_BOLD);
            font.setFontName("Songti");
            font.setFontHeight((short) 220);
            font.setColor(HSSFColor.WHITE.index);
           

            //Font fontContent4 = wb.createFont();
            //fontContent4.setFontHeightInPoints((short)11);
            //Aqui ponemos los marcos a las celdas
            //CeldaNormal
             CellStyle CeldaNormal = wb.createCellStyle();
             CeldaNormal.setAlignment(CellStyle.ALIGN_CENTER); // horizontal

             CeldaNormal.setBorderBottom(HSSFCellStyle.BORDER_THIN);
             CeldaNormal.setBorderLeft(HSSFCellStyle.BORDER_THIN);
             CeldaNormal.setBorderRight(HSSFCellStyle.BORDER_THIN);
             CeldaNormal.setBorderTop(HSSFCellStyle.BORDER_THIN);
             //Celdas Grises
             CellStyle CeldaGris = wb.createCellStyle();
             CeldaGris.setAlignment(CellStyle.ALIGN_CENTER); // horizontal

             CeldaGris.setBorderBottom(HSSFCellStyle.BORDER_THIN);
             CeldaGris.setBorderLeft(HSSFCellStyle.BORDER_THIN);
             CeldaGris.setBorderRight(HSSFCellStyle.BORDER_THIN);
             CeldaGris.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaGris.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
             CeldaGris.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()); // color de primer plano
             CeldaGris.setFillPattern(CellStyle.SOLID_FOREGROUND);
             //CElda Amarilla
             CellStyle CeldaAmarilla = wb.createCellStyle();
             CeldaAmarilla.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
             CeldaAmarilla.setBorderBottom(HSSFCellStyle.BORDER_THIN);
             CeldaAmarilla.setBorderLeft(HSSFCellStyle.BORDER_THIN);
             CeldaAmarilla.setBorderRight(HSSFCellStyle.BORDER_THIN);
             CeldaAmarilla.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaAmarilla.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
             CeldaAmarilla.setFillForegroundColor(IndexedColors.YELLOW.getIndex()); // color de primer plano
             CeldaAmarilla.setFillPattern(CellStyle.SOLID_FOREGROUND);
             //CeldaVerde

             CellStyle CeldaVerde = wb.createCellStyle();
             CeldaVerde.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
             CeldaVerde.setBorderBottom(HSSFCellStyle.BORDER_THIN);
             CeldaVerde.setBorderLeft(HSSFCellStyle.BORDER_THIN);
             CeldaVerde.setBorderRight(HSSFCellStyle.BORDER_THIN);
             CeldaVerde.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaVerde.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
             CeldaVerde.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex()); // color de primer plano
             CeldaVerde.setFillPattern(CellStyle.SOLID_FOREGROUND);
             //CEda Roja

             CellStyle CeldaRoja = wb.createCellStyle();
             CeldaRoja.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
             CeldaRoja.setBorderBottom(HSSFCellStyle.BORDER_THIN);
             CeldaRoja.setBorderLeft(HSSFCellStyle.BORDER_THIN);
             CeldaRoja.setBorderRight(HSSFCellStyle.BORDER_THIN);
             CeldaRoja.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaRoja.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
             CeldaRoja.setFillForegroundColor(IndexedColors.RED.getIndex()); // color de primer plano
             CeldaRoja.setFillPattern(CellStyle.SOLID_FOREGROUND);
             CeldaRoja.setFont(font);
             //aqui le quitamos los marcos a las celas vacias
             CellStyle SinBorde = wb.createCellStyle();
             SinBorde.setBorderBottom(HSSFCellStyle.BORDER_NONE);
             SinBorde.setBorderLeft(HSSFCellStyle.BORDER_NONE);
             SinBorde.setBorderRight(HSSFCellStyle.BORDER_NONE);
             SinBorde.setBorderTop(HSSFCellStyle.BORDER_NONE);

    try {//Tabla total
            for (int i = -1; i < numFila5; i++) {
                Row fila = hoja.createRow(i+14+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna5; j++) {
                    Cell celda = fila.createCell(j+7);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaVerde);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTotal2.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaTotal2.getValueAt(i, j)));
                        String x=(String) TablaTotal2.getValueAt(i,j);
                            
                            if(x.equals("Total Pay:")){
                            celda.setCellStyle(CeldaGris);}
                            else{float y=Float.parseFloat(x);
                         if(y<=0){celda.setCellStyle(CeldaRoja);}}
                         
                    
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//Tabla sub total
            for (int i = -1; i < numFila3; i++) {
                Row fila = hoja.createRow(i+13+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna3; j++) {
                    Cell celda = fila.createCell(j+7);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaAmarilla);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaSubTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaSubTotal.getValueAt(i, j)));
                        String x=(String) TablaSubTotal.getValueAt(i,j);
                            
                            if(x.equals("Sub Total:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
          try {//Tabla sub total YTD
            for (int i = -1; i < numFila4; i++) {
                Row fila = hoja.getRow(i+13+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna4; j++) {
                    Cell celda = fila.createCell(j+9);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaAmarilla);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaSubTotalYTD2.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaSubTotalYTD2.getValueAt(i, j)));
                         String x=(String) TablaSubTotalYTD2.getValueAt(i,j);
                            
                            if(x.equals("YTD:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//TablaViajes
            for (int i = -1; i < numFila2; i++) {
                Row fila = hoja.createRow(i+13);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna2; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaViajes2.getColumnName(j)));
                         celda.setCellStyle(CeldaGris);
                    }else{
                        celda.setCellValue(String.valueOf(TablaViajes2.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//Tabla Encabezado
            for (int i = -1; i < numFila; i++) {
                Row fila = hoja.createRow(i+10);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaEncabezado2.getColumnName(j)));
                         celda.setCellStyle(SinBorde);
                    }else{
                        celda.setCellValue(String.valueOf(TablaEncabezado2.getValueAt(i, j)));
                        String x=(String) TablaEncabezado2.getValueAt(i,j);
                            
                            if(x.equals("Name:")||x.equals("Period:")||x.equals("Year:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
      
    }  //Aqui terminan las tablas de viajes total y subtotal
       //Aqui empiezan las tablas deducciones
       try {//Tabla Deduccion chofer Total YTD
            for (int i = -1; i < numFila9; i++) {
                Row fila = hoja.createRow(i+19+numFila2+numFila7);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna9; j++) {
                    Cell celda = fila.createCell(j+1);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionChoferTotalYTD.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionChoferTotalYTD.getValueAt(i, j)));
                        String x=(String) TablaDeduccionChoferTotalYTD.getValueAt(i,j);
                            
                            if(x.equals("YTD:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }  
        try {//Tabla Deduccion chofer Total 
            for (int i = -1; i < numFila8; i++) {
                Row fila = hoja.createRow(i+18+numFila2+numFila7);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna8; j++) {
                    Cell celda = fila.createCell(j+1);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionChoferTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionChoferTotal.getValueAt(i, j)));
                        String x=(String) TablaDeduccionChoferTotal.getValueAt(i,j);
                            
                            if(x.equals("Total:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }  
       try {//Tabla Deduccion chofer 
            for (int i = -1; i < numFila7; i++) {
                Row fila = hoja.createRow(i+18+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna7; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionChofer.getColumnName(j)));
                        celda.setCellStyle(CeldaGris);
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionChofer.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }  
       
       try {//Tabla Deduccion chofer Nombre
            for (int i = -1; i < numFila6; i++) {
                Row fila = hoja.createRow(i+16+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna6; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionChoferNombre.getColumnName(j)));
                        celda.setCellStyle(SinBorde);
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionChoferNombre.getValueAt(i, j)));
                         int x=celda.getRowIndex();
                        hoja.addMergedRegion(new CellRangeAddress(
	            x, //first row (0-based)
	            x, //last row  (0-based)
	            0, //first column (0-based)
	            2  //last column  (0-based)
	    ));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }//*************Aqui terminan las tablas deducciones
         try {//Tabla Trabajo extra Total chofer 
            for (int i = -1; i < numFila12; i++) {
                Row fila = hoja.getRow(i+18+numFila2+numFila11);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna12; j++) {
                    Cell celda = fila.createCell(j+5);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTrabajoExtraTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaTrabajoExtraTotal.getValueAt(i, j)));
                         String x=(String) TablaTrabajoExtraTotal.getValueAt(i,j);
                            
                            if(x.equals("Total:")){
                            celda.setCellStyle(CeldaGris);}
                        
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//Tabla Trabajo extra chofer 
            for (int i = -1; i < numFila11; i++) {
                Row fila = hoja.getRow(i+18+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna11; j++) {
                    Cell celda = fila.createCell(j+4);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTrabajoExtra.getColumnName(j)));
                        celda.setCellStyle(CeldaGris);
                    }else{
                        celda.setCellValue(String.valueOf(TablaTrabajoExtra.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//Tabla TrabajoExtra chofer Nombre
            for (int i = -1; i < numFila10; i++) {
                Row fila = hoja.getRow(i+16+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna10; j++) {
                    Cell celda = fila.createCell(j+4);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTrabajoExtraNombre.getColumnName(j)));
                        celda.setCellStyle(SinBorde);
                    }else{
                        celda.setCellValue(String.valueOf(TablaTrabajoExtraNombre.getValueAt(i, j)));
                         int x=celda.getRowIndex();
                        hoja.addMergedRegion(new CellRangeAddress(
	            x, //first row (0-based)
	            x, //last row  (0-based)
	            4, //first column (0-based)
	            6  //last column  (0-based)
	    ));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return respuesta;
}  
     
        public String ExportarCamion(File archivo, JTable TablaEncabezado,JTable TablaViajes,JTable TablaSubTotal,JTable TablaSubTotalYTD,JTable TablaTotal,JTable TablaDeduccionYTDNombre, JTable TablaDeduccionCamionYTD,JTable TablaSemana14,JTable TablaDeduccionTotalYTD
        ,JTable TablaDeduccionCamionNombre,JTable TablaDeducciones,JTable TablaTotalDeducciones){
        String respuesta="the file is open.";
        int numFila=TablaEncabezado.getRowCount(), numColumna=TablaEncabezado.getColumnCount();
        //************************Aqui termina la tabla encabezado****************************
        int numFila2=TablaViajes.getRowCount(), numColumna2=TablaViajes.getColumnCount();
        int numFila3=TablaSubTotal.getRowCount(), numColumna3=TablaSubTotal.getColumnCount();
        int numFila4=TablaSubTotalYTD.getRowCount(), numColumna4=TablaSubTotalYTD.getColumnCount();
        int numFila5=TablaTotal.getRowCount(), numColumna5=TablaTotal.getColumnCount();
                //************************Aqui terminan las tablas viaje, sub total, subtotalYTD y total****************************
        int numFila6=TablaDeduccionYTDNombre.getRowCount(), numColumna6=TablaDeduccionYTDNombre.getColumnCount();
        int numFila7=TablaDeduccionCamionYTD.getRowCount(), numColumna7=TablaDeduccionCamionYTD.getColumnCount();
        int numFila8=TablaSemana14.getRowCount(), numColumna8=TablaSemana14.getColumnCount();
        int numFila9=TablaDeduccionTotalYTD.getRowCount(), numColumna9=TablaDeduccionTotalYTD.getColumnCount();
        int numFila10=TablaDeduccionCamionNombre.getRowCount(), numColumna10=TablaDeduccionCamionNombre.getColumnCount();
        int numFila11=TablaDeducciones.getRowCount(), numColumna11=TablaDeducciones.getColumnCount();
        int numFila12=TablaTotalDeducciones.getRowCount(), numColumna12=TablaTotalDeducciones.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }else{
            wb = new XSSFWorkbook();
        }
        
            Sheet hoja = wb.createSheet("Nomina");
           hoja.getPrintSetup().setLandscape(true);
          
            //insertarImagen(wb, hoja);
               hoja.addMergedRegion(new CellRangeAddress(
	            10, //first row (0-based)
	            10, //last row  (0-based)
	            1, //first column (0-based)
	            3  //last column  (0-based)
	    ));
           
          
          
         
            Font font = wb.createFont();
            font.setBoldweight(Font.BOLDWEIGHT_BOLD);
            font.setFontName("Songti");
            font.setFontHeight((short) 220);
            font.setColor(HSSFColor.WHITE.index);
           
 
            //Font fontContent4 = wb.createFont();
            //fontContent4.setFontHeightInPoints((short)11);
            //Aqui ponemos los marcos a las celdas
            //CeldaNormal
            CellStyle CeldaNormal = wb.createCellStyle();
            CeldaNormal.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
           
            CeldaNormal.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            CeldaNormal.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            CeldaNormal.setBorderRight(HSSFCellStyle.BORDER_THIN);
            CeldaNormal.setBorderTop(HSSFCellStyle.BORDER_THIN);
            //Celdas Grises
            CellStyle CeldaGris = wb.createCellStyle();
            CeldaGris.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
           
            CeldaGris.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            CeldaGris.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            CeldaGris.setBorderRight(HSSFCellStyle.BORDER_THIN);
            CeldaGris.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaGris.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
         CeldaGris.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()); // color de primer plano
         CeldaGris.setFillPattern(CellStyle.SOLID_FOREGROUND);
         //CElda Amarilla
          CellStyle CeldaAmarilla = wb.createCellStyle();
          CeldaAmarilla.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
            CeldaAmarilla.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            CeldaAmarilla.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            CeldaAmarilla.setBorderRight(HSSFCellStyle.BORDER_THIN);
            CeldaAmarilla.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaAmarilla.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
         CeldaAmarilla.setFillForegroundColor(IndexedColors.YELLOW.getIndex()); // color de primer plano
         CeldaAmarilla.setFillPattern(CellStyle.SOLID_FOREGROUND);
         //CeldaVerde
         
          CellStyle CeldaVerde = wb.createCellStyle();
          CeldaVerde.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
            CeldaVerde.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            CeldaVerde.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            CeldaVerde.setBorderRight(HSSFCellStyle.BORDER_THIN);
            CeldaVerde.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaVerde.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
         CeldaVerde.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex()); // color de primer plano
         CeldaVerde.setFillPattern(CellStyle.SOLID_FOREGROUND);
         //CEda Roja
         
          CellStyle CeldaRoja = wb.createCellStyle();
          CeldaRoja.setAlignment(CellStyle.ALIGN_CENTER); // horizontal
            CeldaRoja.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            CeldaRoja.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            CeldaRoja.setBorderRight(HSSFCellStyle.BORDER_THIN);
            CeldaRoja.setBorderTop(HSSFCellStyle.BORDER_THIN);
             CeldaRoja.setFillBackgroundColor(IndexedColors.RED.getIndex()); // color de fondo
         CeldaRoja.setFillForegroundColor(IndexedColors.RED.getIndex()); // color de primer plano
         CeldaRoja.setFillPattern(CellStyle.SOLID_FOREGROUND);
       CeldaRoja.setFont(font);
            //aqui le quitamos los marcos a las celas vacias
            CellStyle SinBorde = wb.createCellStyle();
            SinBorde.setBorderBottom(HSSFCellStyle.BORDER_NONE);
            SinBorde.setBorderLeft(HSSFCellStyle.BORDER_NONE);
            SinBorde.setBorderRight(HSSFCellStyle.BORDER_NONE);
            SinBorde.setBorderTop(HSSFCellStyle.BORDER_NONE);
            
        
            try {//Tabla Encabezado
                for (int i = -1; i < numFila; i++) {
                    Row fila = hoja.createRow(i + 10);//(i+numero de filas que bajara)
                    for (int j = 0; j < numColumna; j++) {
                        Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                       celda.setCellStyle(CeldaNormal);
                        if (i == -1) {
                          
                            celda.setCellStyle(SinBorde);
                            celda.setCellValue(String.valueOf(TablaEncabezado.getColumnName(j)));
                        } else {
                            
                            celda.setCellValue(String.valueOf(TablaEncabezado.getValueAt(i, j)));
                           String x=(String) TablaEncabezado.getValueAt(i,j);
                            
                            if(x.equals("Owner:")||x.equals("Truck:")||x.equals("Period:")||x.equals("Year:")){
                            celda.setCellStyle(CeldaGris);}
                        }
                        wb.write(new FileOutputStream(archivo));
                    }
                }
                respuesta = "successful export.";
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        //***************************Aqui termina la tabla encabezado******************************
        //***************************Aqui empieza la tabla viajes,subtotal,subtotalYTD,total******************************
       
         try {//TablaTotal
            for (int i = -1; i < numFila5; i++) {
                Row fila = hoja.createRow(i+14+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna5; j++) {
                    Cell celda = fila.createCell(j+7);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaVerde);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaTotal.getValueAt(i, j)));
                         String x=(String) TablaTotal.getValueAt(i,j);
                         if(x.equals("Total Pay:")){
                            celda.setCellStyle(CeldaGris);}
                         else{float y=Float.parseFloat(x);
                         if(y<=0){celda.setCellStyle(CeldaRoja);}}
                         
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
          try {//TablaSubTotal
            for (int i = -1; i < numFila3; i++) {
                Row fila = hoja.createRow(i+13+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna3; j++) {
                    Cell celda = fila.createCell(j+7);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaAmarilla);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaSubTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaSubTotal.getValueAt(i, j)));
                        String x=(String) TablaSubTotal.getValueAt(i,j);
                         if(x.equals("Sub Total:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
          
           try {//TablaSubTotalYTD
            for (int i = -1; i < numFila4; i++) {
                Row fila = hoja.getRow(i+13+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna4; j++) {
                   
                    Cell celda = fila.createCell(j+9);//(j) numero de columnas que avanzara
                     celda.setCellStyle(CeldaAmarilla);
                     
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaSubTotalYTD.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaSubTotalYTD.getValueAt(i, j)));
                        String x=(String) TablaSubTotalYTD.getValueAt(i,j);
                         if(x.equals("YTD:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//TablaViajes
            for (int i = -1; i < numFila2; i++) {
                Row fila = hoja.createRow(i+13);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna2; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
              
                    if(i==-1){
                        celda.setCellStyle(CeldaGris);
                        celda.setCellValue(String.valueOf(TablaViajes.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaViajes.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
          //***************************Aqui termina la tabla Total******************************
        //***************************Aqui empiezan las tablas Deducciones******************************
              
        try {//Tabla Total Deducciones YTD
            for (int i = -1; i < numFila9; i++) {
                Row fila = hoja.createRow(i+19+numFila2+numFila7);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna9; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaGris);
                    if(i==-1){
                      
                        celda.setCellValue(String.valueOf(TablaDeduccionTotalYTD.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionTotalYTD.getValueAt(i, j)));
                         String x=(String) TablaDeduccionTotalYTD.getValueAt(i,j);
                         if(x.equals("Total:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }try {//Tabla Semana 14
            for (int i = -1; i < numFila8; i++) {
                Row fila = hoja.createRow(i+18+numFila2+numFila7);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna8; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaSemana14.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaSemana14.getValueAt(i, j)));
                        String x=(String) TablaSemana14.getValueAt(i,j);
                         if(x.equals("week< 14:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//Tabla deduccion YTD
            for (int i = -1; i < numFila7; i++) {
                Row fila = hoja.createRow(i+18+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna7; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                   celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellStyle(CeldaGris);
                        celda.setCellValue(String.valueOf(TablaDeduccionCamionYTD.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionCamionYTD.getValueAt(i, j)));
                       
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//TablaNombre "Deduccion YTD"
            for (int i = -1; i < numFila6; i++) {
                Row fila = hoja.createRow(i+16+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna6; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    
                   celda.setCellStyle(CeldaGris);
                    if(i==-1){
                        celda.setCellStyle(SinBorde);
                        celda.setCellValue(String.valueOf(TablaDeduccionYTDNombre.getColumnName(j)));
                    }else{
                         int x=celda.getRowIndex();
                        hoja.addMergedRegion(new CellRangeAddress(
	            x, //first row (0-based)
	            x, //last row  (0-based)
	            0, //first column (0-based)
	            1  //last column  (0-based)
	    ));
                        celda.setCellValue(String.valueOf(TablaDeduccionYTDNombre.getValueAt(i, j)));
                       
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //*******************************Aqui acaban las tablas  deducciones YTD***********************************
        try {//Tabla Total Deducciones
            for (int i = -1; i < numFila12; i++) {
                Row fila = hoja.getRow(i+18+numFila2+numFila11);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna12; j++) {
                    Cell celda = fila.createCell(j+5);//(j) numero de columnas que avanzara
                   celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTotalDeducciones.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaTotalDeducciones.getValueAt(i, j)));
                        String x=(String) TablaTotalDeducciones.getValueAt(i,j);
                         if(x.equals("Total:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//Tabla Deducciones
            for (int i = -1; i < numFila11; i++) {
                Row fila = hoja.getRow(i+18+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna11; j++) {
                    Cell celda = fila.createCell(j+4);//(j) numero de columnas que avanzara
                  celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                                          celda.setCellStyle(CeldaGris);
                                celda.setCellValue(String.valueOf(TablaDeducciones.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeducciones.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {//TablaNombre "Deduccion"
            for (int i = -1; i < numFila10; i++) {
                Row fila = hoja.getRow(i+16+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna10; j++) {
                    Cell celda = fila.createCell(j+4);//(j) numero de columnas que avanzara
                  celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellStyle(SinBorde);
                        celda.setCellValue(String.valueOf(TablaDeduccionCamionNombre.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionCamionNombre.getValueAt(i, j)));
                         int x=celda.getRowIndex();
                         int y=celda.getColumnIndex();
                        hoja.addMergedRegion(new CellRangeAddress(
	            x, //first row (0-based)
	            x, //last row  (0-based)
	            y, //first column (0-based)
	            y+2  //last column  (0-based)
	    ));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return respuesta;
    }  
        
        
     private  String insertarImagen(Workbook wb, Sheet sheet) {
         String Respuesta="";
    try (InputStream inputStream = new FileInputStream("C:\\Users\\del.sistemas_res\\Downloads\\Imagen Hoja Membretada.png");) {
        System.out.println("insertaré la imagen");

        byte[] imageBytes = IOUtils.toByteArray(inputStream);

        int pictureureIdx = wb.addPicture(imageBytes, Workbook.PICTURE_TYPE_PNG);

        inputStream.close();

        CreationHelper helper = wb.getCreationHelper();

        Drawing drawing = sheet.createDrawingPatriarch();

        ClientAnchor anchor = helper.createClientAnchor();

        anchor.setCol1(1);
        anchor.setRow1(1);

        drawing.createPicture(anchor, pictureureIdx);



        Picture pict = drawing.createPicture(anchor, pictureureIdx);
        Cell cell = sheet.createRow(2).createCell(1);
pict.resize();
  Sheet hoja = wb.getSheet("Nomina");
 
        System.out.println("imagen insertada");
    } catch (Exception e) {
        System.out.println(e);
    }
       return Respuesta;
   
}


}
