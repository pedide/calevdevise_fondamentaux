/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author Paul EDIDE
 */
class Pile extends ListeSalarie implements Empilable{

    private int valeur =0;

    @Override
    public void push(Employe empl1) {
        valeur++;
        add(empl1);
       
    }

    @Override
    public Employe pop() {
        return get(valeur--);
       }
    
}
