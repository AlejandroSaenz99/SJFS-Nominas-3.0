/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Controlador.ControladorExcel;
import Controlador.ControladorExcel2;
import Controlador.ControladorExcel3;
import Datos.AltaCamion;
import Datos.AltaChofer;
import Datos.AltaDeduccion;
import Datos.AltaDeduccionChofer;
import Datos.AltaEstado;
import Datos.AltaEstadoD;
import Datos.AltaViaje;
import Datos.ConexionBD;
import Datos.ExportarExcel;
import Metodos.Metodos_Altas;
import Modelo.ModeloExcel;
import Modelo.ModeloExcel2;
import Modelo.ModeloExcel3;
import Puentes.puenteAltas;
import java.awt.Color;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AlejandroSaenz
 */
public class Sistema extends javax.swing.JFrame {
    float gasto14;
    DecimalFormat df=new DecimalFormat("#.00");
Statement sentenciaSQL;
  ConexionBD con;
  
  public static PreparedStatement sentencia_preparada;
  
  public static ResultSet resultado;
  
  public static String url;
    /**
     * Creates new form Sistema
     */ public JLabel lnombre;
    public Sistema() {
        initComponents();

        prueba.setVisible(false);
       
        
        TablaViajes.setVisible(false);
        Tablita.setVisible(false);
        TablaViajes2.setVisible(false);
        //TablaB.setVisible(false);
        // MostrarTablaNomina();
        // MostrarTablaNominaChofer();
        setLocationRelativeTo(null);
btnImportar.setVisible(false);
btnGuardar.setVisible(false);
        //MostrarTablaError();
        // Tablita.setVisible(false);
        txtDueño.setEnabled(false);
        txtCamion.setEnabled(false);
        txtNombre1.setEnabled(false);
        txtApellido1.setEnabled(false);
        tablarelleno.setVisible(false);

ModificarViaje.setEnabled(false);

    }
                                   
public void bloquear(){
    System.out.println(nombreUsuario.getText());
    if(nombreUsuario.getText().equals("Jesus Alejandro Saenz Saldivar")){
ModificarViaje.setEnabled(true); admin22.setEnabled(true); pagomio.setEnabled(true);}}
    void MostrarTabla() {
        (new puenteAltas()).PuenteMostrarTabla(this.Tablita, this.txtId);
    }

    void MostrarTablaTicket() {
        (new puenteAltas()).PuenteMostrarTablaTicket(this.TablaB, this.txtT);
    }

    void MostrarTabla2() {
        (new puenteAltas()).PuenteMostrarTabla2(this.Tablita, this.txtNom, this.txtApe);
    }

    void MostrarTabla3() {
        (new puenteAltas()).PuenteMostrarTabla3(this.Tablita, this.txtNom);
    }

    void MostrarTabla4() {
        (new puenteAltas()).PuenteMostrarTabla4(this.Tablita, this.txtApe);
    }
public void Guardar() {
    AltaViaje prod=new AltaViaje();
        int Fila = Tablita.getRowCount();
       
       
        for (int i = 0; i < Fila; i++) {
      
            prod.setPeriod(Integer.parseInt(Tablita.getValueAt(i, 0).toString()));
            prod.setNo_Trip(Integer.parseInt(Tablita.getValueAt(i, 1).toString()));
            String Fecha = Tablita.getValueAt(i, 2).toString();
            prod.setId_Driver(Integer.parseInt(Tablita.getValueAt(i, 3).toString()));
            prod.setFirst_Name(Tablita.getValueAt(i, 4).toString());
            prod.setLast_Name(Tablita.getValueAt(i, 5).toString());
            prod.setTicket(Tablita.getValueAt(i, 6).toString());
            prod.setBOL(Tablita.getValueAt(i, 7).toString());
            prod.setTruck(Tablita.getValueAt(i, 8).toString());
            prod.setTrailer(Tablita.getValueAt(i, 9).toString());
            prod.setWeight(Float.parseFloat(Tablita.getValueAt(i, 10).toString()));
            prod.setCost_of_the_trip(Float.parseFloat(Tablita.getValueAt(i, 11).toString()));
            prod.setDescription_of_the_cost(Tablita.getValueAt(i, 12).toString());
            prod.setAmount(Float.parseFloat(Tablita.getValueAt(i, 13).toString()));
            prod.setDriver_Pay(Float.parseFloat(Tablita.getValueAt(i, 14).toString()));
            prod.setYear(Integer.parseInt(Tablita.getValueAt(i, 15).toString()));
            prod.setType(Tablita.getValueAt(i, 16).toString());
            prod.setAdded_By(Tablita.getValueAt(i, 17).toString());
            prod.setMiles(Tablita.getValueAt(i, 18).toString());
            prod.setOwner(Tablita.getValueAt(i, 19).toString());
            prod.setBonus(Float.parseFloat(Tablita.getValueAt(i, 20).toString()));
            prod.setBonus_Details(Tablita.getValueAt(i, 21).toString());
            prod.setTicket_Percentage(Tablita.getValueAt(i, 22).toString());
            prod.setSJFS_Percentage(Float.parseFloat(Tablita.getValueAt(i, 23).toString()));
            prod.setS_J_F_S(Float.parseFloat(Tablita.getValueAt(i, 24).toString()));
            prod.setBonus_Driver(Float.parseFloat(Tablita.getValueAt(i, 25).toString()));
            prod.setDetails_Bonus_Driver(Tablita.getValueAt(i, 26).toString());
            Metodos_Altas Met = new Metodos_Altas();
Met.GuardarViajeConTablaCompleta(prod, Fecha);
        
       

       

       
        
    }
   JOptionPane.showMessageDialog(null, "Proceso Terminado");
    }
    void MostrarTablaError() {
        (new puenteAltas()).PuenteMostrarTablaError(Tablita);
    }

    void MostrarTablaNomina() {
        (new puenteAltas()).PuenteMostrarTablaNomina(TablaViajes, txtPeriodo, txtDueño, txtCamion, txtAño2);
    }

    void MostrarTablaDeduccion() {
        (new puenteAltas()).PuenteMostrarTablaDeduccion(TablaDeducciones, txtPeriodo, txtDueño, txtCamion, txtAño2);
    }

    void MostrarTablaDeduccionChofer() {
        (new puenteAltas()).PuenteMostrarTablaDeduccionChofer(TablaDeduccionChofer, txtPeriodo, txtDueño, txtCamion, txtAño2);
    }

    void MostrarTablaNominaChofer() {
        (new puenteAltas()).PuenteMostrarTablaNominaChofer(TablaViajes2, txtPeriodo, txtDueño, txtCamion, txtAño);
    }


    public float SJFSCorrecto() {
        int contar = TablaViajes.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaViajes.getValueAt(i, 10).toString());
        }

        return suma;
    }

    public float bonoTruck() {
        int contar = TablaDeduccionCamionYTD.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaDeduccionCamionYTD.getValueAt(i, 1).toString());
        }

        return suma;
    }

    public float suma() {
        int contar = TablaViajes.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaViajes.getValueAt(i, 8).toString());

        }

        return suma;
    }
    
    public float sumaBonus() {
        int contar = TablaViajes.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaViajes.getValueAt(i, 11).toString());

        }

        return suma;
    }
    
public float TotalDeduccionYTD() {
           float Semana14=Float.parseFloat(prueba.getText());

        int contar = TablaDeduccionCamionYTD.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaDeduccionCamionYTD.getValueAt(i, 1).toString());

        }
suma=suma+Semana14;
        return suma;
    }
    public float sumaYTD() {
        int contar = Tablita.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(Tablita.getValueAt(i, 15).toString());
        }

        return suma;
    }

    public float sumaYTDCamion() {
        int contar = TablaB.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaB.getValueAt(i, 14).toString());
        }

        return suma;
    }

    public float sumaYTDDCamion() {
        int contar = Tabladed.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(Tabladed.getValueAt(i, 6).toString());
        }

        return suma;
    }

    public float sumaYTDDChofer() {
        int contar = Tabladed.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(Tabladed.getValueAt(i, 6).toString());
        }

        return suma;
    }

    public float sumaYTDChofer() {
        int contar = TablaB.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaB.getValueAt(i, 15).toString());
        }

        return suma;
    }

    public float sumaChofer() {
        int contar = TablaViajes2.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaViajes2.getValueAt(i, 8).toString());
        }

        return suma;
    }

    public float sumaBono() {
        int contar = TablaTrabajoExtra.getRowCount();
        float suma = 0;
        for (int i = 0; i < contar; i++) {
            suma = suma + Float.parseFloat(TablaTrabajoExtra.getValueAt(i, 2).toString());
        }

        return suma;
    }
public void HacerTodo(){

    if (this.txtPeriodo.getText().isEmpty() || this.txtDueño.getText().isEmpty() || this.txtCamion.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debes llenar todos los datos", "Aviso", 1);
    } else if (!this.txtPeriodo.getText().isEmpty() && !this.txtDueño.getText().isEmpty() && !this.txtCamion.getText().isEmpty()) {
if(Integer.parseInt(txtPeriodo.getText())>=14){
if(txtCamion.getText().equals("800-LF687")&&txtAño2.getSelectedItem().toString().equals("2022")){  gasto14=(float) 6679.7197; TablaSemana14.setValueAt(gasto14, 0, 1) ;}
else if(txtCamion.getText().equals("801-T2000")&&txtAño2.getSelectedItem().toString().equals("2022")){ gasto14=(float) 7551.174;TablaSemana14.setValueAt(gasto14, 0, 1);}
else if(txtCamion.getText().equals("804-FREIGHTLINER")&&txtAño2.getSelectedItem().toString().equals("2022")){ gasto14=(float) 5510.3;TablaSemana14.setValueAt(gasto14, 0, 1);}
else if(txtCamion.getText().equals("805")&&txtAño2.getSelectedItem().toString().equals("2022")){ gasto14=(float) 5329.5723;TablaSemana14.setValueAt(gasto14, 0, 1);}
else if(txtCamion.getText().equals("806-CASCADIA")&&txtAño2.getSelectedItem().toString().equals("2022")){ gasto14= (float) 6821.7197;TablaSemana14.setValueAt(gasto14, 0, 1);}

prueba.setText(""+gasto14);


}
Metodos_Altas Me=new Metodos_Altas();
     String Notas1= Me.BuscarNota(txtDueño,txtCamion,txtPeriodo,Notas,txtAño2);
     Notas.setText(Notas1);
        //MostrarTablaNomina();
        AltaViaje Prov = new AltaViaje();
        /*consultar viajes*/ (new puenteAltas()).PuenteMostrarTablaNomina(TablaViajes, txtPeriodo, txtDueño, txtCamion, txtAño2);//111111111111111111111111111111111111111111111111
        Prov.setPeriod(Integer.parseInt(txtPeriodo.getText()));
        Prov.setFirst_Name(this.txtDueño.getText());
        Prov.setLast_Name(this.txtCamion.getText());
        Prov.setYear(Integer.parseInt(txtAño2.getSelectedItem().toString()));

        this.TablaViajes.setVisible(true);

        // MostrarTablaDeduccion();
        AltaDeduccion Prov2 = new AltaDeduccion();
        (new puenteAltas()).PuenteMostrarTablaDeduccion(TablaDeducciones, txtPeriodo, txtDueño, txtCamion, txtAño2);//22222222222222222222222222222222222222222222222222222222222222222222
        // (new puenteAltas()).PuenteMostrarTablaBono(TablaYTDDeduccionDetallado,txtPeriodo,txtDueño,txtCamion,txtAño2);
        Prov2.setPeriod(Integer.parseInt(txtPeriodo.getText()));
        Prov2.setOwner(this.txtDueño.getText());
        Prov2.setTruck(this.txtCamion.getText());
        Prov2.setYear(Integer.parseInt(txtAño2.getSelectedItem().toString()));

        TablaEncabezado.setValueAt(txtDueño.getText(), 0, 1);
        TablaEncabezado.setValueAt(txtCamion.getText(), 0, 5);
        TablaEncabezado.setValueAt(txtPeriodo.getText(), 0, 7);
        TablaEncabezado.setValueAt(txtAño2.getSelectedItem().toString(), 0, 9);

        this.TablaDeducciones.setVisible(true);

        txtSuma.setText(Float.toString(suma()));
        Ded.setText(Float.toString(sumaDed()));
        SANTA.setText(Float.toString(SJFS()));
        SJFS.setText(Float.toString(SJFSCorrecto()));
        //bonito1.setText(Float.toString(bonoTruck()));
     
       
        txtDetention.setText(Float.toString(sumadp()));
        TablaSubTotal.setValueAt(txtSuma.getText(), 0, 1);
        TablaTotalDeduccion.setValueAt(Ded.getText(), 0, 1);
//    TablaBonus.setValueAt(bonito1.getText(), 0, 1);
      

txtBonus.setText(Float.toString(sumaBonus()));
 Total2.setText(Float.toString(resta()));
   TablaTotal.setValueAt(Total2.getText(), 0, 1);
        Metodos_Altas me = new Metodos_Altas();
        me.ConsultaYTDCamion(txtPeriodo, txtDueño, txtCamion, txtAño2, YearToDate1);//333333333333333333333333333333333333333333333333333333333333333333333333333
       // me.ConsultaYTDCamionDeduccion(txtPeriodo, txtDueño, txtCamion, txtAño2, YTDD2, TablaDeduccionYTD);//4444444444444444444444444444444444444444444444444444
        //System.out.println("4 Tabla total deduccion year to date innecesaria");
        TablaSubTotalYTD.setValueAt(YearToDate1.getText(), 0, 1);
        me.MostrarTablaYTDDetallado(TablaDeduccionCamionYTD, txtPeriodo, txtDueño, txtCamion, txtAño2);//5555555555555555555555555555555555555555555555555555555555
        //TablaDeduccionYTD.setValueAt(YTDD2.getText(), 0, 1);
YTDD2.setText(Float.toString(TotalDeduccionYTD()));
 TablaDeduccionTotalYTD.setValueAt(YTDD2.getText(), 0, 1);


      
        
        
      }
    txtAño2.requestFocus();
}

public void Driver(){
    if (this.txtPeriodo1.getText().isEmpty() || this.txtNombre1.getText().isEmpty() || this.txtApellido1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all fields", "Warning", 1);
    } else if (!this.txtPeriodo1.getText().isEmpty() && !this.txtNombre1.getText().isEmpty() && !this.txtApellido1.getText().isEmpty()) {

        MostrarTablaNominaChofer();
        AltaViaje Prov = new AltaViaje();
        (new puenteAltas()).PuenteMostrarTablaNominaChofer(TablaViajes2, txtPeriodo1, txtNombre1, txtApellido1, txtAño);
        Prov.setPeriod(Integer.parseInt(txtPeriodo1.getText()));
        Prov.setFirst_Name(this.txtNombre1.getText());
        Prov.setLast_Name(this.txtApellido1.getText());

        this.TablaViajes2.setVisible(true);

        MostrarTablaDeduccionChofer();
        AltaDeduccionChofer Prov3 = new AltaDeduccionChofer();
        (new puenteAltas()).PuenteMostrarTablaDeduccionChofer(TablaDeduccionChofer, txtPeriodo1, txtNombre1, txtApellido1, txtAño);
        (new puenteAltas()).PuenteMostrarTablaTrabajoExtra(TablaTrabajoExtra, txtPeriodo1, txtNombre1, txtApellido1, txtAño);
        Prov3.setPeriod(Integer.parseInt(txtPeriodo1.getText()));
        Prov3.setFirst_Name(this.txtNombre1.getText());
        Prov3.setLast_Name(this.txtApellido1.getText());
        Prov3.setYear(Integer.parseInt(txtAño.getSelectedItem().toString()));

        this.TablaDeduccionChofer.setVisible(true);

        TablaEncabezado2.setValueAt(txtNombre1.getText(), 0, 1);
        TablaEncabezado2.setValueAt(txtApellido1.getText(), 0, 2);
        TablaEncabezado2.setValueAt(txtPeriodo1.getText(), 0, 4);
        TablaEncabezado2.setValueAt(txtAño.getSelectedItem().toString(), 0, 6);

       

        txtSuma1.setText(Float.toString(sumaChofer()));
        TrabajoExtra.setText(Float.toString(sumaBono()));
        Ded1.setText(Float.toString(sumaDedChofer()));
        Total1.setText(Float.toString(restaChofer()));

        TablaSubTotal2.setValueAt(txtSuma1.getText(), 0, 1);
        TablaDeduccionChoferTotal.setValueAt(Ded1.getText(), 0, 1);
        TablaTrabajoExtraTotal.setValueAt(TrabajoExtra.getText(), 0, 1);
        TablaTotal2.setValueAt(Total1.getText(), 0, 1);

        Metodos_Altas me = new Metodos_Altas();
        me.ConsultaYTDChofer(txtPeriodo1, txtNombre1, txtApellido1, txtAño, YearToDate);
        me.ConsultaYTDChoferDeducciones(txtPeriodo1, txtNombre1, txtApellido1, txtAño, YTDD);
        TablaSubTotalYTD2.setValueAt(YearToDate.getText(), 0, 1);
        TablaDeduccionChoferTotalYTD.setValueAt(YTDD.getText(), 0, 1);

    }          
}
public float SJFS(){
    int contar=TablaViajes.getRowCount();
    float suma=0;
    for (int i=0; i < contar;i++){
        suma=suma+Float.parseFloat(TablaViajes.getValueAt(i, 9).toString());
    }
    
    
return suma;}


public float resta(){
    float Detencion= Float.parseFloat(txtDetention.getText());
   float bonificacion=Float.parseFloat(txtBonus.getText());
    float dedu=Float.parseFloat(Ded.getText());
   float bono2=Float.parseFloat(SJFS.getText());
   //float bono3=Float.parseFloat(bonito1.getText());
    float suma=Float.parseFloat(txtSuma.getText());
     float total=suma-dedu+bonificacion+Detencion;
return total;}


public float restaChofer(){
    float dedu=Float.parseFloat(Ded1.getText());
   float boni=Float.parseFloat(TrabajoExtra.getText());
    float suma=Float.parseFloat(txtSuma1.getText());
     float total=suma+boni-dedu;
return total;}

public float sumaDed(){
    int contar=TablaDeducciones.getRowCount();
    float suma=0;
    for (int i=0; i < contar;i++){
        suma=suma+Float.parseFloat(TablaDeducciones.getValueAt(i, 2).toString());
    }
    
return suma;}
public float sumadp(){
    int contar=TablaViajes.getRowCount();
    float suma=0;
    for (int i=0; i < contar;i++){
        suma=suma+Float.parseFloat(TablaViajes.getValueAt(i, 12).toString());
    }
    
return suma;}
public float sumaDedChofer(){
    int contar=TablaDeduccionChofer.getRowCount();
    float suma=0;
    for (int i=0; i < contar;i++){
        suma=suma+Float.parseFloat(TablaDeduccionChofer.getValueAt(i, 2).toString());
    }
    
return suma;}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tablita = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        YTD = new javax.swing.JTextField();
        btnImportar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDueño = new javax.swing.JTextField();
        txtCamion = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaViajes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        xd = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtSuma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Ded = new javax.swing.JTextField();
        Bonis = new javax.swing.JLabel();
        SJFS = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAño2 = new javax.swing.JComboBox<>();
        txt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        Total2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        SANTA = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaDeducciones = new javax.swing.JTable();
        txtBorrar = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtDetention = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEncabezado = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        TablaDeduccionCamionYTD = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        TablaSubTotal = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        TablaTotalDeduccion = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        TablaTotal = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        YearToDate1 = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        TablaSubTotalYTD = new javax.swing.JTable();
        YTDD2 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        TablaDeduccionTotalYTD = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        TablaSemana14 = new javax.swing.JTable();
        prueba = new javax.swing.JTextField();
        txtBonus = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        TablaDeduccionYTDNombre = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        TablaDeduccionCamionNombre = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Notas = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPeriodo1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaViajes2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        xd1 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txtSuma1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ded1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Total1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAño = new javax.swing.JComboBox<>();
        id0 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablaDeduccionChofer = new javax.swing.JTable();
        borrar1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        TrabajoExtra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEncabezado2 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        TablaTrabajoExtra = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        TablaSubTotal2 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        TablaDeduccionChoferTotal = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        TablaTrabajoExtraTotal = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        TablaTotal2 = new javax.swing.JTable();
        YearToDate = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        TablaSubTotalYTD2 = new javax.swing.JTable();
        YTDD = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        TablaDeduccionChoferTotalYTD = new javax.swing.JTable();
        jScrollPane25 = new javax.swing.JScrollPane();
        tablarelleno = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        TablaDeduccionChoferNombre = new javax.swing.JTable();
        jScrollPane29 = new javax.swing.JScrollPane();
        TablaTrabajoExtraNombre = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaB = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        txtT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtB = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtCa = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        Model = new javax.swing.JLabel();
        Dueñoo = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        B4 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        C2 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtA = new javax.swing.JLabel();
        YTD2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        YTD3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        Tabladed = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        nombreUsuario = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        admin22 = new javax.swing.JMenuItem();
        ModificarViaje = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        pagomio = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(218, 165, 32));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(218, 165, 32));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(218, 165, 32));
        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(218, 165, 32));
        jLabel12.setText("Driver Id:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(218, 165, 32));
        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(218, 165, 32));
        jLabel13.setText("Last Name:");

        jLabel14.setBackground(new java.awt.Color(218, 165, 32));
        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(218, 165, 32));
        jLabel14.setText("First Name:");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(Tablita);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total:");

        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnImportar)
                        .addGap(49, 49, 49)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(YTD, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(YTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnImportar)
                        .addComponent(btnGuardar)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trip By Driver", jPanel13);

        jPanel7.setBackground(new java.awt.Color(218, 165, 32));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Period:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });
        txtPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeriodoKeyTyped(evt);
            }
        });
        jPanel7.add(txtPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Owner:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Truck:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel7.add(txtDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, -1));
        jPanel7.add(txtCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));

        TablaViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaViajes);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 1056, 250));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar_16.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        xd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        xd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xdActionPerformed(evt);
            }
        });
        jPanel7.add(xd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 65, 65));
        jPanel7.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Net income:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel7.add(txtSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 105, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fuel SC");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        jPanel7.add(Ded, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 105, 29));

        Bonis.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Bonis.setForeground(new java.awt.Color(255, 255, 255));
        Bonis.setText("Detention");
        jPanel7.add(Bonis, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));
        jPanel7.add(SJFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 105, 29));

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Year:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtAño2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        jPanel7.add(txtAño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 97, -1));

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });
        jPanel7.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 11, 38, 32));

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Id:");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 17, 29, -1));

        jButton14.setText("Truck");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, -1, -1));
        jPanel7.add(Total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 105, 29));

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("gross profit:");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel7.add(SANTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 105, 29));

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Santa Julia FS:");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        TablaDeducciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDeducciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeduccionesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(TablaDeducciones);

        jPanel7.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 430, 170));

        txtBorrar.setText("Id");
        jPanel7.add(txtBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, -1, -1));

        jButton3.setText("Delet deduction");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));
        jPanel7.add(txtDetention, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 110, 30));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Driver Pay:");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        TablaEncabezado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Owner:", null, "", "", "Truck:", "", "Period:", "", "Year:", ""}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(TablaEncabezado);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 1050, 30));

        TablaDeduccionCamionYTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDeduccionCamionYTD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeduccionCamionYTDMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(TablaDeduccionCamionYTD);

        jPanel7.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 430, 170));

        TablaSubTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sub Total:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane12.setViewportView(TablaSubTotal);

        jPanel7.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 200, 30));

        TablaTotalDeduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane13.setViewportView(TablaTotalDeduccion);

        jPanel7.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 150, 30));

        TablaTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total Pay:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane14.setViewportView(TablaTotal);

        jPanel7.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 590, 170, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("YTD:");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));
        jPanel7.add(YearToDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 30));

        TablaSubTotalYTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"YTD:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane20.setViewportView(TablaSubTotalYTD);
        if (TablaSubTotalYTD.getColumnModel().getColumnCount() > 0) {
            TablaSubTotalYTD.getColumnModel().getColumn(1).setHeaderValue("");
        }

        jPanel7.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 290, 200, 30));

        YTDD2.setText("0");
        jPanel7.add(YTDD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 110, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("YTDD:");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        TablaDeduccionTotalYTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane22.setViewportView(TablaDeduccionTotalYTD);

        jPanel7.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 530, 150, 30));

        jButton5.setText("i");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, -1));

        TablaSemana14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"week< 14:", ""}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane24.setViewportView(TablaSemana14);

        jPanel7.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 150, 30));

        prueba.setText("0");
        jPanel7.add(prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 70, -1));
        jPanel7.add(txtBonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 105, 29));

        jLabel43.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Deduction:");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        TablaDeduccionYTDNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Deduction YTD"}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane26.setViewportView(TablaDeduccionYTDNombre);

        jPanel7.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, 200, 30));

        TablaDeduccionCamionNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Deduction"}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane27.setViewportView(TablaDeduccionCamionNombre);

        jPanel7.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 200, 30));

        Notas.setColumns(20);
        Notas.setRows(5);
        jScrollPane3.setViewportView(Notas);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 230, 120));

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        jTabbedPane1.addTab("Ticket Truck", jPanel7);

        jPanel8.setBackground(new java.awt.Color(218, 165, 32));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Period:");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtPeriodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodo1ActionPerformed(evt);
            }
        });
        txtPeriodo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeriodo1KeyTyped(evt);
            }
        });
        jPanel8.add(txtPeriodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 105, 26));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 29));
        jPanel8.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 105, 32));
        jPanel8.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 105, 29));

        TablaViajes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(TablaViajes2);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 1056, 220));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar_16.png"))); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        xd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        xd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xd1ActionPerformed(evt);
            }
        });
        jPanel8.add(xd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 65, 65));
        jPanel8.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Driver Pay:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel8.add(txtSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 147, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deduction:");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel8.add(Ded1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 116, 29));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Pay");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel8.add(Total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 116, 29));

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Year:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        jPanel8.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 85, -1));

        id0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id0ActionPerformed(evt);
            }
        });
        id0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id0KeyTyped(evt);
            }
        });
        jPanel8.add(id0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 45, 29));

        jLabel27.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Id:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 34, 26));

        jButton10.setText("Driver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        TablaDeduccionChofer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaDeduccionChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeduccionChoferMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TablaDeduccionChofer);

        jPanel8.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 460, 180));

        borrar1.setText("Id");
        jPanel8.add(borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, -1, -1));

        jButton4.setText("Delet Deduction");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("YTD:");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        jPanel8.add(TrabajoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 147, 29));

        TablaEncabezado2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Name:", null, "", "Period:", "", "Year:", ""}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(TablaEncabezado2);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 1050, 30));

        TablaTrabajoExtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaTrabajoExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaTrabajoExtraMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(TablaTrabajoExtra);

        jPanel8.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 460, 180));

        TablaSubTotal2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sub Total:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane15.setViewportView(TablaSubTotal2);

        jPanel8.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 220, 30));

        TablaDeduccionChoferTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane16.setViewportView(TablaDeduccionChoferTotal);

        jPanel8.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 150, 30));

        TablaTrabajoExtraTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane17.setViewportView(TablaTrabajoExtraTotal);

        jPanel8.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 530, 150, 30));

        TablaTotal2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total Pay:", "x"}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane18.setViewportView(TablaTotal2);

        jPanel8.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 170, 30));
        jPanel8.add(YearToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Extra Work:");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        TablaSubTotalYTD2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"YTD:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane21.setViewportView(TablaSubTotalYTD2);

        jPanel8.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 260, 220, 30));
        jPanel8.add(YTDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 140, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("YTDD:");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        TablaDeduccionChoferTotalYTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"YTD:", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane23.setViewportView(TablaDeduccionChoferTotalYTD);

        jPanel8.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 150, 30));

        tablarelleno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", ""}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane25.setViewportView(tablarelleno);

        jPanel8.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 170, 30));

        TablaDeduccionChoferNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Deduction"}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane28.setViewportView(TablaDeduccionChoferNombre);

        jPanel8.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 200, 30));

        TablaTrabajoExtraNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Extra Work"}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane29.setViewportView(TablaTrabajoExtraNombre);

        jPanel8.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 200, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1316, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ticket Driver", jPanel2);

        jPanel6.setBackground(new java.awt.Color(218, 165, 32));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        TablaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaB);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        txtT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTActionPerformed(evt);
            }
        });
        txtT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(218, 165, 32));
        jLabel19.setText("Ticket:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(218, 165, 32));
        jLabel20.setText("BOL:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        txtCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(218, 165, 32));
        jLabel21.setText("Truck Id:");

        Combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", " " }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(218, 165, 32));
        jLabel22.setText("Year:");

        Model.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Model.setForeground(new java.awt.Color(218, 165, 32));
        Model.setText("Model");

        Dueñoo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Dueñoo.setForeground(new java.awt.Color(218, 165, 32));
        Dueñoo.setText("Owner");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dueñoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(130, 130, 130))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txtCa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Dueñoo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(218, 165, 32));
        jLabel23.setText("Driver Id:");

        C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", " " }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(218, 165, 32));
        jLabel24.setText("Year:");

        txtName.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(218, 165, 32));
        txtName.setText("First name");

        txtA.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtA.setForeground(new java.awt.Color(218, 165, 32));
        txtA.setText("Last name");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(29, 29, 29)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtA)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        YTD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YTD2ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("YTD:");

        YTD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YTD3ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("YTD Deduction:");

        Tabladed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane19.setViewportView(Tabladed);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Deduction");

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Total");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(28, 28, 28)
                        .addComponent(YTD2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel29)
                        .addGap(28, 28, 28)
                        .addComponent(YTD3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel37)
                        .addGap(28, 28, 28)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane19)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(624, 624, 624)
                .addComponent(jLabel36)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(YTD3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(YTD2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search", jPanel6);

        jToolBar1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.setForeground(new java.awt.Color(218, 165, 32));
        jToolBar1.setRollover(true);

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(218, 165, 32));
        nombreUsuario.setText("Usuario");
        jToolBar1.add(nombreUsuario);
        jToolBar1.add(jSeparator5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Salir_16.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel38.setForeground(new java.awt.Color(218, 165, 32));
        jLabel38.setText("SANTA JULIA FREIGHT SERVICES LLC v3.0.0");
        jToolBar1.add(jLabel38);

        jMenu1.setText("File");

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Productos_16.png"))); // NOI18N
        jMenuItem18.setText("Add Extra Work");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem18);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Eliminar_16.png"))); // NOI18N
        jMenuItem19.setText("Edit Extra Work");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem19);

        admin22.setText("Admin Mode");
        admin22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin22ActionPerformed(evt);
            }
        });
        jMenu1.add(admin22);

        ModificarViaje.setText("Edit Trip");
        ModificarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarViajeActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarViaje);

        jMenuItem9.setText("Comprobar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem22.setText("Agua");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem22);
        jMenu1.add(jSeparator6);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Archivo_16.png"))); // NOI18N
        jMenu2.setText("Add");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/conductor-de-taxi.png"))); // NOI18N
        jMenuItem1.setText("Driver");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camion16.png"))); // NOI18N
        jMenuItem2.setText("Truck");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/remolque.png"))); // NOI18N
        jMenuItem3.setText("Trailer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator4);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/destino.png"))); // NOI18N
        jMenuItem4.setText("Trip");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/deduccion.png"))); // NOI18N
        jMenu3.setText("Deduction");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/driverdedu.png"))); // NOI18N
        jMenuItem5.setText("Driver");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camionddedu.png"))); // NOI18N
        jMenuItem6.setText("Truck");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/actualizar.png"))); // NOI18N
        jMenuItem21.setText("SJFS");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Reportes_16.png"))); // NOI18N
        jMenu4.setText("View");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Productos_16.png"))); // NOI18N
        jMenuItem7.setText("Data");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libro-de-cheques.png"))); // NOI18N
        jMenuItem20.setText("SJFS");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Proveedor_16.png"))); // NOI18N
        jMenu5.setText("Staff");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Añadir_16 .png"))); // NOI18N
        jMenuItem8.setText("Add Staff");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        pagomio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/billete-de-banco.png"))); // NOI18N
        pagomio.setText("Add Pay Staff");
        pagomio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagomioActionPerformed(evt);
            }
        });
        jMenu5.add(pagomio);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libro-de-cheques.png"))); // NOI18N
        jMenuItem12.setText("Ticket Pay");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem16.setText("Deduction");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Productos_16.png"))); // NOI18N
        jMenuItem14.setText("Total");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Mantenimiento_16.png"))); // NOI18N
        jMenu6.setText("Mechanic");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mecanico16.png"))); // NOI18N
        jMenuItem10.setText("Add Mechanic");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/billete-de-banco.png"))); // NOI18N
        jMenuItem11.setText("Add Pay Mechanic");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/deduccion.png"))); // NOI18N
        jMenuItem17.setText("Deduction");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libro-de-cheques.png"))); // NOI18N
        jMenuItem13.setText("Ticket Pay");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Reportes_16.png"))); // NOI18N
        jMenuItem15.setText("Total");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xdActionPerformed

    }//GEN-LAST:event_xdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        HacerTodo();

       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeriodoKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoKeyTyped

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
HacerTodo();
       // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoActionPerformed

    private void txtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeActionPerformed
        if (this.txtNom.getText().isEmpty() && this.txtApe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes introducir Nombre y Apellido", "Aviso", 1);
        } else if (this.txtApe.getText().isEmpty() && !this.txtNom.getText().isEmpty()) {
            this.txtId.setText("");

            MostrarTabla3();
                        Tablita.setVisible(true);
YTD.setText(Float.toString(sumaYTD()));
            AltaViaje Prov = new AltaViaje();
            Prov.setFirst_Name(this.txtNom.getText());

        }
        else if (!this.txtApe.getText().isEmpty() && this.txtNom.getText().isEmpty()) {
            this.txtId.setText("");

            MostrarTabla4();
                        Tablita.setVisible(true);
YTD.setText(Float.toString(sumaYTD()));
            AltaViaje Prov = new AltaViaje();
            Prov.setLast_Name(this.txtApe.getText());

        } else if (!this.txtApe.getText().isEmpty() && !this.txtNom.getText().isEmpty()) {
            this.txtId.setText("");

            MostrarTabla2();            Tablita.setVisible(true);
YTD.setText(Float.toString(sumaYTD()));
            AltaViaje Prov = new AltaViaje();
            Prov.setFirst_Name(this.txtNom.getText());
            Prov.setLast_Name(this.txtApe.getText());

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        if (this.txtNom.getText().isEmpty() && this.txtApe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes introducir Nombre y Apellido", "Aviso", 1);
        } else if (this.txtApe.getText().isEmpty() && !this.txtNom.getText().isEmpty()) {
            this.txtId.setText("");

            MostrarTabla3();
                        Tablita.setVisible(true);
YTD.setText(Float.toString(sumaYTD()));
            AltaViaje Prov = new AltaViaje();
            Prov.setFirst_Name(this.txtNom.getText());

        }
        else if (!this.txtApe.getText().isEmpty() && this.txtNom.getText().isEmpty()) {
            this.txtId.setText("");

            MostrarTabla4();
                        Tablita.setVisible(true);
YTD.setText(Float.toString(sumaYTD()));
            AltaViaje Prov = new AltaViaje();
            Prov.setLast_Name(this.txtApe.getText());

        } else if (!this.txtApe.getText().isEmpty() && !this.txtNom.getText().isEmpty()) {
            this.txtId.setText("");

            MostrarTabla2();
                        Tablita.setVisible(true);
YTD.setText(Float.toString(sumaYTD()));
            AltaViaje Prov = new AltaViaje();
            Prov.setFirst_Name(this.txtNom.getText());
            Prov.setLast_Name(this.txtApe.getText());

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();           // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        if (!this.txtId.getText().isEmpty()) {

            this.txtNom.setText("");
            this.txtApe.setText("");

            MostrarTabla();
            Tablita.setVisible(true);
            AltaViaje Prov = new AltaViaje();
            Prov.setId_Driver(Integer.parseInt(this.txtId.getText()));
            
            YTD.setText(Float.toString(sumaYTD()));

        } else {
            JOptionPane.showMessageDialog(null, "Please fill all fields", "Warning", 1);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPeriodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodo1ActionPerformed
Driver();    // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodo1ActionPerformed

    private void txtPeriodo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeriodo1KeyTyped
  char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodo1KeyTyped

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
Driver();  

// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void xd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xd1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
                                                                 
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void txtTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTActionPerformed
 
     if (!this.txtT.getText().isEmpty()) {

            this.txtB.setText("");
           

            MostrarTablaTicket();
            Tablita.setVisible(true);
            AltaViaje Prov = new AltaViaje();
            Prov.setTicket(this.txtT.getText());
          

        } else {
            JOptionPane.showMessageDialog(null, "Please fill all fields", "Warning", 1);
        }
    }//GEN-LAST:event_txtTActionPerformed

    private void txtTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKeyTyped
  char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTKeyTyped

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
     try {
      String sql = "SELECT * FROM viaje where BOL=" + txtB.getText();
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
      TablaB.setModel(modelo);
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
            // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaActionPerformed
        if (!this.txtCa.getText().isEmpty()) {

            AltaCamion prov = new AltaCamion();
            prov.setId(Integer.parseInt(this.txtCa.getText()));
            (new puenteAltas()).PuenteBuscarCamion(prov);
            this.Model.setText("" + prov.getModel());
            Dueñoo.setText(""+ prov.getOwner());

            
        
  

            
            AltaViaje Prov = new AltaViaje();
            (new puenteAltas()).PuenteMostrarTablaNominaCamionAño(TablaB,Model,Combo1);
            (new puenteAltas()).PuenteMostrarTablaDeduccionCamionAño(Tabladed,Model,Combo1);
            Prov.setTruck(this.Model.getText());
            
            Prov.setYear(Integer.parseInt(Combo1.getSelectedItem().toString()));

            this.TablaB.setVisible(true);
                        YTD2.setText(Float.toString(sumaYTDCamion()));

            YTD3.setText(Float.toString(sumaYTDDCamion()));
            
            float ytd= Float.parseFloat(YTD2.getText());
            float ytdD= Float.parseFloat(YTD3.getText());
            float Total= ytd-ytdD;
            total.setText(""+Total);
            
        }
    }//GEN-LAST:event_txtCaActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       if (!this.B4.getText().isEmpty()) {

            AltaChofer prov = new AltaChofer();
            prov.setId(Integer.parseInt(this.B4.getText()));
            (new puenteAltas()).PuenteBuscarChofer(prov);
            txtName.setText("" + prov.getNombre());
            txtA.setText(""+ prov.getApellidos());

            
        
  

            
            AltaViaje Prov = new AltaViaje();
            (new puenteAltas()).PuenteMostrarTablaNominaChoferAño(TablaB,txtName,txtA,C2);
            (new puenteAltas()).PuenteMostrarTablaDeduccionChoferAño(Tabladed,txtName,txtA,C2);
            
            Prov.setFirst_Name(this.txtName.getText());
            Prov.setLast_Name(this.txtA.getText());
            
            Prov.setYear(Integer.parseInt(C2.getSelectedItem().toString()));

            this.TablaB.setVisible(true);
            YTD2.setText(Float.toString(sumaYTDChofer()));
           YTD3.setText(Float.toString(sumaYTDDChofer()));
             float ytd= Float.parseFloat(YTD2.getText());
            float ytdD= Float.parseFloat(YTD3.getText());
            float Total= ytd-ytdD;
            total.setText(""+Total);
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped
 char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyTyped

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
TablaVariadona tv=new TablaVariadona();
tv.setVisible(true);
tv.MostrarTablaCamion();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
if (!txt.getText().isEmpty()) {
     
      AltaCamion prov = new AltaCamion();
      prov.setId(Integer.parseInt(this.txt.getText()));
      (new puenteAltas()).PuenteBuscarCamion(prov);
      this.txtCamion.setText("" + prov.getModel());
      txtDueño.setText(""+ prov.getOwner());
      txt.setText("");
      txtPeriodo.requestFocus();
    } else {
      JOptionPane.showMessageDialog(null, "Enter a ID", "Warning", 1);}        // TODO add your handling code here:
               // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void id0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id0KeyTyped
char car = evt.getKeyChar();
        if (car < '0' || car > '9')
        evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_id0KeyTyped

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
TablaVariadona tv=new TablaVariadona();
tv.setVisible(true);
tv.MostrarTablaChofer();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void id0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id0ActionPerformed

        if (!this.id0.getText().isEmpty()) {
     
      AltaChofer prov = new AltaChofer();
      prov.setId(Integer.parseInt(this.id0.getText()));
      (new puenteAltas()).PuenteBuscarChofer(prov);
      this.txtNombre1.setText("" + prov.getNombre());
      this.txtApellido1.setText("" + prov.getApellidos());
      
      id0.setText("");
      txtPeriodo1.requestFocus();
             
    } else {
      JOptionPane.showMessageDialog(null, "Enter a ID", "Warning", 1);
    }       
    }//GEN-LAST:event_id0ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      ChoferNuevo x=new ChoferNuevo();
        x.setVisible(true);
        x.n.setText(nombreUsuario.getText());
        dispose();
  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      CamionNuevo Ventana= new CamionNuevo();
        Ventana.setVisible(true);
        Ventana.n3.setText(nombreUsuario.getText());
        dispose();  
    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    TrialaNueva Ventana= new TrialaNueva();
        Ventana.setVisible(true);
        Ventana.n2.setText(nombreUsuario.getText());

        dispose();  
    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NuevoViaje x=new NuevoViaje();
        x.setVisible(true);
        x.txtN.setText(nombreUsuario.getText());
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      DeduChofer de=new DeduChofer();
        de.setVisible(true);
        de.n5.setText(nombreUsuario.getText());
        dispose();  

  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       DeduccionCamion de=new DeduccionCamion();
        de.setVisible(true);
        de.n4.setText(nombreUsuario.getText());
        dispose();
 // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      
TablaViaje2 t=new TablaViaje2();
        t.setVisible(true);
        t.nn.setText(nombreUsuario.getText());
        dispose();
  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
pagos pa=new pagos();
pa.setVisible(true);
pa.lae.setText(nombreUsuario.getText());
pa.txtm.setVisible(true);
pa.bm.setVisible(true);


dispose();     
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
Personal pe=new Personal();
        pe.setVisible(true);
        pe.n9.setText(nombreUsuario.getText());
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
Mecanico pe=new Mecanico();
        pe.setVisible(true);
        pe.n9.setText(nombreUsuario.getText());
        dispose();
       
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Login lo=new Login();
        lo.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void pagomioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagomioActionPerformed
pagos pa=new pagos();
pa.setVisible(true);
pa.lae.setText(nombreUsuario.getText());
pa.txtp.setVisible(true);
pa.bp.setVisible(true);


dispose();
    }//GEN-LAST:event_pagomioActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
 ModeloExcel2 modeloE = new ModeloExcel2();
        NominaExtra vistaE = new NominaExtra();
         
        ControladorExcel2 contraControladorExcel = new ControladorExcel2(vistaE, modeloE);
        
        
vistaE.setVisible(true);
vistaE.nam.setText(nombreUsuario.getText());
dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
 ModeloExcel2 modeloE = new ModeloExcel2();
        NominaExtra vistaE = new NominaExtra();
         
        ControladorExcel2 contraControladorExcel = new ControladorExcel2(vistaE, modeloE);
        
        
vistaE.setVisible(true);
vistaE.nam.setText(nombreUsuario.getText());

dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void YTD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YTD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YTD3ActionPerformed

    private void YTD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YTD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YTD2ActionPerformed

    private void TablaDeduccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeduccionesMouseClicked
if (evt.getButton() == 1) {
            int fila = TablaDeducciones.getSelectedRow();
            txtBorrar.setText(TablaDeducciones.getValueAt(fila, 0).toString());
            
            
            

        }          // TODO add your handling code here:
    }//GEN-LAST:event_TablaDeduccionesMouseClicked

    private void TablaDeduccionChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeduccionChoferMouseClicked
        if (evt.getButton() == 1) {
            int fila = TablaDeduccionChofer.getSelectedRow();
            borrar1.setText(TablaDeduccionChofer.getValueAt(fila, 0).toString());
            
        }          // TODO add your handling code here:
    }//GEN-LAST:event_TablaDeduccionChoferMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if (txtBorrar.getText().isEmpty() ) {
      JOptionPane.showMessageDialog(null, "please select a row ", "please select a row", 1);
    } else {
     int Id=Integer.parseInt(txtBorrar.getText());
      try {
      String sql = "DELETE FROM deducciones_camion WHERE Id=" + Id;
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Deleted Data: ", "Confim", 1); 
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
    
  
    txtBorrar.setText("");
    
      MostrarTablaDeduccion();}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if (borrar1.getText().isEmpty() ) {
      JOptionPane.showMessageDialog(null, "please select a row ", "please select a row", 1);
    } else {
     int Id=Integer.parseInt(borrar1.getText());
      try {
      String sql = "DELETE FROM deducciones_chofer WHERE Id=" + Id;
      this.con = new ConexionBD();
      this.sentenciaSQL = this.con.Conectarse().createStatement();
      int n = this.sentenciaSQL.executeUpdate(sql);
      if (n > 0)
        JOptionPane.showMessageDialog(null, "Deleted Data: ", "Confim", 1); 
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
    
  
    borrar1.setText("");
    
    
           (new puenteAltas()).PuenteMostrarTablaDeduccionChofer(TablaDeduccionChofer,txtPeriodo1,txtNombre1,txtApellido1,txtAño);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TablaDeduccionCamionYTDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeduccionCamionYTDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaDeduccionCamionYTDMouseClicked

    private void TablaTrabajoExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaTrabajoExtraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaTrabajoExtraMouseClicked

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
TotalStaff to=new TotalStaff();
to.setVisible(true);
to.txtUsuario.setText(nombreUsuario.getText());
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
TotalMecanico to=new TotalMecanico();
to.setVisible(true);
to.txtUsuario.setText(nombreUsuario.getText());
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
DeduccionMecanico D=new DeduccionMecanico();
D.setVisible(true);
D.n4.setText(nombreUsuario.getText());
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
ExraWork Tr=new ExraWork();
Tr.txtN.setText(nombreUsuario.getText());
Tr.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
      EditarExtra Tr=new EditarExtra();
Tr.txtN.setText(nombreUsuario.getText());
Tr.setVisible(true);
dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void admin22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin22ActionPerformed
        AdministrarUsuarios admin = new AdministrarUsuarios();
        admin.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_admin22ActionPerformed

    private void ModificarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarViajeActionPerformed
ModificarViaje m=new ModificarViaje();
m.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ModificarViajeActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
if(nombreUsuario.getText().equals("Jesus Alejandro Saenz Saldivar")){
admin22.setEnabled(true);
ModificarViaje.setEnabled(true);
pagomio.setEnabled(true);
Metodos_Altas me=new Metodos_Altas();
me.verBitacora(Tablita);
Tablita.setVisible(true);
btnImportar.setVisible(true);
btnGuardar.setVisible(true);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
SJFS Sa=new SJFS();
Sa.u.setText(nombreUsuario.getText());
Sa.setVisible(true);


dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
     DeduccionesSJFS Sa=new DeduccionesSJFS();
Sa.u.setText(nombreUsuario.getText());
Sa.setVisible(true);


dispose();  
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Metodos_Altas m=new Metodos_Altas();
      m.borrarNotas(txtDueño,txtCamion,txtPeriodo,Notas,txtAño2);
m.Notas(txtDueño,txtCamion,txtPeriodo,Notas,txtAño2);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
ModeloExcel3 modeloE = new ModeloExcel3();
        Agua vistaE = new Agua();
        ControladorExcel3 contraControladorExcel = new ControladorExcel3(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.n5.setText(nombreUsuario.getText());
        vistaE.setLocationRelativeTo(null); 
dispose(); 
        
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B4;
    private javax.swing.JLabel Bonis;
    private javax.swing.JComboBox<String> C2;
    private javax.swing.JComboBox<String> Combo1;
    private javax.swing.JTextField Ded;
    private javax.swing.JTextField Ded1;
    private javax.swing.JLabel Dueñoo;
    private javax.swing.JLabel Model;
    public javax.swing.JMenuItem ModificarViaje;
    private javax.swing.JTextArea Notas;
    public javax.swing.JTextField SANTA;
    private javax.swing.JTextField SJFS;
    private javax.swing.JTable TablaB;
    public javax.swing.JTable TablaDeduccionCamionNombre;
    public javax.swing.JTable TablaDeduccionCamionYTD;
    public javax.swing.JTable TablaDeduccionChofer;
    public javax.swing.JTable TablaDeduccionChoferNombre;
    public javax.swing.JTable TablaDeduccionChoferTotal;
    public javax.swing.JTable TablaDeduccionChoferTotalYTD;
    public javax.swing.JTable TablaDeduccionTotalYTD;
    public javax.swing.JTable TablaDeduccionYTDNombre;
    public javax.swing.JTable TablaDeducciones;
    public javax.swing.JTable TablaEncabezado;
    public javax.swing.JTable TablaEncabezado2;
    public javax.swing.JTable TablaSemana14;
    public javax.swing.JTable TablaSubTotal;
    public javax.swing.JTable TablaSubTotal2;
    public javax.swing.JTable TablaSubTotalYTD;
    public javax.swing.JTable TablaSubTotalYTD2;
    public javax.swing.JTable TablaTotal;
    public javax.swing.JTable TablaTotal2;
    public javax.swing.JTable TablaTotalDeduccion;
    public javax.swing.JTable TablaTrabajoExtra;
    public javax.swing.JTable TablaTrabajoExtraNombre;
    public javax.swing.JTable TablaTrabajoExtraTotal;
    public javax.swing.JTable TablaViajes;
    public javax.swing.JTable TablaViajes2;
    private javax.swing.JTable Tabladed;
    public javax.swing.JTable Tablita;
    private javax.swing.JTextField Total1;
    private javax.swing.JTextField Total2;
    public javax.swing.JTextField TrabajoExtra;
    private javax.swing.JTextField YTD;
    private javax.swing.JTextField YTD2;
    private javax.swing.JTextField YTD3;
    public javax.swing.JTextField YTDD;
    public javax.swing.JTextField YTDD2;
    public javax.swing.JTextField YearToDate;
    public javax.swing.JTextField YearToDate1;
    public javax.swing.JMenuItem admin22;
    private javax.swing.JLabel borrar1;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImportar;
    private javax.swing.JTextField id0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel nombreUsuario;
    public javax.swing.JMenuItem pagomio;
    private javax.swing.JTextField prueba;
    public javax.swing.JTable tablarelleno;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txt;
    private javax.swing.JLabel txtA;
    private javax.swing.JTextField txtApe;
    public javax.swing.JTextField txtApellido1;
    private javax.swing.JComboBox<String> txtAño;
    private javax.swing.JComboBox<String> txtAño2;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JLabel txtBorrar;
    private javax.swing.JTextField txtCa;
    public javax.swing.JTextField txtCamion;
    private javax.swing.JTextField txtDetention;
    public javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtId;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextField txtNom;
    public javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtPeriodo1;
    public javax.swing.JTextField txtSuma;
    public javax.swing.JTextField txtSuma1;
    private javax.swing.JTextField txtT;
    public javax.swing.JButton xd;
    public javax.swing.JButton xd1;
    // End of variables declaration//GEN-END:variables
}
