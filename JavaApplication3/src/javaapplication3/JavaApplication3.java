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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Formule f1 = new Formule(1,-10,10);
            f1.setReponses();
            
            System.out.println("x1: "+f1.getX1()+" x2: "+f1.getX2());
        } catch (Exception e) {
            System.out.println("erreur");
        }
        
    }
    
}
