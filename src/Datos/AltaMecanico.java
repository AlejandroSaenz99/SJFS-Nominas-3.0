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
public class AltaMecanico {
    private int Id;
    private String First_Name;
    private String Last_Name;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public AltaMecanico(int Id, String First_Name, String Last_Name) {
        this.Id = Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }

    public AltaMecanico() {
    }
}
