/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author HeuberLima
 */
public class Retangulo {
    
    private double comprimento;
    private double largura;
    private double perimetro;
    private double area;
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    
    public double getComprimento(){
        return this.comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void calcularPerimetro() {
        this.perimetro = (this.comprimento * 2) 
                + (this.largura * 2);
    }

    public double getArea() {
        return area;
    }

    public void calcularArea() {
        this.area = this.comprimento * this.largura;
    }
    
    
}
