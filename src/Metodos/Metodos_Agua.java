/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Datos.AltaAgua;
import Datos.AltaDeduccionAgua;
import Datos.AltaDeduccionChoferAgua;
import Datos.AltaPagoMecanico;
import Datos.ConexionBD;
import Puentes.puenteAltas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AlejandroSaenz
 */
public class Metodos_Agua {

    Statement sentenciaSQL;

    ConexionBD con;

    public static PreparedStatement sentencia_preparada;

    public static ResultSet resultado;

    public static String url;

    public static int Resultado_numero = 0;

    public void GuardarHoras(AltaAgua pdto) {
        try {
            this.con = new ConexionBD();
            String insertar = "INSERT INTO Agua (First_Name, Last_Name,Truck,Owner,Trailer,Period,Year,Date,Location,Hours,Start_Time,End_Time,Ticket,Rate,Amount,SJFS,Truck_Pay) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
            sentencia_preparada.setString(1, pdto.getFirst_Name());
            sentencia_preparada.setString(2, pdto.getLast_Name());
            sentencia_preparada.setString(3, pdto.getTruck());
            sentencia_preparada.setString(4, pdto.getOwner());
            sentencia_preparada.setString(5, pdto.getTrailer());
            sentencia_preparada.setInt(6, pdto.getPeriod());
            sentencia_preparada.setInt(7, pdto.getYear());
            sentencia_preparada.setString(8, pdto.getFecha().toString());
            sentencia_preparada.setString(9, pdto.getLocation());

            sentencia_preparada.setFloat(10, pdto.getHours());
            sentencia_preparada.setString(11, pdto.getStart_Time());
            sentencia_preparada.setString(12, pdto.getEnd_Time());
            sentencia_preparada.setString(13, pdto.getTicket());
            sentencia_preparada.setFloat(14, pdto.getRate());
            sentencia_preparada.setFloat(15, pdto.getAmount());
            sentencia_preparada.setFloat(16, pdto.getSJFS());
            sentencia_preparada.setFloat(17, pdto.getTruck_Pay());

            int n = sentencia_preparada.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1);
            }
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
    }

    public JTable NominaCamion(int txtAño, String txtCamion,String Dueño, int txtPeriodo, JTable TablaDatos) {
        try {
            String sql = "SELECT   Ticket,Date, Location,Start_Time,End_time, Hours, Rate, Amount,SJFS,Truck_Pay FROM Agua WHERE Year=" + txtAño  + " AND Period=" + txtPeriodo + " AND Truck='" + txtCamion + "'";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaDatos.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
        return TablaDatos;
    }
 
    public JTable NominaChofer(int txtAño, String txtNombre,String txtApellido, int txtPeriodo, JTable TablaDatos) {
        try {
            String sql = "SELECT   First_Name, Last_Name, Ticket,Date, Location,Start_Time,End_time, Hours FROM Agua WHERE Year=" + txtAño + " AND Period=" + txtPeriodo + " AND First_Name='" + txtNombre + "' AND Last_Name='"+txtApellido+"'";
            System.out.println(sql);
            this.con = new ConexionBD();
            this.sentenciaSQL = this.con.Conectarse().createStatement();
            ResultSet rs = this.sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while (rs.next()) {
                String[] fila = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j + 1);
                }
                modelo.addRow((Object[]) fila);
            }
            TablaDatos.setModel(modelo);
            rs.close();
            this.con.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
        }
        return TablaDatos;
    }

    
    public JTable MostrarTablaDeduccionChofer(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre,JTextField txtApellidos,JComboBox txtAño2) {
    try {
      String sql = "SELECT Id,Description, Amount FROM DeduChoferAgua where Period ='" + txtPeriodo.getText() + "' AND First_Name='" + txtNombre.getText() + "'AND Last_Name= '" + txtApellidos.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      ResultSetMetaData rsm = rs.getMetaData();
      int col = rsm.getColumnCount();
      DefaultTableModel modelo = new DefaultTableModel();
      for (int i = 1; i <= col; i++)
        modelo.addColumn(rsm.getColumnLabel(i)); 
      while (rs.next()) {
        String[] fila = new String[col];
        for (int j = 0; j < col; j++)
          fila[j] = rs.getString(j + 1); 
        modelo.addRow((Object[])fila);
      } 
      TablaDatos.setModel(modelo);
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
    return TablaDatos;
  }
        
    
   public void BorrarDeduccionChofer(int Id) {
    try {
      String sql = "DELETE FROM DeduChoferAgua WHERE Id=" + Id;
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Deleted Data ", "Confimacion", 1); 
      this.con.CerrarConexion();
      this.sentenciaSQL.close();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Error 1: " + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error 2: " + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Error 3: " + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error 4: " + ex);
    } 
  }
       public void GuardarDeduccionChofer(AltaDeduccionChoferAgua pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO DeduChoferAgua ( Driver_Id,Period,Date,First_Name,Last_Name,Amount,Description,Year) "
              + "VALUES(?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getDriver_Id());
            sentencia_preparada.setInt(2, pdto.getPeriod());

      sentencia_preparada.setString(3, pdto.getDate());
      sentencia_preparada.setString(4, pdto.getFirst_Name());
      sentencia_preparada.setString(5, pdto.getLast_Name());
      sentencia_preparada.setFloat(6, pdto.getAmount());
      sentencia_preparada.setString(7, pdto.getDescription());
     sentencia_preparada.setInt(8, pdto.getYear());


           
      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
     
       public float ConsultaYTDChoferDeducciones(JTextField txtPeriodo1, JTextField txtNombre1,JTextField txtApellido1,JComboBox txtAño,JLabel YTDD) {
        float YTD=0;
        try {
      String sql = "SELECT SUM(Amount) AS 'Total' From DeduChoferAgua where Period <='" + txtPeriodo1.getText() + "' AND First_Name='" + txtNombre1.getText() + "'AND Last_Name= '" + txtApellido1.getText() +"' AND Year='" + txtAño.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        YTD= rs.getFloat("Total");
        YTDD.setText(""+YTD);
          System.out.println(YTD);
      //  JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
        //JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return YTD;
  }
       
       public void GuardarDeduccionCamion(AltaDeduccionAgua pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO DeduCamionAgua (Truck_Id,Period,Date,Owner,Truck,Amount,Description,Year) "
              + "VALUES(?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getTruck_Id());
            sentencia_preparada.setInt(2, pdto.getPeriod());

      sentencia_preparada.setString(3, pdto.getDate());
      sentencia_preparada.setString(4, pdto.getOwner());
      sentencia_preparada.setString(5, pdto.getTruck());
      sentencia_preparada.setFloat(6, pdto.getAmount());
      sentencia_preparada.setString(7, pdto.getDescription());
     sentencia_preparada.setInt(8, pdto.getYear());


           
      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
     
       
           public JTable MostrarTablaDeduccionCamion(JTable TablaDatos, JTextField txtPeriodo, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño2) {
    try {
      String sql = "SELECT Id,Description, Amount FROM DeduCamionAgua where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      ResultSetMetaData rsm = rs.getMetaData();
      int col = rsm.getColumnCount();
      DefaultTableModel modelo = new DefaultTableModel();
      for (int i = 1; i <= col; i++)
        modelo.addColumn(rsm.getColumnLabel(i)); 
      while (rs.next()) {
        String[] fila = new String[col];
        for (int j = 0; j < col; j++)
          fila[j] = rs.getString(j + 1); 
        modelo.addRow((Object[])fila);
      } 
      TablaDatos.setModel(modelo);
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
    return TablaDatos;
  }
       
            public JTable MostrarTablaYTDDetallado(JTable TablaDatos, JTextField txtPeriodo, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño2) {
    try {
      String sql="SELECT Description, ROUND(SUM(Amount),2) AS 'YTD' FROM DeduCamionAgua WHERE Period>0 AND Period <='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() +"'GROUP BY Description";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      ResultSetMetaData rsm = rs.getMetaData();
      int col = rsm.getColumnCount();
      DefaultTableModel modelo = new DefaultTableModel();
      for (int i = 1; i <= col; i++)
        modelo.addColumn(rsm.getColumnLabel(i)); 
      while (rs.next()) {
        String[] fila = new String[col];
        for (int j = 0; j < col; j++)
          fila[j] = rs.getString(j + 1); 
        modelo.addRow((Object[])fila);
      } 
      TablaDatos.setModel(modelo);
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
    return TablaDatos;
  }
     
             public float ConsultaYTDCamion(JTextField txtPeriodo1, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño1,JTable YearToDate1) {
        float YTD=0;
        try {
      String sql = "SELECT SUM(Truck_Pay) AS 'Total' From Agua where Period <='" + txtPeriodo1.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño1.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        YTD= rs.getFloat("Total");
        YearToDate1.setValueAt(YTD, 0, 1);
      //  JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
      //  JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return YTD;
  }
  
}
