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
public class ModeloExcel3 {
      Workbook wb;
    
    
    public String ExportarCamion(File archivo, JTable TablaEncabezado,JTable TablaViajes,JTable TablaSubTotal,JTable TablaSubTotalYTD,JTable TablaTotal,JTable TablaDeduccionYTDNombre, JTable TablaDeduccionCamionYTD,JTable TablaDeduccionTotalYTD
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
        //int numFila8=TablaSemana14.getRowCount(), numColumna8=TablaSemana14.getColumnCount();
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
                Row fila = hoja.createRow(i+18+numFila2+numFila7);//(i+numero de filas que bajara)
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
        
    
    public String ExportarChofer(File archivo, JTable TablaEncabezado,JTable TablaViajes,JTable TablaSubTotal,JTable TablaSubTotalYTD,JTable TablaDeduccionYTDNombre
        ,JTable TablaDeduccionCamionNombre,JTable TablaDeducciones,JTable TablaTotalDeducciones){
        String respuesta="the file is open.";
        int numFila=TablaEncabezado.getRowCount(), numColumna=TablaEncabezado.getColumnCount();
        //************************Aqui termina la tabla encabezado****************************
        int numFila2=TablaViajes.getRowCount(), numColumna2=TablaViajes.getColumnCount();
        int numFila3=TablaSubTotal.getRowCount(), numColumna3=TablaSubTotal.getColumnCount();
        int numFila4=TablaSubTotalYTD.getRowCount(), numColumna4=TablaSubTotalYTD.getColumnCount();
        
                //************************Aqui terminan las tablas viaje, sub total, subtotalYTD y total****************************
        int numFila6=TablaDeduccionYTDNombre.getRowCount(), numColumna6=TablaDeduccionYTDNombre.getColumnCount();
        //int numFila8=TablaSemana14.getRowCount(), numColumna8=TablaSemana14.getColumnCount();
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
                Row fila = hoja.createRow(i+10);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaEncabezado.getColumnName(j)));
                         celda.setCellStyle(SinBorde);
                    }else{
                        celda.setCellValue(String.valueOf(TablaEncabezado.getValueAt(i, j)));
                        String x=(String) TablaEncabezado.getValueAt(i,j);
                            
                            if(x.equals("Name:")||x.equals("Period:")||x.equals("Year:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
      
    }
        //***************************Aqui termina la tabla encabezado******************************
        //***************************Aqui empieza la tabla viajes,subtotal,subtotalYTD,total******************************
       
        
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
              
      
        
        
       
    try {//TablaPaga
            for (int i = -1; i < numFila6; i++) {
                Row fila = hoja.createRow(i+16+numFila2);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna6; j++) {
                    Cell celda = fila.createCell(j);//(j) numero de columnas que avanzara
                    //(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
              
                    if(i==-1){
                        celda.setCellStyle(CeldaGris);
                        celda.setCellValue(String.valueOf(TablaDeduccionYTDNombre.getColumnName(j)));
                    }else{
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
        
}
