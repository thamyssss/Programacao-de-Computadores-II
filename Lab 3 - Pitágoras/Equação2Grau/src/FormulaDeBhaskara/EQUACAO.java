/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulaDeBhaskara;

import java.lang.Math;

/**
 *
 * @author tatah
 */
public class EQUACAO {
    
    private double a, b, c;
    private double raiz1;
    private double raiz2;
    private double delta;
    
    public EQUACAO(){
        
           this.a = 0;
           this.b = 0;
           this.c = 0;
           this.raiz1 = 0;
           this.raiz2 = 0;
           this.delta = 0;
    }
    
    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getRaiz1() {
        return this.raiz1;
    }

    public void setRaiz1(double raiz1) {
        this.raiz1 = raiz1;
    }

    public double getRaiz2() {
        return this.raiz2;
    }

    public void setRaiz2(double raiz2) {
        this.raiz2 = raiz2;
    }

    public double getDelta() {
        return this.delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    
    public double delta(){
        
        delta = (Math.pow(b,2) - (4*a*c));        
        return delta;
    }
    
    public double PrimeiraRaiz(){
   
        raiz1 = (-b + Math.sqrt(delta)) / (2*a); 
        return raiz1;
    }
    
    public double SegundaRaiz(){
       
        raiz2 = (-b - Math.sqrt(delta)) / (2*a);       
        return raiz2;
    }
}
