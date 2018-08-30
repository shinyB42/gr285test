/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
/**
 *
 * @author usager
 */
public class Formule {
    private double a,b,c,x1,x2;

    public Formule(double a, double b, double c) throws Exception {
        if (a==0) {
            throw new Exception();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    public void setReponses() throws Exception {
        double delta = Math.pow(b, 2)-4*a*c;
        if (delta>0) {
            x1= ((b*-1)+Math.sqrt(delta))/(2*a); 
            x2=((b*-1)-Math.sqrt(delta))/(2*a);
        } else if (delta==0){
            x1=x2=(b/(2*a))*-1;
        } else {
            throw new Exception();
        }
        
    }
    
}
