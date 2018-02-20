/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author T-102
 */
public class AplicacionCuestionario {
    public static void main(String[] args) {
        //generamos las opciones
        Opcion op1=new Opcion("grasa",false);
        Opcion op2=new Opcion("Contaminacion",false);
        Opcion op3=new Opcion("Sol",false);
        Opcion op4=new Opcion("grasa",true);
        ArrayList<Opcion> opciones=new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        Pregunta p1=new Pregunta ();
        p1.setTitulo("¿Cual es el principal causante de cancer");
        p1.setOpciones(opciones);
        //generamos el modelo
        ModeloCuestionario modelo=new ModeloCuestionario();
        modelo.agregarPregunta(p1);
        ArrayList<Pregunta> c=  modelo.obtenerCuestionario();
        tituloPregunta.setText(p1.getTitulo());
        ButtonGroup grupo=new ButtonGroup();
        for(Opcion o: c.get(0).getOpciones()){
            JRadioButton b=new JRadioButton(o.getTitulo());
            jPanel1.add(b);
            grupo.add(b);
        }
        
    }

    public AplicacionCuestionario() {
    }
}
