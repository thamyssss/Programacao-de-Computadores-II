/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoremadepit;

import java.lang.Math;

/**
 *
 * @author tatah
 */
public class Triângulo {
    
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    
    public Triângulo() {
        this.cateto1 = 0;
        this.cateto2 = 0;
        this.hipotenusa = 0;
    }

    public double getCateto1() {
        return this.cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return this.cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public double getHipotenusa() {
        return this.hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    public double CalculaHip() {
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        return hipotenusa;
    }
    
}
