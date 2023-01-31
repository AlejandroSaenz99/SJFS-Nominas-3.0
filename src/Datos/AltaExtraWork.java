/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author del.sistemas_res
 */
public class AltaExtraWork {
    private int Id;
    private String First_Name;
    private String Last_Name;
    private float Amount;
    private String Details;
    private int Period;
    private Date Date;
    private int Year;

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

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int Period) {
        this.Period = Period;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public AltaExtraWork(int Id, String First_Name, String Last_Name, float Amount, String Details, int Period, Date Date, int Year) {
        this.Id = Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Amount = Amount;
        this.Details = Details;
        this.Period = Period;
        this.Date = Date;
        this.Year = Year;
    }

    public AltaExtraWork() {
    }
}
