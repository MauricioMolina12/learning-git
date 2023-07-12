/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author ASUS
 */
public class Calculator {

    private double FirstName;
    private double SecondName;
    private double operacion;

    public Calculator(double FirstName, double SecondName, double operacion) {
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.operacion = operacion;
    }

    public Calculator() {
    }

    public double getFirstName() {
        return FirstName;
    }

    public void setFirstName(double FirstName) {
        this.FirstName = FirstName;
    }

    public double getSecondName() {
        return SecondName;
    }

    public void setSecondName(double SecondName) {
        this.SecondName = SecondName;
    }

    public double getOperacion() {
        return operacion;
    }

    public void setOperacion(double operacion) {
        this.operacion = operacion;
    }

    public double Suma(double FirstName, double SecondName) {

        return FirstName + SecondName;

    }

    public double Resta(double FirstName, double SecondName) {

        return FirstName - SecondName;
    }

    public double Multi(double FirstName, double SecondName) {
        return FirstName * SecondName;

    }

    public double Divi(double FirstName, double SecondName) {

        return  FirstName / SecondName;
    }

}
