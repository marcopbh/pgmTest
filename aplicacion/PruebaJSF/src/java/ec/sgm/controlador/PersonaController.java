/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgm.controlador;

import ec.sgm.modelo.Persona;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author JONNATHAN
 */
@SessionScoped
@Named("personaController")
public class PersonaController implements Serializable{
    
private Persona persona = new Persona(); 

private List<Persona> itemsPersona = new ArrayList<>();

private int valor1 = 0;
private int valor2 = 0;
private int respuesta = 0;
        
public PersonaController(){
    //cargarPersona();
    
    System.out.println("Carga....");
    //persona = new Persona();
    //itemsPersona = new ArrayList<>();
    
}

public void cargarPersona(){
    System.out.println("Cargando....");
    persona.setCodigo(1);
    persona.setNombre("Jonathan");
    persona.setFecha_Nacimiento(new Date());
    System.out.println("Carga....");
    
}

public void cargarPersonaLista(){
    
    System.out.println("Cargando Lista....");
   
    Persona per= new Persona();
    per.setCodigo(persona.getCodigo());
    per.setNombre(persona.getNombre());
    per.setFecha_Nacimiento(persona.getFecha_Nacimiento());
    
    
    
    itemsPersona.add(per);
    for(Persona p:itemsPersona){
        
        System.out.println("Nombre "+p.getNombre());
    }
    System.out.println("Carga....");
    
}

public void generaSuma(){
    System.out.println("genera suma....");
    respuesta = valor1 + valor2;
}



    public List<Persona> getItemsPersona() {
        return itemsPersona;
    }

    public void setItemsPersona(List<Persona> itemsPersona) {
        this.itemsPersona = itemsPersona;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }


    
    
}
