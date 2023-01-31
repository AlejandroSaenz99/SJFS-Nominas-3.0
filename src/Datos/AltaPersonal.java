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
public class AltaPersonal {
    private int id;
    private String First_Name;
    private String Last_Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public AltaPersonal(int id, String First_Name, String Last_Name) {
        this.id = id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }

    public AltaPersonal() {
    }

    
}
