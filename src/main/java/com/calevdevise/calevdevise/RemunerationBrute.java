/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author Paul EDIDE
 */
public class RemunerationBrute {
    int idRemBrute;
    double salaireBase;
    double absenceNR;  //Absence Non remunérées
    double heureSupExo; //Heures sup exonérées
    double indemniteNS; //Indemnité Non soumise IJSS
    
    void affiche(){
        System.out.println("Le salaire de base"+salaireBase);
        System.out.println("Absence Non remunérées"+absenceNR);
        System.out.println("Heures sup exonérées"+heureSupExo);
        System.out.println("Indemnité Non soumise IJSS"+indemniteNS);
    }
    
}
