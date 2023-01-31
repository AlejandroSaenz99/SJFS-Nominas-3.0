/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author AlejandroSaenz
 */
public class AltaChofer {
    private int id;
    private String First_Name;
    private String Last_Name;
    private int Porcentage;
    public AltaChofer(int id, String Nombre, String Apellidos, int Porcentage) {
        this.id = id;
        this.First_Name = Nombre;
        this.Last_Name = Apellidos;
        this.Porcentage=Porcentage;
    }

    public AltaChofer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return First_Name;
    }

    public void setNombre(String Nombre) {
        this.First_Name = Nombre;
    }

    public String getApellidos() {
        return Last_Name;
    }

    public void setApellidos(String Apellidos) {
        this.Last_Name = Apellidos;
    }
    public int getPorcentaje() {
        return Porcentage;
    }

    public void setPorcentaje(int Porcentaje) {
        this.Porcentage = Porcentaje;
    }
}
