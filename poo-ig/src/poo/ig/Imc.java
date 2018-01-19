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
public class Imc {
    //El siguiente atributo es de tipo
    //Composicion agregacion
    Usuario u;
    
    public String calcular(){
        float imc=u.peso/(u.altura*u.altura);
        return "Tu resultado es" +imc;
        
        return "Aqui aparecera tu resultado";
    }
    
}
