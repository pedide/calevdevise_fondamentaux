/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author Paul EDIDE
 */
public class ListeSalarie {
    
    private Employe []tab = new Employe[10];
    private int compteur=0;
    
    Employe get(int indice){
    return tab[indice];
    }
    //Add permet d'ajouter une valeur dans le tableau
    void add(Employe value){
        tab[compteur++] = value;
    }
    
    public String affiche(){
    String resulat ="";
    for(int i=0; i< compteur; i++){
    resulat +="["+tab[i].getNom()+" "+tab[i].getPrenom() +"] \n";
            }
    return resulat;
    }
}
