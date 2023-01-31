/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author AlejandroSaenz
 */
public class AltaPagoMecanico {
     private int Id;
    private String First_Name;
    private String Last_Name;
    private int Period;
    private Date Date;
    private int Year;
    private float Amount;
    private float Deduction;
    private String Deduction_Details;
    private float Bonus;

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

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public float getDeduction() {
        return Deduction;
    }

    public void setDeduction(float Deduction) {
        this.Deduction = Deduction;
    }

    public String getDeduction_Details() {
        return Deduction_Details;
    }

    public void setDeduction_Details(String Deduction_Details) {
        this.Deduction_Details = Deduction_Details;
    }

    public float getBonus() {
        return Bonus;
    }

    public void setBonus(float Bonus) {
        this.Bonus = Bonus;
    }

    public AltaPagoMecanico(int Id, String First_Name, String Last_Name, int Period, Date Date, int Year, float Amount, float Deduction, String Deduction_Details, float Bonus) {
        this.Id = Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Period = Period;
        this.Date = Date;
        this.Year = Year;
        this.Amount = Amount;
        this.Deduction = Deduction;
        this.Deduction_Details = Deduction_Details;
        this.Bonus = Bonus;
    }

    public AltaPagoMecanico() {
    }
}