/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author Paul EDIDE
 */
public class PartSalariale extends RemunerationBrute{
    double taux;
    double montant;
    
    @Override
    void affiche(){
        super.affiche();
        System.out.println("Le taux : "+taux);
        System.out.println("Le montant :"+montant);
    }
    
}
