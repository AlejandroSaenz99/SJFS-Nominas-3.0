package Metodos;

import Datos.AltaChofer;
import Datos.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Metodos_sql {

        

        
  Statement sentenciaSQL;
  
  ConexionBD con;
  
  public static PreparedStatement sentencia_preparada;
  
  public static ResultSet resultado;
  
  public static String url;
  
  public static int Resultado_numero = 0;
  
  public int Guardar(int Id, String First_Name, String Last_Name, String User_Name, String Password) {
    int resultado = 0;
    Connection conexion = null;
    String Sentencia_Guardar = "INSERT INTO usuarios (Id, First_Name, Last_Name, User_Name, Password)VALUES(?,?,?,?,?) ";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(Sentencia_Guardar);
      sentencia_preparada.setInt(1, Id);
      sentencia_preparada.setString(2, First_Name);
      sentencia_preparada.setString(3, Last_Name);
      sentencia_preparada.setString(4, User_Name);
      sentencia_preparada.setString(5, Password);
      resultado = sentencia_preparada.executeUpdate();
      JOptionPane.showMessageDialog(null, "Welcome " + First_Name);
      sentencia_preparada.close();
      conexion.close();
    } catch (Exception e) {
      System.out.println(e);
    } 
    return resultado;
  }
   public int GuardarBitacora(String Usuario, String Fecha, String Hora) {
    int resultado = 0;
    Connection conexion = null;
    String Sentencia_Guardar = "INSERT INTO admin (Usuario, Fecha, Hora)VALUES(?,?,?) ";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(Sentencia_Guardar);
    
      sentencia_preparada.setString(1, Usuario);
      sentencia_preparada.setString(2, Fecha);
      sentencia_preparada.setString(3, Hora);
      resultado = sentencia_preparada.executeUpdate();
      
      sentencia_preparada.close();
      conexion.close();
    } catch (Exception e) {
      System.out.println(e);
    } 
    return resultado;
  }
  
/*     */   public static String Buscar_Nombre(String Usuario) {
/*  68 */     String Busqueda_Nombre = null;
/*  69 */     Connection conexion = null;
/*     */     try {
/*  71 */       ConexionBD con = new ConexionBD();
/*  72 */       String Sentencia_Buscar = "SELECT First_Name,Last_Name, User_Name,Password FROM usuarios WHERE User_Name=  '" + Usuario + "'";
/*     */       
/*  74 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar);
/*  75 */       resultado = sentencia_preparada.executeQuery();
/*  76 */       if (resultado.next()) {
/*     */         
/*  78 */         String Nombre = resultado.getString("First_Name");
/*  79 */         String Apellidos = resultado.getString("Last_Name");
/*  80 */         Busqueda_Nombre = Nombre + " " + Apellidos;
/*     */       } 
/*  82 */       sentencia_preparada.close();
/*  83 */       conexion.close();
/*  84 */     } catch (Exception exception) {}
/*     */     
/*  86 */     return Busqueda_Nombre;
/*     */   }



            public static String Buscar_Muebles(JLabel txtFirst, JLabel txtLast, JTextField txtPeriodo,JLabel txtTruck,JLabel txtTrailer,JLabel Dueño,JComboBox año,JLabel txtPorcentaje) {
/*  68 */     String Busqueda_Nombre = null;
/*  69 */     Connection conexion = null;
/*     */     try {
/*  71 */       ConexionBD con = new ConexionBD();
/*  72 */       String Sentencia_Buscar = "SELECT Truck,Trailer,Owner,SJFS_Percentage FROM viaje WHERE First_Name=  '" + txtFirst.getText() + "' AND Last_Name='" + txtLast.getText() + "'AND Period= '" + txtPeriodo.getText() +"'AND Year= '" + año.getSelectedItem() + "'";
/*     */       
/*  74 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar);
/*  75 */       resultado = sentencia_preparada.executeQuery();
/*  76 */       if (resultado.next()) {
/*     */         
/*  78 */         String Truck = resultado.getString("Truck");
/*  79 */         String Trailer = resultado.getString("Trailer");
                   String Owner = resultado.getString("Owner");
                   Float Percentage=resultado.getFloat("SJFS_Percentage");
txtTruck.setText(Truck);
Dueño.setText(Owner);
txtTrailer.setText(Trailer);
txtPorcentaje.setText(""+Percentage);

/*  80 */         Busqueda_Nombre = Truck + " " + Trailer;
/*     */       } 
/*  82 */       sentencia_preparada.close();
/*  83 */       conexion.close();
/*  84 */     } catch (Exception exception) {}
/*     */     
/*  86 */     return Busqueda_Nombre;
/*     */   }
                    public static String Buscar_Todo(JLabel Dueño, JLabel Modelo, JTextField txtViaje, JTextField txtPeriodo, JTextField txtCantidad,
                            JTextArea txtDesc, JComboBox<String> añito, JLabel o1, JLabel o2, JLabel o3, JLabel o4, JLabel o5, JLabel o6, JLabel o7,
                            JLabel o8, JLabel o9, JLabel o10, JLabel o11, JLabel o12, JLabel o13, JLabel o14, JLabel o15, JLabel o16, JLabel o17,
                            JLabel o18, JLabel o19, JLabel o20, JLabel o21, JLabel o22, JLabel o23, JLabel o24, JLabel o25, JLabel o26, JLabel o27, JLabel o28) {


              String Busqueda_Nombre = null;
/*  69 */     Connection conexion = null;
/*     */     try {
/*  71 */       ConexionBD con = new ConexionBD();
/*  72 */       String Sentencia_Buscar = "SELECT * FROM viaje WHERE Owner=  '" + Dueño.getText() + "' AND Truck='" + Modelo.getText() + "'AND Number_Of_Trip= '" + txtViaje.getText() + "'AND Period= '" + txtPeriodo.getText() +"'AND Year= '" + añito.getSelectedItem() +"'";
/*     */       
/*  74 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar);
/*  75 */       resultado = sentencia_preparada.executeQuery();
/*  76 */       if (resultado.next()) {
/*     */         
/*  78 */         String id = resultado.getString("Id");
/*  78 */         String periodo = resultado.getString("Period");
/*  78 */         String  viaje= resultado.getString("Number_Of_Trip");
/*  78 */         String  fecha= resultado.getString("Date");
/*  78 */         String driver_id = resultado.getString("Id_Driver");
/*  78 */         String  nombre= resultado.getString("First_Name");
/*  78 */         String apellido = resultado.getString("Last_Name");
/*  78 */         String  ticket= resultado.getString("Ticket");
/*  78 */         String  BOL= resultado.getString("BOL");
/*  78 */         String  camion= resultado.getString("Truck");
/*  78 */         String  trailer= resultado.getString("Trailer");
/*  78 */         String  peso= resultado.getString("Weight");
/*  78 */         String  costo= resultado.getString("Cost_of_the_trip");
/*  78 */         String  descripcion= resultado.getString("Description_of_the_cost");
/*  78 */         String  cantidad= resultado.getString("Amount");
/*  78 */         String  pago= resultado.getString("Driver_Pay");
/*  78 */         String  deduccionD= resultado.getString("Driver_Deduction");
/*  78 */         String  DDD= resultado.getString("Driver_Deduction_Details");
/*  78 */         String deduccionT = resultado.getString("Truck_Deduction");
/*  78 */         String  DDT= resultado.getString("Truck_Deduction_Details");


                   String z11=resultado.getString("Year");
                   String z12=resultado.getString("Type");
                   String z13=resultado.getString("Added_By");
                   String z14=resultado.getString("Distance");
                   String z15=resultado.getString("Owner");
                   String z16=resultado.getString("Bonus");
                   String z17=resultado.getString("Bonus_Details");
                   String z18=resultado.getString("Ticket_Percentage");
/*  79 */         
o1.setText(id);
o2.setText(periodo);
o3.setText(viaje);
o4.setText(fecha);
o5.setText(driver_id);
o6.setText(nombre);
o7.setText(apellido);
o8.setText(ticket);
o9.setText(BOL);
o10.setText(camion);
o11.setText(trailer);
o12.setText(peso);
o13.setText(costo);
o14.setText(descripcion);
o15.setText(cantidad);
o16.setText(pago);
o17.setText(deduccionD);
o18.setText(DDD);
o19.setText(deduccionT);
o20.setText(DDT);
o21.setText(z11);
o22.setText(z12);
o23.setText(z13);
o24.setText(z14);
o25.setText(z15);
o26.setText(z16);
o27.setText(z17);
o28.setText(z18);
txtCantidad.setText(deduccionT);
txtDesc.setText(DDT);


/*  80 */         Busqueda_Nombre = "successful search";
/*     */       } 
/*  82 */       sentencia_preparada.close();
/*  83 */       conexion.close();
/*  84 */     } catch (Exception exception) {}
/*     */     
/*  86 */     return Busqueda_Nombre;
/*     */   }
             
              public static String Buscar_TodoChofer(JLabel Id_Driver,JLabel txtFirst, JLabel txtLast, JTextField txtViaje, JTextField txtPeriodo, JTextField txtCantidad,
                            JTextArea txtDesc, JComboBox<String> añote, JLabel o1, JLabel o2, JLabel o3, JLabel o4, JLabel o5, JLabel o6, JLabel o7,
                            JLabel o8, JLabel o9, JLabel o10, JLabel o11, JLabel o12, JLabel o13, JLabel o14, JLabel o15, JLabel o16, JLabel o17,
                            JLabel o18, JLabel o19, JLabel o20, JLabel o21, JLabel o22, JLabel o23, JLabel o24, JLabel o25, JLabel o26, JLabel o27, JLabel o28) {

/*  68 */     String Busqueda_Nombre = null;
/*  69 */     Connection conexion = null;
/*     */     try {
/*  71 */       ConexionBD con = new ConexionBD();
/*  72 */      String Sentencia_Buscar = "SELECT * FROM viaje WHERE Id_Driver=  '" + Id_Driver.getText() + "' AND First_Name='" + txtFirst.getText() + "'AND Last_Name= '" + txtLast.getText() + "'AND Number_Of_Trip= '" + txtViaje.getText() +"'AND Period= '" + txtPeriodo.getText() +"'AND Year= '" + añote.getSelectedItem() +"'";
                //String Sentencia_Buscar = "SELECT * FROM viaje WHERE First_Name=  '" + txtFirst.getText() + "' AND Truck='" + txtLast.getText() + "'AND Number_Of_Trip= '" + txtViaje.getText() + "'AND Period= '" + txtPeriodo.getText() +"'AND Year= '" + añote.getSelectedItem() +"'";

/*  74 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar);
/*  75 */       resultado = sentencia_preparada.executeQuery();
/*  76 */       if (resultado.next()) {
/*     */         
/*  78 */        String id = resultado.getString("Id");
/*  78 */         String periodo = resultado.getString("Period");
/*  78 */         String  viaje= resultado.getString("Number_Of_Trip");
/*  78 */         String  fecha= resultado.getString("Date");
/*  78 */         String driver_id = resultado.getString("Id_Driver");
/*  78 */         String  nombre= resultado.getString("First_Name");
/*  78 */         String apellido = resultado.getString("Last_Name");
/*  78 */         String  ticket= resultado.getString("Ticket");
/*  78 */         String  BOL= resultado.getString("BOL");
/*  78 */         String  camion= resultado.getString("Truck");
/*  78 */         String  trailer= resultado.getString("Trailer");
/*  78 */         String  peso= resultado.getString("Weight");
/*  78 */         String  costo= resultado.getString("Cost_of_the_trip");
/*  78 */         String  descripcion= resultado.getString("Description_of_the_cost");
/*  78 */         String  cantidad= resultado.getString("Amount");
/*  78 */         String  pago= resultado.getString("Driver_Pay");
/*  78 */         String  deduccionD= resultado.getString("Driver_Deduction");
/*  78 */         String  DDD= resultado.getString("Driver_Deduction_Details");
/*  78 */         String deduccionT = resultado.getString("Truck_Deduction");
/*  78 */         String  DDT= resultado.getString("Truck_Deduction_Details");


                   String z11=resultado.getString("Year");
                   String z12=resultado.getString("Type");
                   String z13=resultado.getString("Added_By");
                   String z14=resultado.getString("Distance");
                   String z15=resultado.getString("Owner");
                   String z16=resultado.getString("Bonus");
                   String z17=resultado.getString("Bonus_Details");
                   String z18=resultado.getString("Ticket_Percentage");
/*  79 */         
o1.setText(id);
o2.setText(periodo);
o3.setText(viaje);
o4.setText(fecha);
o5.setText(driver_id);
o6.setText(nombre);
o7.setText(apellido);
o8.setText(ticket);
o9.setText(BOL);
o10.setText(camion);
o11.setText(trailer);
o12.setText(peso);
o13.setText(costo);
o14.setText(descripcion);
o15.setText(cantidad);
o16.setText(pago);
o17.setText(deduccionD);
o18.setText(DDD);
o19.setText(deduccionT);
o20.setText(DDT);
o21.setText(z11);
o22.setText(z12);
o23.setText(z13);
o24.setText(z14);
o25.setText(z15);
o26.setText(z16);
o27.setText(z17);
o28.setText(z18);
txtCantidad.setText(deduccionD);
txtDesc.setText(DDD);

/*  80 */         Busqueda_Nombre = "successful search";
/*     */       } 
/*  82 */       sentencia_preparada.close();
/*  83 */       conexion.close();
/*  84 */     } catch (Exception exception) {}
/*     */     
/*  86 */     return Busqueda_Nombre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String Buscar_Usuario(String Usuario, String Contraseña) {
/*  99 */     String Busqueda_Usuario = null;
/* 100 */     Connection conexion = null;
/*     */     try {
/* 102 */       ConexionBD con = new ConexionBD();
/* 103 */       String Sentencia_Buscar_Usuario = "SELECT First_Name, Last_Name FROM usuarios WHERE User_Name='" + Usuario + "'&& Password= '" + Contraseña + "'";
/*     */       
/* 105 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Usuario);
/* 106 */       resultado = sentencia_preparada.executeQuery();
/* 107 */       if (resultado.next()) {
/*     */         
/* 109 */         Busqueda_Usuario = "Usuario encontrado";
/*     */       } else {
/*     */         
/* 112 */         Busqueda_Usuario = "Usuario no encontrado";
/*     */       } 
/* 114 */       sentencia_preparada.close();
/* 115 */       conexion.close();
/* 116 */     } catch (Exception e) {
/* 117 */       System.out.println(e);
/*     */     } 
/* 119 */     return Busqueda_Usuario;
/*     */   }

public static String Buscar_Ticket(String Ticket) {
/*  99 */     String Busqueda_Ticket = null;
/* 100 */     Connection conexion = null;
/*     */     try {
/* 102 */       ConexionBD con = new ConexionBD();
/* 103 */       String Sentencia_Buscar_Ticket = "SELECT Ticket FROM viaje WHERE Ticket='" + Ticket +"'";
/*     */       
/* 105 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Ticket);
/* 106 */       resultado = sentencia_preparada.executeQuery();
/* 107 */       if (resultado.next()) {
/*     */         
/* 109 */         Busqueda_Ticket = "Ticket ya existe";
/*     */       } else {
/*     */         
/* 112 */         Busqueda_Ticket = "Ticket no existe";
/*     */       } 
/* 114 */       sentencia_preparada.close();
/* 115 */       conexion.close();
/* 116 */     } catch (Exception e) {
/* 117 */       System.out.println(e);
/*     */     } 
/* 119 */     return Busqueda_Ticket;
/*     */   }
/*     */ 
public static String Buscar_Bol(String BOL) {
/*  99 */     String Busqueda_Bol = null;
/* 100 */     Connection conexion = null;
/*     */     try {
/* 102 */       ConexionBD con = new ConexionBD();
/* 103 */       String Sentencia_Buscar_Ticket = "SELECT BOL FROM viaje WHERE BOL='" + BOL +"'";
/*     */       
/* 105 */       PreparedStatement sentencia_preparada = con.Conectarse().prepareStatement(Sentencia_Buscar_Ticket);
/* 106 */       resultado = sentencia_preparada.executeQuery();
/* 107 */       if (resultado.next()) {
/*     */         
/* 109 */         Busqueda_Bol = "BOL ya existe";
/*     */       } else {
/*     */         
/* 112 */         Busqueda_Bol = "BOL no existe";
/*     */       } 
/* 114 */       sentencia_preparada.close();
/* 115 */       conexion.close();
/* 116 */     } catch (Exception e) {
/* 117 */       System.out.println(e);
/*     */     } 
/* 119 */     return Busqueda_Bol;
/*     */   }
  
  public void Actualizar(int Id, String Nombre, String Apellidos, String Usuario, String Contraseña) {
    String sql = "UPDATE usuarios SET Id=?, First_Name=?,Last_Name=?, User_Name=?, Password WHERE Id=?";
    try {
      this.con = new ConexionBD();
      PreparedStatement sentencia_preparada = this.con.Conectarse().prepareStatement(sql);
      sentencia_preparada.setInt(1, Id);
      sentencia_preparada.setString(2, Nombre);
      sentencia_preparada.setString(3, Apellidos);
      sentencia_preparada.setString(4, Usuario);
      sentencia_preparada.setString(5, Contraseña);
      sentencia_preparada.setInt(6, Id);
      int n = sentencia_preparada.executeUpdate();
      if (n >= 0)
        JOptionPane.showMessageDialog(null, "Data modified", "Confirm", 1); 
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
  
  public JTable MostrarTabla(JTable tblm) {
    try {
      String sql = "SELECT * FROM usuarios ";
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
      tblm.setModel(modelo);
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
    return tblm;
  }
  
  public void Eliminar(int Id, String Nombre, String Apellidos, String Usuario, String Contrase) {
    try {
      String sql = "DELETE FROM usuarios WHERE Id=" + Id;
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
  
  public int consultaId() {
    int Id = 0;
    try {
      String sql = "SELECT * FROM usuarios ORDER BY Id Desc limit 1";
      
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

  
}