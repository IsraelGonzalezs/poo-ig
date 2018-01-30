/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
        import javax.swing.*;
public class ProbarConstructores {
    public static void main(String[] args) {
        Alumno a=new Alumno();
        System.err.println("Tu edad es "+a.getEdad());
        int x=2;
        System.err.println(x);
        JFrame v=new JFrame("Que tal");
        v.setSize(400, 200);
        v.setVisible(true);
        
    }
    
}
