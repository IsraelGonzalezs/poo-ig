/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ig;

/**
 *
 * @author T-102
 */
public class PooIg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //Tendremos que geerqar antes de las clases anteriores
        Usuario x=new Usuario ();
        x.altura=1.75f;
        x.peso=85f;
        Imc algo=new Imc ();
        algo.u=x;
        //Calculamos el imc a traves de su objeto
        System.out.println(algo.calcular());
        
                
    }
    
}
