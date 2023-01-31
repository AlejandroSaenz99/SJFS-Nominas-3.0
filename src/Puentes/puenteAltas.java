
package Puentes;

import Datos.AltaCamion;
import Datos.AltaChofer;
import Datos.AltaDeduccion;
import Datos.AltaDeduccionChofer;
import Datos.AltaDeduccionMecanico;
import Datos.AltaEstado;
import Datos.AltaEstadoD;
import Datos.AltaMecanico;
import Datos.AltaPago;
import Datos.AltaPagoMecanico;
import Datos.AltaPersonal;
import Datos.AltaTrailer;
import Datos.AltaViaje;
import Metodos.Metodos_Altas;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author AlejandroSaenz
 */
public class puenteAltas {
    /*
Aqui damos de alta 
 */
    Metodos_Altas mp;
     public void PuenteRegistroChofer(AltaChofer pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarChofer(pdto);
  }
      public void PuenteRegistroPago(AltaPago pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarPago(pdto);
  }
      
      public void PuenteRegistroPagoMecanico(AltaPagoMecanico Prod) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarPagoMecanico(Prod);
  }
     
       public void PuenteRegistroTrailer(AltaTrailer pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarTrailer(pdto);
  }
        public void PuenteRegistroCamion(AltaCamion pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarCamion(pdto);
  }
         public void PuenteRegistroEstado(AltaEstado pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarEstado(pdto);
  }
         public void PuenteRegistroEstadoD(AltaEstadoD pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarEstadoD(pdto);
  }
        public void PuenteRegistroPersonal(AltaPersonal pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarPersonal(pdto);
  }
        public void PuenteRegistroMecanico(AltaMecanico pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarMecanico(pdto);
  }
        public void PuenteRegistroViaje(AltaViaje pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarViaje(pdto);
  }
         public void PuenteRegistroDeduccionCamion(AltaDeduccion pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarDeduccionCamion(pdto);
  }
         public void PuenteRegistroDeduccionChofer(AltaDeduccionChofer pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarDeduccionChofer(pdto);
  }
        public void PuenteRegistroDeduccionMecanico(AltaDeduccionMecanico pdto) {
    this.mp = new Metodos_Altas();
    this.mp.GuardarDeduccionMecanico(pdto);
  }
        
        /******************************
         * Mostrar tablas
         */
         public void PuenteMostrarTabla(JTable TablaDatos, JTextField txtId) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTabla(TablaDatos, txtId);
  }
         
         public void PuenteMostrarTablaTicket(JTable TablaDatos, JTextField txtT) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaTicket(TablaDatos, txtT);
  }
         
         
         
         public void PuenteMostrarTabla2(JTable TablaDatos, JTextField txtNom, JTextField txtApe) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTabla2(TablaDatos, txtNom, txtApe);
  }
          public void PuenteMostrarTablaSJFS(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaSJFS(TablaDatos);
  }
          public void PuenteMostrarTabla3(JTable TablaDatos, JTextField txtNom) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTabla3(TablaDatos, txtNom);
  }
             public void PuenteMostrarTabla4(JTable TablaDatos, JTextField txtApe) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTabla4(TablaDatos, txtApe);
  }
        public JTable PuenteMostrarTablaChofer(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaChofer(TablaDatos);
    return tbl;
    
  }
        public JTable PuenteMostrarTablaTotalStaff(JTable TablaDatos, JLabel txtFirst, JLabel txtLast, JComboBox combo) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaTotalStaff(TablaDatos,txtFirst,txtLast,combo);
    return tbl;
    
  }
        public JTable PuenteMostrarTablaTotalMecanico(JTable TablaDatos, JLabel txtFirst, JLabel txtLast, JComboBox combo) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaTotalMecanico(TablaDatos,txtFirst,txtLast,combo);
    return tbl;
    
  }
        
        
        public JTable PuenteMostrarTablaRelacion(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaRelacion(TablaDatos);
    return tbl;
  }
         public JTable PuenteMostrarTablaCamion(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaCamion(TablaDatos);
    return tbl;
  }
         public JTable PuenteMostrarTablaStaff(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaStaff(TablaDatos);
    return tbl;
  }
         
         public JTable PuenteMostrarTablaPagoStaff(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaPagoStaff(TablaDatos);
    return tbl;
  }
         
          public JTable PuenteMostrarTablaPagoMecanico(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaPagoMecanico(TablaDatos);
    return tbl;
  }
           public JTable PuenteMostrarTablaUsuario(JTable TablaUsuario) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaUsuario(TablaUsuario);
    return tbl;
  }
               public JTable PuenteMostrarTablaDeduccion(JTable TablaDeduccion) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDeduccion(TablaDeduccion);
    return tbl;
  }
         
          public JTable PuenteMostrarTablaTrailer(JTable TablaTrailer) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaTrailer(TablaTrailer);
    return tbl;
  }
          
           public JTable PuenteMostrarTablaViaje(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaViaje(TablaDatos);
    return tbl;
  }
            public JTable PuenteMostrarTablaMecanico(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaMecanico(TablaDatos);
    return tbl;
  }
           
             
           public JTable PuenteMostrarTablaError(JTable TablaDatos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaError(TablaDatos);
    return tbl;
  }
           
           public void PuenteMostrarTablaNominaCamionAño(JTable TablaDatos, JLabel Model, JComboBox Combo1) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaNominaCamionAño(TablaDatos, Model, Combo1);
  }
           
            public void PuenteMostrarTablaDeduccionCamionAño(JTable TablaDatos, JLabel Model, JComboBox Combo1) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDeduccionCamionAño(TablaDatos, Model, Combo1);
  }
           
           public void PuenteMostrarTablaNominaChoferAño(JTable TablaDatos, JLabel Nombre,JLabel Apellido, JComboBox C2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaNominaChoferAño(TablaDatos, Nombre, Apellido,C2);
  }
           
            public void PuenteMostrarTablaDeduccionChoferAño(JTable TablaDatos, JLabel Nombre,JLabel Apellido, JComboBox C2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDeduccionChoferAño(TablaDatos, Nombre, Apellido,C2);
  }
            public void PuenteMostrarTablaNominaStaff(JTable Tabla, JTextField txtperi, JLabel txtnombre, JLabel txtapellido,JComboBox año) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaNominaStaff(Tabla, txtperi, txtnombre, txtapellido,año);
  }
            
             public void PuenteMostrarTablaNominaMecanico(JTable Tabla, JTextField txtperi2, JTextField txtnombre1, JTextField txtapellido1,JComboBox año1) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaNominaMecanico(Tabla, txtperi2, txtnombre1, txtapellido1,año1);
  }
            
           
            public void PuenteMostrarTablaNomina(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos,JComboBox txtAño2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaNomina(TablaDatos, txtPeriodo, txtNombre, txtApellidos,txtAño2);
  }
             public void PuenteMostrarTablaDeduccion(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos,JComboBox txtAño2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDeduccionCamion(TablaDatos, txtPeriodo, txtNombre, txtApellidos,txtAño2);
  }
             
            
              public void PuenteMostrarTablaDeduccionMecanico(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos,JComboBox txtAño2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDeduccionMecanico(TablaDatos, txtPeriodo, txtNombre, txtApellidos,txtAño2);
  }
              public void PuenteMostrarTablaBono(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos,JComboBox txtAño2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaBono(TablaDatos, txtPeriodo, txtNombre, txtApellidos,txtAño2);
  }
              public void PuenteMostrarTablaDeduccionChofer(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos,JComboBox txtAño2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDeduccionChofer(TablaDatos, txtPeriodo, txtNombre, txtApellidos,txtAño2);
  }
                  public void PuenteMostrarTablaTrabajoExtra(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos,JComboBox txtAño2) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaTrabajoExtra(TablaDatos, txtPeriodo, txtNombre, txtApellidos,txtAño2);
  }
             
            public void PuenteMostrarTablaNominaChofer(JTable TablaDatos, JTextField txtPeriodo1, JTextField txtNombre1, JTextField txtApellidos1, JComboBox txtAño) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaNominaChofer(TablaDatos, txtPeriodo1, txtNombre1, txtApellidos1,txtAño);
  }
            public void PuenteMostrarTablaDedu(JTable TablaDatos, JTextField txtPeriodo, JTextField txtNombre, JTextField txtApellidos) {
    this.mp = new Metodos_Altas();
    JTable tbl = this.mp.MostrarTablaDedu(TablaDatos, txtPeriodo, txtNombre, txtApellidos);
  }
/*******buscar
 * 
 */
           public void PuenteBuscarChofer(AltaChofer prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaChofer(prov);
  }
           public void PuenteBuscarChofer2(AltaChofer prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaChofer2(prov);
  }
            public void PuenteBuscaInformacion(AltaViaje prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaInformacion(prov);
  }
           public void PuenteBuscarEstado(AltaEstado prov2) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaEstado(prov2);
  }
           public void PuenteBuscarEstadoD(AltaEstadoD prov2) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaEstadoD(prov2);
  }
          
          
              public void PuenteBuscarPersonal(AltaPersonal prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaPersonal(prov);
  }
               
              
               public void PuenteBuscarMecanico(AltaMecanico prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaMecanico(prov);
  }
           
            public void PuenteBuscarCamion(AltaCamion prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaCamion(prov);
  }
            
             
             public void PuenteBuscarTrailer(AltaTrailer prov) {
    this.mp = new Metodos_Altas();
    this.mp.ConsultaTrailer(prov);
  }
             /****
              * eliminar
              * @param 
              */
 public void PuenteEliminarChofer(AltaChofer prod) {
    this.mp = new Metodos_Altas();
    this.mp.EliminarChofer(prod);
  }
 public void PuenteEliminarCamion(AltaCamion prod) {
    this.mp = new Metodos_Altas();
    this.mp.EliminarCamion(prod);
  }
  public void PuenteEliminarTrailer(AltaTrailer prod) {
    this.mp = new Metodos_Altas();
    this.mp.EliminarTrailer(prod);
    
  }
  /****
   * Actualizar
   */
    public void PuenteActualizarChofer(AltaChofer prod) {
    this.mp = new Metodos_Altas();
    this.mp.ActualizarChofer(prod);
    }
     public void PuenteActualizarCamion(AltaCamion prod) {
    this.mp = new Metodos_Altas();
    this.mp.ActualizarCamion(prod);
    }
       public void PuenteActualizarTrailer(AltaTrailer prod) {
    this.mp = new Metodos_Altas();
    this.mp.ActualizarTrailer(prod);
    }
}
