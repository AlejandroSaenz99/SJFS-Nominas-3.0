/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import Datos.AltaCamion;
import Datos.ConexionBD;
import Datos.AltaChofer;
import Datos.AltaDeduccion;
import Datos.AltaDeduccionChofer;
import Datos.AltaDeduccionMecanico;
import Datos.AltaEstado;
import Datos.AltaEstadoD;
import Datos.AltaExtraWork;
import Datos.AltaMecanico;
import Datos.AltaPago;
import Datos.AltaPagoMecanico;
import Datos.AltaPersonal;
import Datos.AltaTrailer;
import Datos.AltaViaje;
import Presentacion.Sistema;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AlejandroSaenz
 */
public class Metodos_Altas {
    Statement sentenciaSQL;
  
  ConexionBD con;
  
  public static PreparedStatement sentencia_preparada;
  
  public static ResultSet resultado;
  
  public static String url;
  
  public static int Resultado_numero = 0;
    public int consultaIdChofer() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM chofer ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
    public int consultaIdTrailer() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM trailer ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
    
     public int consultaIdCamion() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM camion ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
     public int consultaIdPagosStaff() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM pagos ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
          public int consultaIdPagosMecanico() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM pagosmecnico ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
     
       public int consultaIdPersonal() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM personal ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
       public int consultaIdMecanico() {
    int Id=0;
    try {
      String sql = "SELECT * FROM mecanico ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
      public int consultaIdViaje() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM viaje ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
      public int consultaIdDeduccionCamion() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM deducciones_camion ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
      
      public int consultaIdDeduccionMecanico() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM deducciones_mecanico ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
      
      public int consultaIdDeduccionChofer() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM deducciones_chofer ORDER BY Id Desc limit 1";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        Id = rs.getInt("Id"); 
      
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return Id + 1;
  }
    
      public void GuardarPagoMecanico(AltaPagoMecanico pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO pagosmecnico (Id,First_Name, Last_Name,Period,Date,Year,Amount,Bonus) VALUES(?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
     sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getFirst_Name());
      sentencia_preparada.setString(3, pdto.getLast_Name());
      sentencia_preparada.setInt(4, pdto.getPeriod());
      sentencia_preparada.setString(5, pdto.getDate().toString());
      sentencia_preparada.setInt(6, pdto.getYear());
      sentencia_preparada.setFloat(7, pdto.getAmount());
      
      sentencia_preparada.setFloat(8, pdto.getBonus());
     

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    }} 
      
      
      public void GuardarDeduccionSJFS(JComboBox año, JTextField Periodo,JTextField cantidad,JTextArea Detalle) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO deduccionsjfs (Year,Period,Amount,Details) VALUES(?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
    sentencia_preparada.setInt(1, Integer.parseInt(año.getSelectedItem().toString()));
      sentencia_preparada.setInt(2, Integer.parseInt(Periodo.getText()));
      sentencia_preparada.setFloat(3, Float.parseFloat(cantidad.getText()));
      
      sentencia_preparada.setString(4, Detalle.getText());
      

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    }} 
      
    public void GuardarTrabajoExtra(AltaExtraWork pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO TrabajoExtra (Id, First_Name, Last_Name,Period,Year,Date,Details,Amount) VALUES(?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getFirst_Name());
      sentencia_preparada.setString(3, pdto.getLast_Name());
      sentencia_preparada.setInt(4, pdto.getPeriod());
      sentencia_preparada.setInt(5, pdto.getYear());
      sentencia_preparada.setString(6, pdto.getDate().toString());
      sentencia_preparada.setString(7, pdto.getDetails());
      
      sentencia_preparada.setFloat(8, pdto.getAmount());
      
     

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Clase no encontrada..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    }} 
      
     
    
    public void GuardarChofer(AltaChofer pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO chofer (Id, First_Name, Last_Name,Porcentage) VALUES(?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getNombre());
      sentencia_preparada.setString(3, pdto.getApellidos());
      sentencia_preparada.setInt(4, pdto.getPorcentaje());
      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved Data", "Confirm", 1); 
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
    
    
    public void GuardarPago(AltaPago pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO pagos (Id, First_Name, Last_Name,Period,Date,Year,Amount,Bonus) VALUES(?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getFirst_Name());
      sentencia_preparada.setString(3, pdto.getLast_Name());
      sentencia_preparada.setInt(4, pdto.getPeriod());
      sentencia_preparada.setString(5, pdto.getDate().toString());
      sentencia_preparada.setInt(6, pdto.getYear());
      sentencia_preparada.setFloat(7, pdto.getAmount());
     
      sentencia_preparada.setFloat(8, pdto.getBonus());
     

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1); 
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
     
  
    public void GuardarTrailer(AltaTrailer pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO trailer (Id, Brand, Model) VALUES(?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getBrand());
      sentencia_preparada.setString(3, pdto.getModel());

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1); 
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
    
    
     public void GuardarCamion(AltaCamion pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO camion (Id, Brand, Model,Owner,Percentage) VALUES(?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getBrand());
      sentencia_preparada.setString(3, pdto.getModel());
      sentencia_preparada.setString(4, pdto.getOwner());
      sentencia_preparada.setFloat(5, pdto.getPercentage());


      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "connection error..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
     public void GuardarEstado(AltaEstado pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO Estado (Owner, Truck, Period,Status,Year) VALUES(?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setString(1, pdto.getOwner());
      sentencia_preparada.setString(2, pdto.getTruck());
      sentencia_preparada.setInt(3, pdto.getPeriod());
      sentencia_preparada.setString(4, pdto.getStatus());
      sentencia_preparada.setInt(5, pdto.getYear());


      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "connection error..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
     
      public void GuardarEstadoD(AltaEstadoD pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO estadod (First_Name, Last_Name, Period,Status,Year) VALUES(?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setString(1, pdto.getFirst_Name());
      sentencia_preparada.setString(2, pdto.getLast_Name());
      sentencia_preparada.setInt(3, pdto.getPeriod());
      sentencia_preparada.setString(4, pdto.getStatus());
      sentencia_preparada.setInt(5, pdto.getYear());


      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "connection error..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
     public void GuardarPersonal(AltaPersonal pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO personal (Id, First_Name, Last_Name) VALUES(?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getFirst_Name());
      sentencia_preparada.setString(3, pdto.getLast_Name());
      
      

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "connection error..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
     
      public void GuardarMecanico(AltaMecanico pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO mecanico (Id, First_Name, Last_Name) VALUES(?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setString(2, pdto.getFirst_Name());
      sentencia_preparada.setString(3, pdto.getLast_Name());
      
      

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "connection error..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
      
     public void GuardarViaje(AltaViaje pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO viaje (Period, No_Trip,Date,Id_Driver,First_Name,Last_Name,Ticket,BOL,"
              + " Truck, Trailer,Weight,Cost_of_the_trip,Description_of_the_cost, Amount,Driver_Pay,"
              
              + "Year, Type, Added_By, Miles, Owner,Bonus,Bonus_Details,Ticket_Percentage,SJFS_Percentage,S_J_F_S,Bonus_Driver,Details_Bonus_Driver) "
              + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
        // sentencia_preparada.setInt(1, pdto.getId());
        sentencia_preparada.setInt(1, pdto.getPeriod());
        sentencia_preparada.setInt(2, pdto.getNo_Trip());
        sentencia_preparada.setString(3, pdto.getDate().toString());
        sentencia_preparada.setInt(4, pdto.getId_Driver());
        sentencia_preparada.setString(5, pdto.getFirst_Name());
        sentencia_preparada.setString(6, pdto.getLast_Name());
        sentencia_preparada.setString(7, pdto.getTicket());
        sentencia_preparada.setString(8, pdto.getBOL());

        sentencia_preparada.setString(9, pdto.getTruck());
        sentencia_preparada.setString(10, pdto.getTrailer());

        sentencia_preparada.setFloat(11, pdto.getWeight());
        sentencia_preparada.setFloat(12, pdto.getCost_of_the_trip());
        sentencia_preparada.setString(13, pdto.getDescription_of_the_cost());

        sentencia_preparada.setFloat(14, pdto.getAmount());
        sentencia_preparada.setFloat(15, pdto.getDriver_Pay());

        sentencia_preparada.setInt(16, pdto.getYear());
        sentencia_preparada.setString(17, pdto.getType());
        sentencia_preparada.setString(18, pdto.getAdded_By());
        sentencia_preparada.setString(19, pdto.getMiles());
        sentencia_preparada.setString(20, pdto.getOwner());
        sentencia_preparada.setFloat(21, pdto.getBonus());
        sentencia_preparada.setString(22, pdto.getBonus_Details());
        sentencia_preparada.setString(23, pdto.getTicket_Percentage());
        sentencia_preparada.setFloat(24, pdto.getSJFS_Percentage());
        sentencia_preparada.setFloat(25, pdto.getS_J_F_S());
        sentencia_preparada.setFloat(26, pdto.getBonus_Driver());
        sentencia_preparada.setString(27, pdto.getDetails_Bonus_Driver());



           
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
     public void GuardarViajeConTablaCompleta(AltaViaje pdto, String Fecha) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO viaje (Period, No_Trip,Date,Id_Driver,First_Name,Last_Name,Ticket,BOL,"
              + " Truck, Trailer,Weight,Cost_of_the_trip,Description_of_the_cost, Amount,Driver_Pay,"
              
              + "Year, Type, Added_By, Miles, Owner,Bonus,Bonus_Details,Ticket_Percentage,SJFS_Percentage,S_J_F_S,Bonus_Driver,Details_Bonus_Driver) "
              + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
        // sentencia_preparada.setInt(1, pdto.getId());
        sentencia_preparada.setInt(1, pdto.getPeriod());
        sentencia_preparada.setInt(2, pdto.getNo_Trip());
        sentencia_preparada.setString(3,Fecha);
        sentencia_preparada.setInt(4, pdto.getId_Driver());
        sentencia_preparada.setString(5, pdto.getFirst_Name());
        sentencia_preparada.setString(6, pdto.getLast_Name());
        sentencia_preparada.setString(7, pdto.getTicket());
        sentencia_preparada.setString(8, pdto.getBOL());

        sentencia_preparada.setString(9, pdto.getTruck());
        sentencia_preparada.setString(10, pdto.getTrailer());

        sentencia_preparada.setFloat(11, pdto.getWeight());
        sentencia_preparada.setFloat(12, pdto.getCost_of_the_trip());
        sentencia_preparada.setString(13, pdto.getDescription_of_the_cost());

        sentencia_preparada.setFloat(14, pdto.getAmount());
        sentencia_preparada.setFloat(15, pdto.getDriver_Pay());

        sentencia_preparada.setInt(16, pdto.getYear());
        sentencia_preparada.setString(17, pdto.getType());
        sentencia_preparada.setString(18, pdto.getAdded_By());
        sentencia_preparada.setString(19, pdto.getMiles());
        sentencia_preparada.setString(20, pdto.getOwner());
        sentencia_preparada.setFloat(21, pdto.getBonus());
        sentencia_preparada.setString(22, pdto.getBonus_Details());
        sentencia_preparada.setString(23, pdto.getTicket_Percentage());
        sentencia_preparada.setFloat(24, pdto.getSJFS_Percentage());
        sentencia_preparada.setFloat(25, pdto.getS_J_F_S());
        sentencia_preparada.setFloat(26, pdto.getBonus_Driver());
        sentencia_preparada.setString(27, pdto.getDetails_Bonus_Driver());



           
      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        //JOptionPane.showMessageDialog(null, "Saved data", "Confirm", 1); 
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
     
     public void GuardarDeduccionCamion(AltaDeduccion pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO deducciones_camion (Id, Truck_Id,Period,Date,Owner,Truck,Amount,Description,Year) "
              + "VALUES(?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setInt(2, pdto.getTruck_Id());
            sentencia_preparada.setInt(3, pdto.getPeriod());

      sentencia_preparada.setString(4, pdto.getDate());
      sentencia_preparada.setString(5, pdto.getOwner());
      sentencia_preparada.setString(6, pdto.getTruck());
      sentencia_preparada.setFloat(7, pdto.getAmount());
      sentencia_preparada.setString(8, pdto.getDescription());
     sentencia_preparada.setInt(9, pdto.getYear());


           
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
     
     public void GuardarDeduccionMecanico(AltaDeduccionMecanico pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO deducciones_mecanico (Id, Mechanic_Id,Period,Date,First_Name,Last_Name,Amount,Details,Year) "
              + "VALUES(?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setInt(2, pdto.getMechanic_Id());
            sentencia_preparada.setInt(3, pdto.getPeriod());

      sentencia_preparada.setString(4, pdto.getDate());
      sentencia_preparada.setString(5, pdto.getFirst_Name());
      sentencia_preparada.setString(6, pdto.getLast_Name());
      sentencia_preparada.setFloat(7, pdto.getAmount());
      sentencia_preparada.setString(8, pdto.getDescription());
     sentencia_preparada.setInt(9, pdto.getYear());


           
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
     public void GuardarDeduccionChofer(AltaDeduccionChofer pdto) {
    try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO deducciones_chofer (Id, Driver_Id,Period,Date,First_Name,Last_Name,Amount,Description,Year) "
              + "VALUES(?,?,?,?,?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setInt(1, pdto.getId());
      sentencia_preparada.setInt(2, pdto.getDriver_Id());
            sentencia_preparada.setInt(3, pdto.getPeriod());

      sentencia_preparada.setString(4, pdto.getDate());
      sentencia_preparada.setString(5, pdto.getFirst_Name());
      sentencia_preparada.setString(6, pdto.getLast_Name());
      sentencia_preparada.setFloat(7, pdto.getAmount());
      sentencia_preparada.setString(8, pdto.getDescription());
     sentencia_preparada.setInt(9, pdto.getYear());


           
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
     
     /********************************************************************************
      *Mostrar Tablas
      */
     public JTable verBitacora(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM admin  ";
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
      public JTable MostrarTablaChofer(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM chofer ORDER BY Id ";
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
        public JTable MostrarTablaSJFS(JTable TablaDatos) {
    try {
      String sql = "SELECT  Year,Period,Truck,ROUND(SUM(S_J_F_S),2) AS 'TOTAL SJFS' FROM viaje WHERE Period>=1 GROUP BY Period,truck";
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
        public JTable SJFSPeriodo(JTable TablaDatos,JComboBox año,JTextField Periodo) {
    try {
      String sql = "SELECT  Year,Period,Truck,ROUND(SUM(S_J_F_S),2) AS 'TOTAL SJFS' FROM viaje WHERE Year='"+año.getSelectedItem()+"' AND Period='"+Periodo.getText()+"' GROUP BY Period,truck";
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
         public JTable SJFSPeriodoDeducciones(JTable TablaDatos,JComboBox año,JTextField Periodo) {
    try {
      String sql = "SELECT  * FROM deduccionsjfs WHERE Year='"+año.getSelectedItem()+"' AND Period='"+Periodo.getText()+"'";
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
         public JTable SJFSCamion(JTable TablaDatos,JComboBox año,JComboBox camion) {
    try {
      String sql = "SELECT  Year,Period,Truck,ROUND(SUM(S_J_F_S),2) AS 'TOTAL SJFS' FROM viaje WHERE Year='"+año.getSelectedItem()+"' AND Truck='"+camion.getSelectedItem()+"' GROUP BY Period,truck";
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
       public JTable MostrarTablaTotalStaff(JTable TablaDatos, JLabel txtFirst, JLabel txtLast, JComboBox combo) {
    try {
            String sql = "SELECT * FROM pagos where First_Name ='" + txtFirst.getText() + "' AND Last_Name='" + txtLast.getText() +"'AND Year= '" + combo.getSelectedItem() + "'"+"ORDER BY Id Asc";

       // String sql = "SELECT *   FROM pagos Where First_Name ='" + txtFirst.getText() + "' AND Last_Name='" + txtLast.getText() +"'AND Year= '" + combo.getSelectedItem() + "'"+"ORDER BY No_Trip Desc limit 1";
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
      
      public JTable MostrarTablaTotalMecanico(JTable TablaDatos, JLabel txtFirst, JLabel txtLast, JComboBox combo) {
    try {
            String sql = "SELECT * FROM pagosmecnico where First_Name ='" + txtFirst.getText() + "' AND Last_Name='" + txtLast.getText() +"'AND Year= '" + combo.getSelectedItem() + "'"+"ORDER BY Id Asc";

       // String sql = "SELECT *   FROM pagos Where First_Name ='" + txtFirst.getText() + "' AND Last_Name='" + txtLast.getText() +"'AND Year= '" + combo.getSelectedItem() + "'"+"ORDER BY No_Trip Desc limit 1";
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
       public JTable MostrarTablaRelacion(JTable TablaDatos) {
    try {
      String sql = "SELECT Period,Id_Driver,First_Name, Last_Name, Truck,Trailer FROM viaje ORDER BY Period";
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
      
       public JTable MostrarTablaCamion(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM camion ORDER BY Id";
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
        public JTable MostrarTablaTrailer(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM trailer ORDER BY Id";
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
       
        public JTable MostrarTablaUsuario(JTable TablaDatos) {
    try {
      String sql = "SELECT Id, First_Name, Last_Name, User_Name FROM usuarios ORDER BY Id";
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
       
        
        
        public JTable MostrarTablaDeduccion(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM deducciones ";
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
        
        
         public JTable MostrarTablaViaje(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM viaje ORDER BY Id";
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
         public JTable MostrarTablaMecanico(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM mecanico ORDER BY Id";
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
         
          public JTable MostrarTablaStaff(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM personal ORDER BY Id";
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
          
          public JTable MostrarTablaPagoMecanico(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM pagosmecnico ORDER BY Id";
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
          
          public JTable MostrarTablaPagoStaff(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM pagos ORDER BY Id";
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
         
         public JTable MostrarTablaError(JTable TablaDatos) {
    try {
      String sql = "SELECT * FROM viaje ORDER BY Id";
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
         public JTable MostrarTabla(JTable TablaDatos, JTextField Id_Driver) {
    try {
      String sql = "SELECT * FROM viaje where Id_Driver=" + Id_Driver.getText();
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
         public JTable MostrarTablaTrabajoExtra(JTable TablaDatos, AltaExtraWork Datos) {
    try {
      String sql = "SELECT * FROM TrabajoExtra where Period ='" + Datos.getPeriod() + "' AND First_Name='" + Datos.getFirst_Name() + "'AND Last_Name= '" + Datos.getLast_Name() +"' AND Year='" + Datos.getYear() + "'";
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
          public JTable MostrarTablaTicket(JTable TablaDatos, JTextField txtT) {
    try {
      String sql = "SELECT * FROM viaje where Ticket=" + txtT.getText();
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
         
  public JTable MostrarTabla3(JTable TablaDatos, JTextField txtNom) {
    try {
      String sql = "SELECT * FROM viaje where First_Name='" + txtNom.getText() + "'";
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
    public JTable MostrarTabla2(JTable TablaDatos, JTextField txtNom, JTextField txtApe) {
    try {
      String sql = "SELECT * FROM viaje where First_Name='" + txtNom.getText() + "'AND Last_Name= '" + txtApe.getText() + "'";
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
  public JTable MostrarTabla4(JTable TablaDatos, JTextField txtApe) {
    try {
      String sql = "SELECT * FROM viaje where Last_Name='" + txtApe.getText() + "'";
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
          public JTable MostrarTablaNomina(JTable TablaDatos, JTextField txtPeriodo, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño2) {
    try {
      String sql = "SELECT No_Trip AS '#Trip',Date,Trailer,BOL,Miles,Weight,Type,Cost_of_the_trip AS '$ Trip',Amount As'Amount-%',Driver_Pay,S_J_F_S AS 'SJFS',Bonus_Driver As 'Fuel SC',Bonus As 'Detention' FROM viaje where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "' order by No_Trip ASC";
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
          
          public JTable MostrarTablaDeduccionCamion(JTable TablaDatos, JTextField txtPeriodo, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño2) {
    try {
      String sql = "SELECT Id,Description, Amount FROM deducciones_camion where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
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
         public JTable MostrarTablaDeduccionMecanico(JTable TablaDatos, JTextField txtPeriodo, JTextField txtFirst,JTextField txtLast,JComboBox txtAño2) {
    try {
      String sql = "SELECT Id,Details, Amount FROM deducciones_mecanico where Period ='" + txtPeriodo.getText() + "' AND First_Name='" + txtFirst.getText() + "'AND Last_Name= '" + txtLast.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
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
           public JTable MostrarTablaBono(JTable TablaDatos, JTextField txtPeriodo, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño2) {
    try {
      String sql = "SELECT Bonus_Details,Bonus  FROM viaje where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
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
          public JTable MostrarTablaDeduccionChofer(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre,JTextField txtApellidos,JComboBox txtAño2) {
    try {
      String sql = "SELECT Id,Description, Amount FROM deducciones_chofer where Period ='" + txtPeriodo.getText() + "' AND First_Name='" + txtNombre.getText() + "'AND Last_Name= '" + txtApellidos.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
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
          
            public JTable MostrarTablaTrabajoExtra(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre,JTextField txtApellidos,JComboBox txtAño2) {
    try {
      String sql = "SELECT Date, Details, Amount FROM TrabajoExtra where Period ='" + txtPeriodo.getText() + "' AND First_Name='" + txtNombre.getText() + "'AND Last_Name= '" + txtApellidos.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
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
          
          public JTable MostrarTablaNominaStaff(JTable TablaDatos, JTextField txtperi, JLabel txtnombre,JLabel txtapellido,JComboBox año) {
    try {
      String sql = "SELECT * FROM pagos where Period ='" + txtperi.getText() + "' AND First_Name='" + txtnombre.getText() + "'AND Last_Name= '" + txtapellido.getText() +"' AND Year='" + año.getSelectedItem() + "'";
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
          
           public JTable MostrarTablaNominaMecanico(JTable TablaDatos, JTextField txtperi2, JTextField txtnombre1,JTextField txtapellido1,JComboBox año1) {
    try {
      String sql = "SELECT First_Name,Last_Name,Period,Date,Year,Amount,Bonus FROM pagosmecnico where Period ='" + txtperi2.getText() + "' AND First_Name='" + txtnombre1.getText() + "'AND Last_Name= '" + txtapellido1.getText() +"' AND Year='" + año1.getSelectedItem() + "'";
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
          
          public JTable MostrarTablaNominaCamionAño(JTable TablaDatos, JLabel Model,JComboBox Combo1) {
    try {
      String sql = "SELECT * FROM viaje where Truck ='" + Model.getText() + "' AND Year='" + Combo1.getSelectedItem() + "'";
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
          
          public JTable MostrarTablaDeduccionCamionAño(JTable TablaDatos, JLabel Model,JComboBox Combo1) {
    try {
      String sql = "SELECT * FROM deducciones_camion where Truck ='" + Model.getText() + "' AND Year='" + Combo1.getSelectedItem() + "'";
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
    return TablaDatos;}
          
          public JTable MostrarTablaNominaChoferAño(JTable TablaDatos, JLabel Nombre,JLabel Apellido,JComboBox C2) {
    try {
      String sql = "SELECT * FROM viaje where First_Name ='" + Nombre.getText() + "' AND Last_Name='" + Apellido.getText()+ "' AND Year='" + C2.getSelectedItem()+ "'";
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
          
       public JTable MostrarTablaDeduccionChoferAño(JTable TablaDatos, JLabel Nombre,JLabel Apellido,JComboBox C2) {
    try {
      String sql = "SELECT * FROM deducciones_chofer where First_Name ='" + Nombre.getText() + "' AND Last_Name='" + Apellido.getText()+ "' AND Year='" + C2.getSelectedItem()+ "'";
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
       
           public JTable MostrarTablaNominaChofer(JTable TablaDatos, JTextField txtPeriodo1, JTextField txtNombre1,JTextField txtApellido1,JComboBox txtAño) {
    try {
      String sql = "SELECT No_Trip,Date, Ticket,Truck,Trailer,Miles,Weight,Type,Driver_Pay,BOL FROM viaje where Period ='" + txtPeriodo1.getText() + "' AND First_Name='" + txtNombre1.getText() + "'AND Last_Name= '" + txtApellido1.getText() +"'AND Year= '" + txtAño.getSelectedItem() + "' Order by No_Trip";
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
          
          public JTable MostrarTablaDedu(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre,JTextField txtApellido) {
    try {
      String sql = "SELECT Id,First_Name,Last_Name,Truck,Trailer,Period,Date,Amount, Description FROM deducciones where Period ='" + txtPeriodo.getText() + "' AND First_Name='" + txtNombre.getText() + "'AND Last_Name= '" + txtApellido.getText() + "'";
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
         /******
          * Buscar
          */
         public AltaChofer ConsultaChofer(AltaChofer prov) {
    try {
      String sql = "SELECT First_Name, Last_Name, Porcentage FROM chofer WHERE Id=" + prov.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov.setNombre(rs.getString("First_Name"));
        prov.setApellidos(rs.getString("Last_Name"));
        prov.setPorcentaje(rs.getInt("Porcentage"));

        JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
         public AltaChofer ConsultaChofer2(AltaChofer prov) {
    try {
      String sql = "SELECT First_Name, Last_Name, Porcentage FROM chofer WHERE Id=" + prov.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov.setNombre(rs.getString("First_Name"));
        prov.setApellidos(rs.getString("Last_Name"));
        prov.setPorcentaje(rs.getInt("Porcentage"));

        //JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
          public AltaViaje ConsultaInformacion(AltaViaje prov) {
    try {
      String sql = "SELECT * FROM viaje WHERE Ticket=" + prov.getTicket();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
         
        prov.setId(rs.getInt("Id"));
         prov.setPeriod(rs.getInt("Period"));
          prov.setNo_Trip(rs.getInt("No_Trip"));
       // prov.setDate(rs.getDate("Date"));
         prov.setId_Driver(rs.getInt("Id_Driver"));
        prov.setFirst_Name(rs.getString("First_Name"));
        prov.setLast_Name(rs.getString("Last_Name"));
       prov.setTicket(rs.getString("Ticket"));
        prov.setBOL(rs.getString("BOL"));
        prov.setTruck(rs.getString("Truck"));
        prov.setTrailer(rs.getString("Trailer"));
        prov.setWeight(rs.getFloat("Weight"));
        prov.setCost_of_the_trip(rs.getFloat("Cost_of_the_trip"));
        prov.setDescription_of_the_cost(rs.getString("Description_of_the_cost"));
        prov.setAmount(rs.getFloat("Amount"));
        prov.setDriver_Pay(rs.getFloat("Driver_Pay"));
        prov.setYear(rs.getInt("Year"));
      prov.setType(rs.getString("Type"));
      prov.setAdded_By(rs.getString("Added_By"));
      prov.setMiles(rs.getString("Miles"));
      prov.setOwner(rs.getString("Owner"));
       prov.setBonus(rs.getFloat("Bonus"));
prov.setBonus_Details(rs.getString("Bonus_Details"));
      prov.setFirst_Name(rs.getString("Ticket_Percentage"));
      prov.setSJFS_Percentage(rs.getFloat("SJFS_Percentage"));
      prov.setS_J_F_S(rs.getFloat("S_J_F_S"));
      prov.setBonus_Driver(rs.getFloat("Bonus_Driver"));
 prov.setBonus_Details(rs.getString("Bonus_Details"));





        JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
       
    public AltaEstado ConsultaEstado(AltaEstado prov2) {
    try {
      String sql = "SELECT * FROM Estado where Period ='" + prov2.getPeriod()+ "' AND Owner='" + prov2.getOwner()+ "'AND Truck= '" + prov2.getTruck()+"' AND Year='" + prov2.getYear() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov2.setStatus(rs.getString("Status"));
        

        JOptionPane.showMessageDialog(null, "Paid out", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Not payed", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov2;
  }     
     public AltaEstadoD ConsultaEstadoD(AltaEstadoD prov2) {
    try {
      String sql = "SELECT * FROM estadod where Period ='" + prov2.getPeriod()+ "' AND First_Name='" + prov2.getFirst_Name()+ "'AND Last_Name= '" + prov2.getLast_Name()+"' AND Year='" + prov2.getYear() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov2.setStatus(rs.getString("Status"));
        

        JOptionPane.showMessageDialog(null, "Paid out", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Not payed", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov2;
  }     
       
         
          public AltaPersonal ConsultaPersonal(AltaPersonal prov) {
    try {
      String sql = "SELECT First_Name, Last_Name FROM personal WHERE Id=" + prov.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov.setFirst_Name(rs.getString("First_Name"));
        prov.setLast_Name(rs.getString("Last_Name"));

        JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
          
          public AltaMecanico ConsultaMecanico(AltaMecanico prov) {
    try {
      String sql = "SELECT First_Name, Last_Name FROM mecanico WHERE Id=" + prov.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov.setFirst_Name(rs.getString("First_Name"));
        prov.setLast_Name(rs.getString("Last_Name"));

        JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
        
           public AltaCamion ConsultaCamion(AltaCamion prov) {
   
    try {
      String sql = "SELECT Model, Owner,Percentage FROM camion WHERE Id=" + prov.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov.setModel(rs.getString("Model"));
        prov.setOwner(rs.getString("Owner"));
        prov.setPercentage(rs.getFloat("Percentage"));
      
        JOptionPane.showMessageDialog(null, "Data Found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not Found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
  
   
           
            public AltaTrailer ConsultaTrailer(AltaTrailer prov) {
    try {
      String sql = "SELECT Model FROM trailer WHERE Id=" + prov.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        prov.setModel(rs.getString("Model"));
        JOptionPane.showMessageDialog(null, "Data Found", "Warning", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Data not Found", "Warning", 0);
      } 
      this.sentenciaSQL.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return prov;
  }
            /***********Consultar numero de viaje segun periodo noombre y appelido
             * 
             */
             public int consultaViaje(JTextField txtperiodo,JLabel txtFirst,JLabel txtLast,JComboBox año) {
    int NumeroViaje = 0;
    try {
     // String sql = "SELECT * FROM viaje where Periodo=" + txtperiodo.getText();
            String sql = "SELECT * FROM viaje where Period ='" + txtperiodo.getText() + "' AND First_Name='" + txtFirst.getText() + "'AND Last_Name= '" + txtLast.getText() +"'AND Year= '" + año.getSelectedItem() + "'"+"ORDER BY No_Trip Desc limit 1";
        System.out.println(sql);
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.first())
        NumeroViaje = rs.getInt("No_Trip"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return NumeroViaje + 1;
  }
             
              public int consultaViajeNormal(JTextField txtperiodo,JLabel txtFirst,JLabel txtLast) {
    int NumeroViaje = 0;
    try {
     // String sql = "SELECT * FROM viaje where Periodo=" + txtperiodo.getText();
            String sql = "SELECT * FROM viaje where Period ='" + txtperiodo.getText() + "' AND First_Name='" + txtFirst.getText() + "'AND Last_Name= '" + txtLast.getText() + "'";

      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.last())
        NumeroViaje = rs.getInt("No_Trip"); 
      rs.close();
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return NumeroViaje;
  }
             /*********************
              * Metodos para eliminar y actualizar
              */
              public void EliminarChofer(AltaChofer prod) {
       
    try {
      String sql = "DELETE  FROM chofer WHERE Id=" + prod.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "deleted data: ", "deleted data", 1); 
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
              public void borrarTrabajoExtra(JLabel borrar) {
       
    try {
      String sql = "DELETE  FROM TrabajoExtra WHERE Id=" + borrar.getText();
        System.out.println(sql);
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "deleted data: ", "deleted data", 1); 
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
              public void EliminarCamion(AltaCamion prod) {
       
    try {
      String sql = "DELETE  FROM camion WHERE Id=" + prod.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "deleted data: ", "deleted data", 1); 
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
               public void EliminarTrailer(AltaTrailer prod) {
       
    try {
      String sql = "DELETE  FROM trailer WHERE Id=" + prod.getId();
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "deleted data: ", "deleted data", 1); 
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
         

   
   public void ActualizarChofer(AltaChofer prod) {
    String sql = "UPDATE chofer SET Id=?, First_Name=?,Last_Name=?, Porcentage=? WHERE Id=?";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
      sentencia_preparada.setInt(1, prod.getId());
      sentencia_preparada.setString(2, prod.getNombre());
      sentencia_preparada.setString(3, prod.getApellidos());
      sentencia_preparada.setInt(4, prod.getPorcentaje());
      sentencia_preparada.setInt(5, prod.getId());
      int n = sentencia_preparada.executeUpdate();
      if (n >= 0)
        JOptionPane.showMessageDialog(null, "modified data", "modified data", 1); 
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
   
   public void ActualizarCamion(AltaCamion prod) {
    String sql = "UPDATE camion SET Id=?, Brand=?,Model=?, Owner=?, Percentage=? WHERE Id=?";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
      sentencia_preparada.setInt(1, prod.getId());
      sentencia_preparada.setString(2, prod.getBrand());
      sentencia_preparada.setString(3, prod.getModel());
      sentencia_preparada.setString(4, prod.getOwner());
      sentencia_preparada.setFloat(5, prod.getPercentage());
      sentencia_preparada.setInt(6, prod.getId());
      int n = sentencia_preparada.executeUpdate();
      if (n >= 0)
        JOptionPane.showMessageDialog(null, "modified data", "modified data", 1); 
      this.con.CerrarConexion();
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found..." + ex);
    } catch (InstantiationException ex) {
      JOptionPane.showMessageDialog(null, "Error de conexion..." + ex);
    } catch (IllegalAccessException ex) {
      JOptionPane.showMessageDialog(null, "Acceso ilegal a la base de datos..." + ex);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error de sentencia..." + ex);
    } 
  }
  
   public void ActualizarTrailer(AltaTrailer prod) {
    String sql = "UPDATE trailer SET Id=?, Brand=?,Model=? WHERE Id=?";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
      sentencia_preparada.setInt(1, prod.getId());
      sentencia_preparada.setString(2, prod.getBrand());
      sentencia_preparada.setString(3, prod.getModel());
      sentencia_preparada.setInt(4, prod.getId());
      int n = sentencia_preparada.executeUpdate();
      if (n >= 0)
        JOptionPane.showMessageDialog(null, "modified data", "modified data", 1); 
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

    public void EliminarUsuario(int Id, String Nombre, String Apellidos, String Usuario, String Contraseña) {
    try {
      String sql = "DELETE FROM usuarios WHERE Id=" + Id;
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Deleted User ", "Confim", 1); 
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

    public float ConsultaYTDChofer(JTextField txtPeriodo1, JTextField txtNombre1,JTextField txtApellido1,JComboBox txtAño,JTextField YearToDate) {
        float YTD=0,SumaViaje=0,SumaExtra=0;
        try {
      String sql = "SELECT SUM(Driver_Pay) AS 'Total' From viaje where Period <='" + txtPeriodo1.getText() + "' AND First_Name='" + txtNombre1.getText() + "'AND Last_Name= '" + txtApellido1.getText() +"' AND Year='" + txtAño.getSelectedItem() + "'";
      String sql2 = "SELECT SUM(Amount) AS 'TotalExtra' From TrabajoExtra where Period <='" + txtPeriodo1.getText() + "' AND First_Name='" + txtNombre1.getText() + "'AND Last_Name= '" + txtApellido1.getText() +"' AND Year='" + txtAño.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();//Abro sentencia 1
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      
      if (rs.next()) {
        SumaViaje= rs.getFloat("Total");
         
      //  JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
          System.out.println("No entro en el metodo1");
      } 
      
     
      this.sentenciaSQL.close();//Cierro sentencia 1
      this.sentenciaSQL = this.con.Conectarse().createStatement();//Abro sentencia 2
      ResultSet rs2 = this.sentenciaSQL.executeQuery(sql2);
      
      if (rs2.next()) {
        SumaExtra= rs2.getFloat("TotalExtra");
         
      //  JOptionPane.showMessageDialog(null, "Data found", "Warning", 1);
      } else {
          System.out.println("No entro en el metodo2");
      } 
      
      
      this.sentenciaSQL.close();//Cierro sentencia 2
       YTD=SumaExtra+SumaViaje; 
      YearToDate.setText(""+YTD);
      this.con.CerrarConexion();
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error por clase no encontrada, instancia, acceso ilegal y sentencia: " + ex, "Error", 0);
    } 
    return YTD;
  }
    
    
    
    public float ConsultaYTDChoferDeducciones(JTextField txtPeriodo1, JTextField txtNombre1,JTextField txtApellido1,JComboBox txtAño,JTextField YTDD) {
        float YTD=0;
        try {
      String sql = "SELECT SUM(Amount) AS 'Total' From deducciones_chofer where Period <='" + txtPeriodo1.getText() + "' AND First_Name='" + txtNombre1.getText() + "'AND Last_Name= '" + txtApellido1.getText() +"' AND Year='" + txtAño.getSelectedItem() + "'";
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
    
    public float ConsultaYTDCamion(JTextField txtPeriodo1, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño1,JTextField YearToDate1) {
        float YTD=0;
        try {
      String sql = "SELECT SUM(Amount) AS 'Total' From viaje where Period <='" + txtPeriodo1.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño1.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        YTD= rs.getFloat("Total");
        YearToDate1.setText(""+YTD);
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
    public float ConsultaYTDMecanico(JTextField txtPeriodo, JTextField txtNombre,JTextField txtApellido,JComboBox txtAño,JTextField YearToDate) {
        float YTD=0,Bonus=0,Suma=0;
        try {
      String sql = "SELECT SUM(Amount) AS 'Total',SUM(Bonus) AS 'TotalBonus' From pagosmecnico where Period <='" + txtPeriodo.getText() + "' AND First_Name='" + txtNombre.getText() + "'AND Last_Name= '" + txtApellido.getText() +"' AND Year='" + txtAño.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
          Bonus=rs.getFloat("TotalBonus");
        Suma= rs.getFloat("Total");
        YTD=Bonus+Suma;
        YearToDate.setText(""+YTD);
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
    
     public float ConsultaYTDCamionDeduccion(JTextField txtPeriodo1, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño1,JTextField YearToDate1,JTable TablaDeduccionYTD) {
        float YTD=0;
        try {
      String sql = "SELECT ROUND(SUM(Amount),2) AS 'Total' From deducciones_camion where Period <='" + txtPeriodo1.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño1.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      if (rs.next()) {
        YTD= rs.getFloat("Total");
        YearToDate1.setText(""+YTD);
          System.out.println(YTD);
          TablaDeduccionYTD.setValueAt(YTD, 0, 1);
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
    
     public JTable MostrarTablaYTDDetallado(JTable TablaDatos, JTextField txtPeriodo, JTextField txtDueño,JTextField txtCamion,JComboBox txtAño2) {
    try {
        System.out.println("entra al deduction ytd");
      //String sql="SELECT Description, ROUND(SUM(Amount),2) AS 'YTD' FROM deducciones_camion WHERE Period>14 AND Period <='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() +"'GROUP BY Description";
      String sql="SELECT Description, ROUND(SUM(Amount),2) AS 'YTD' FROM deducciones_camion WHERE Period>0 AND Period <='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() +"'GROUP BY Description";
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
      public JTable MostrarTablaYTDDetalladoMecanico(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre,JTextField txtApellido,JComboBox txtAño) {
    try {
      String sql="SELECT Details, ROUND(SUM(Amount),2) AS 'YTD' FROM deducciones_mecanico WHERE Period <='" + txtPeriodo.getText() + "' AND First_Name='" + txtNombre.getText() + "'AND Last_Name= '" + txtApellido.getText() +"' AND Year='" + txtAño.getSelectedItem() +"'GROUP BY Details";
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
       public ComboBoxModel LlenarChoferes(){
     JComboBox combo=null;
        combo= new JComboBox();
        combo.addItem("Driver");
    try {
        
       
      String sql = "SELECT First_Name, Last_Name FROM chofer Order by Id";
        
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      while(rs.next()){
      
      combo.addItem(rs.getString("First_Name")+" "+rs.getString("Last_Name"));}
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
    return combo.getModel();
    }
       public ComboBoxModel llenarCamion(){
     JComboBox combo=null;
        combo= new JComboBox();
        combo.addItem("Truck");
    try {
        
       
      String sql = "SELECT Model FROM camion Order by Id";
        
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      ResultSet rs = this.sentenciaSQL.executeQuery(sql);
      while(rs.next()){
      
      combo.addItem(rs.getString("Model"));}
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
    return combo.getModel();
    }

    public void Notas(JTextField txtDueño, JTextField txtCamion, JTextField txtPeriodo, JTextArea Notas, JComboBox txtAño2) {
        try {
      this.con = new ConexionBD();
      String insertar = "INSERT INTO notas (Owner, Truck, Period,Nota ,Year) VALUES(?,?,?,?,?)";
      
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(insertar);
      sentencia_preparada.setString(1, txtDueño.getText());
      sentencia_preparada.setString(2, txtCamion.getText());
      sentencia_preparada.setInt(3, Integer.parseInt(txtPeriodo.getText()));
      sentencia_preparada.setString(4, Notas.getText());
      sentencia_preparada.setInt(5, Integer.parseInt(txtAño2.getSelectedItem().toString()));
    

      int n = sentencia_preparada.executeUpdate();
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Saved data ", "Confirm", 1); 
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
    public void ActualizarNotas(JTextField txtDueño, JTextField txtCamion, JTextField txtPeriodo, JTextArea Notas, JComboBox txtAño2) {
    String sql = "UPDATE notas SET Nota=? where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
      sentencia_preparada.setString(1, Notas.getText());
     
      int n = sentencia_preparada.executeUpdate();
      if (n >= 0)
        JOptionPane.showMessageDialog(null, "modified data", "modified data", 1); 
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
    
        public static String BuscarNota(JTextField txtDueño, JTextField txtCamion, JTextField txtPeriodo, JTextArea Notas, JComboBox txtAño2) {
        String Busqueda_Nombre = null;
        String Nota="";
        Connection conexion = null;
        try {
            ConexionBD con = new ConexionBD();
            String Sentencia_Buscar = "SELECT Nota FROM notas where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";

            PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {

                 Nota = resultado.getString("Nota");
                
             
            }
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception exception) {
        }

        return Nota;
    }
public void borrarNotas(JTextField txtDueño, JTextField txtCamion, JTextField txtPeriodo, JTextArea Notas, JComboBox txtAño2) {
        try {
      String sql = "DELETE  FROM notas where Period ='" + txtPeriodo.getText() + "' AND Owner='" + txtDueño.getText() + "'AND Truck= '" + txtCamion.getText() +"' AND Year='" + txtAño2.getSelectedItem() + "'";
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Ready: ", "Ready", 1); 
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
}
