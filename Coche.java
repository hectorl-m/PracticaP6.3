package Ejer6_3;

import javax.swing.*;

public class Coche {
    private String matricula="";
    private String marca="SEAT";
    private String modelo="ALTEA";
    private String color="blanco";
    private boolean techoSolar=false;
    private double kilometros=0;
    private int numPuertas=3;
    private int numPlazas=5;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        if (kilometros > 0) {
            this.kilometros = kilometros;
        }else{
            JOptionPane.showMessageDialog(null,"El numero de kilometros no es valido");
        }
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        if (numPuertas >0 && numPuertas <= 5) {
            this.numPuertas = numPuertas;
        }else{
            JOptionPane.showMessageDialog(null,"El numero de puertas no es valido");
        }
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        if (numPlazas > 0 && numPlazas <= 7) {
            this.numPlazas = numPlazas;
        }else{
            JOptionPane.showMessageDialog(null,"El numero de plazas no es valido");
        }
    }

    public Coche(){}

    public Coche(String matricula){
        matricula = this.matricula;
    }

    public Coche (int numPuertas, int numPlazas){
        setNumPuertas(numPuertas);
        setNumPlazas(numPlazas);
    }

    public Coche (String marca,String modelo,String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void avanzar(double kilometros){
        this.kilometros = this.kilometros + kilometros;
        JOptionPane.showMessageDialog(null,"Se han sumado "+kilometros+" kilometros al coche");
        JOptionPane.showMessageDialog(null,"Los kilometros totales del coche son "+this.kilometros+" kilometros");
    }

    public void tunear(){
        this.kilometros = 0;
        if (!this.techoSolar){
            this.techoSolar = true;
            JOptionPane.showMessageDialog(null,"Se ha aplicado techo solar al coche");
        }else{
            JOptionPane.showMessageDialog(null,"El coche ya tenia techo solar");
        }
    }

    public void tunear(String color){
        this.kilometros = 0;
        this.color = color;
        JOptionPane.showMessageDialog(null,"Se ha cambiado el color a "+this.color);
        if (!this.techoSolar){
            this.techoSolar = true;
            JOptionPane.showMessageDialog(null,"Se ha aplicado techo solar al coche");
        }else{
            JOptionPane.showMessageDialog(null,"El coche ya tenia techo solar");
        }
    }

    public void matricular(String matricula){
        this.matricula = matricula;
        JOptionPane.showMessageDialog(null,"El coche se ha matriculado con la matricula "+this.matricula);
    }
}