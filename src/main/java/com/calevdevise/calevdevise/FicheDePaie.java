/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

import java.util.Date;

/**
 *
 * @author Paul EDIDE
 */
public class FicheDePaie {
    
    int idFicheDePaie;
    String mentionConserv;
    Date dateFichePaie;

    //Fait une surcharge de constructeurs
    public FicheDePaie() {
        this(0);
                
    }

    FicheDePaie(int idf) {
        this(idf,"inconnue");
         }

    FicheDePaie(int idFicheDePaie, String mentionConserv) {
      this.idFicheDePaie = idFicheDePaie ; 
       this.mentionConserv = mentionConserv;
       dateFichePaie = new Date();
    }
    
}
