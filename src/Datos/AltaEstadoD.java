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
public class AltaEstadoD {
     private String First_Name;
    private String Last_Name;
    private int Year;
    private int Period;
    private String Status;

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

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AltaEstadoD() {
    }

    public AltaEstadoD(String First_Name, String Last_Name, int Year, int Period, String Status) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Year = Year;
        this.Period = Period;
        this.Status = Status;
    }

    
}