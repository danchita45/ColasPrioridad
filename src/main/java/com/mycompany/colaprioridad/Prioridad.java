/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioridad;

import EDD.Machote;
import java.util.Iterator;

/**
 *
 * @author danchita45
 */
public class Prioridad implements Machote {
    //se ordena por prioridad
    //se hacen don pilas de igual longitud que la cola de prioridad
    //se elimina el primer dato, intenta eliminad de la pila uno, de no tener datos lo inserta directamente
    //se eliminan datos mientras haya
    //comparamos el de la cola y el de la pila, si el de la cola tiene mayor prioridad, el dato de la cola se va a la pila2
    //y el dato de la pila se reinserta
    //el mayor va primero(C y P)IMPORTANTE y se manda a la 2 
    //lo que está en pila1, se va a pila 2, de ser mayor C

    Auto Pila1[] = new Auto[5];
    Auto Pila2[] = new Auto[5];
    Auto ColaPrioridad[] = new Auto[5];
    int t;
    Auto obj =null;
    @Override
    public boolean vacio() {
        if(t==-1 && obj==null){
            System.out.println("cola vacia");
            return true;
        }else{
            return false;
        }
    }
 

    @Override
    public boolean llena() {
       return t==ColaPrioridad.length;
    }

    @Override
    public boolean inserta(Object obj) {
       Auto a = (Auto)obj;
       
       if(ColaPrioridad[t]==null && t==0){
           ColaPrioridad[t]=a;
           return true;
       }else{
           for (int i = 0; i < ColaPrioridad.length; i++) {
               if(ColaPrioridad[i].prioridad>a.prioridad){
                   if(ColaPrioridad[i+1]==null){
                       ColaPrioridad[i+1]=a;
                       
                       return true;
                   }else{
                       
                   }
               }
           }
       }
       return false;
    }
    
    
    
    
    @Override
    public Object elimina() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
