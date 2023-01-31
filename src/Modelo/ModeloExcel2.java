/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author AlejandroSaenz
 */
public class ModeloExcel2 {
   Workbook wb;
    
    
    
    
     public String Exportar(File archivo, JTable tablaPagos,JTable TablaSubTotal,JTable TablaYTDSubTotal,JTable TablaTotalPay,JTable TablaDeduccionMecanicoYTD, JTable TablaDeduccoinesYTDTotal,JTable TablaDeduccionMecanico,JTable TablaTotalDeducciones,JTable TablaDeduccionYTDMecanicoNombre,JTable TablaTotalDeducciones2){
        String respuesta="the file is open.";
        int numFila=tablaPagos.getRowCount(), numColumna=tablaPagos.getColumnCount();
        int numFila2=TablaSubTotal.getRowCount(), numColumna2=TablaSubTotal.getColumnCount();
        int numFila3=TablaYTDSubTotal.getRowCount(), numColumna3=TablaYTDSubTotal.getColumnCount();
        int numFila4=TablaTotalPay.getRowCount(), numColumna4=TablaTotalPay.getColumnCount();
        //**********Aqui terminan las primeras 4 tablas****************
        int numFila5=TablaDeduccionMecanicoYTD.getRowCount(), numColumna5=TablaDeduccionMecanicoYTD.getColumnCount();
        int numFila6=TablaDeduccoinesYTDTotal.getRowCount(), numColumna6=TablaDeduccoinesYTDTotal.getColumnCount();
         //**********Aqui terminan las tablas deducciones YTD****************
          int numFila7=TablaDeduccionMecanico.getRowCount(), numColumna7=TablaDeduccionMecanico.getColumnCount();
          int numFila8=TablaTotalDeducciones.getRowCount(), numColumna8=TablaTotalDeducciones.getColumnCount();
          int numFila9=TablaDeduccionYTDMecanicoNombre.getRowCount(), numColumna9=TablaDeduccionYTDMecanicoNombre.getColumnCount();
          int numFila10=TablaTotalDeducciones2.getRowCount(), numColumna10=TablaTotalDeducciones2.getColumnCount();
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
            
        try {//Tabla TotalPay
            for (int i = -1; i < numFila4; i++) {
                Row fila = hoja.createRow(i+14+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna4; j++) {
                    Cell celda = fila.createCell(j+6);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaVerde);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTotalPay.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaTotalPay.getValueAt(i, j)));
                         String x=(String) TablaTotalPay.getValueAt(i,j);
                            
                            if(x.equals("Total Pay:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//Tabla subtotal
            for (int i = -1; i < numFila2; i++) {
                Row fila = hoja.createRow(i+13+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna2; j++) {
                    Cell celda = fila.createCell(j+6);//(j) numero de columnas que avanzara
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
         try {//Tabla subtotalYTD
            for (int i = -1; i < numFila3; i++) {
                Row fila = hoja.getRow(i+13+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna3; j++) {
                    Cell celda = fila.createCell(j+8);//(j) numero de columnas que avanzara
                                        celda.setCellStyle(CeldaAmarilla);

                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaYTDSubTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaYTDSubTotal.getValueAt(i, j)));
                        String x=(String) TablaYTDSubTotal.getValueAt(i,j);
                            
                            if(x.equals("YTD SubTotal:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {
            for (int i = -1; i < numFila; i++) {//Tabla Pagos
                Row fila = hoja.createRow(i+13);//Numero de filas que bajara
                for (int j = 0; j < numColumna; j++) {
                    Cell celda = fila.createCell(j+2);//numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(tablaPagos.getColumnName(j)));
                        celda.setCellStyle(CeldaGris);
                    }else{
                        celda.setCellValue(String.valueOf(tablaPagos.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //**********************************Aqui terminan las primeras tablas**************************
        //*********************************Aqui inician las tablas deducciones*************************
         try {//Tabla Deducciones YTD Total
            for (int i = -1; i < numFila6; i++) {
                Row fila = hoja.createRow(i+18+numFila+numFila5);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna6; j++) {
                    Cell celda = fila.createCell(j+2);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaRoja);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccoinesYTDTotal.getColumnName(j)));
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccoinesYTDTotal.getValueAt(i, j)));
                         String x=(String) TablaDeduccoinesYTDTotal.getValueAt(i,j);
                            
                            if(x.equals("YTD Deduction:")){
                            celda.setCellStyle(CeldaGris);}
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//Tabla Deducciones YTD
            for (int i = -1; i < numFila5; i++) {
                Row fila = hoja.createRow(i+18+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna5; j++) {
                    Cell celda = fila.createCell(j+2);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionMecanicoYTD.getColumnName(j)));
                        celda.setCellStyle(CeldaGris);
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionMecanicoYTD.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//Tabla Deducciones YTD nombre
            for (int i = -1; i < numFila9; i++) {
                Row fila = hoja.createRow(i+16+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna9; j++) {
                    Cell celda = fila.createCell(j+2);//(j) numero de columnas que avanzara
                    
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionYTDMecanicoNombre.getColumnName(j)));
                       celda.setCellStyle(SinBorde);
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionYTDMecanicoNombre.getValueAt(i, j)));
                        celda.setCellStyle(CeldaRoja);
                         int x=celda.getRowIndex();
                        hoja.addMergedRegion(new CellRangeAddress(
	            x, //first row (0-based)
	            x, //last row  (0-based)
	            2, //first column (0-based)
	            3  //last column  (0-based)
	    ));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //********************************Aqui terminan las tablas deducciones YTD******************************
        //********************************Aqui Empiezan las tablas deducciones *********************************
        try {//Tabla Deducciones Total
            for (int i = -1; i < numFila8; i++) {
                Row fila = hoja.getRow(i+18+numFila+numFila7);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna8; j++) {
                    Cell celda = fila.createCell(j+6);//(j) numero de columnas que avanzara
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
            for (int i = -1; i < numFila7; i++) {
                Row fila = hoja.getRow(i+18+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna7; j++) {
                    Cell celda = fila.createCell(j+5);//(j) numero de columnas que avanzara
                    celda.setCellStyle(CeldaNormal);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaDeduccionMecanico.getColumnName(j)));
                        celda.setCellStyle(CeldaGris);
                        
                    }else{
                        celda.setCellValue(String.valueOf(TablaDeduccionMecanico.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="successful export.";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        try {//Tabla Deducciones nombre 
            for (int i = -1; i < numFila10; i++) {
                Row fila = hoja.getRow(i+16+numFila);//(i+numero de filas que bajara)
                for (int j = 0; j < numColumna10; j++) {
                    Cell celda = fila.createCell(j+5);//(j) numero de columnas que avanzara
                    
                    if(i==-1){
                        celda.setCellValue(String.valueOf(TablaTotalDeducciones2.getColumnName(j)));
                       celda.setCellStyle(SinBorde);
                        
                    }else{
                        celda.setCellValue(String.valueOf(TablaTotalDeducciones2.getValueAt(i, j)));
                        celda.setCellStyle(CeldaRoja);
                         int x=celda.getRowIndex();
                        hoja.addMergedRegion(new CellRangeAddress(
	            x, //first row (0-based)
	            x, //last row  (0-based)
	            5, //first column (0-based)
	            7  //last column  (0-based)
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
