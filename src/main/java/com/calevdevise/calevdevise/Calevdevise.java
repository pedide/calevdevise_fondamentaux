/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.calevdevise.calevdevise;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Calevdevise {

    public static void main(String[] args) {
        //Creation d'une objet ou une instance Employe
        
        Employe empl1 = new Employe();
        empl1.setIdEmploye(1);
        empl1.setNom("Funes");
        empl1.setPrenom("Louis");
        empl1.setConvCollective("Aucune");
        
        //Creation d'un employeur
        Employeur em1 = new Employeur("Airbus","1234567"); //Le constructeur par défaut
        
        //Affichage dans la console
        System.out.println("L'employeur :"+em1.getRaisonSociale()
                +" ,"+em1.getSiret());
        System.out.println("Le nombre d'employeur est :"+em1.getCompteur());
        System.out.println(em1.affiche());
        
        Employeur empl2 = new Employeur("ratp","23367");
        System.out.println("Le nombre d'employeur est :"+empl2.getCompteur());
        System.out.println(empl2.affiche());
        System.out.println("***********************************");
        //Création d'une instance de fiche de paie
        FicheDePaie fdp = new FicheDePaie();
        fdp.idFicheDePaie = 1;
        fdp.mentionConserv = "Bulletin de paie à conserver pendant 10 ans";
        fdp.dateFichePaie = new Date();
        
        FicheDePaie fdp2 = new FicheDePaie(2);
        
        FicheDePaie fdp3 = new FicheDePaie(3,"Bulletin de paie à conserver pendant 10 ans");
        
        System.out.println(fdp.dateFichePaie);
        System.out.println("***********************************");
        //Appel de la méthode affiche()
        PartSalariale rem = new PartSalariale();
        rem.taux =26.37;
        rem.montant = 4000.00;
        rem.salaireBase = 1300.00;
        affiche(rem);  //J'affiche une part salariale
        
         //Interfaces
    ISante st = new Sante(1,2900.00,295.00,39.00);  
    
    System.out.println("Id santé :"+st.getIdSante());
    System.out.println("sécu :"+st.getSecuSociale());
    System.out.println(" complTA :"+st.getCompleTA());
    System.out.println(" complé santé :"+st.getCompleSante());
    
    //Héritage
    Employe sal1 = new Employe(2,"Jean","Durand");
    Employe sal2 = new Employe(3,"Pierre","Durand");
    Employe sal3 = new Employe(4,"Albert","Durand");
    Employe sal4 = new Employe(5,"Thomas","Durand");
    Empilable maPile = new Pile();
    maPile.push(sal1);
    System.out.println("ma Pile :"+maPile);  //Pointuer vers une adresse
    
    Employe[] tabS = new Employe[10];
    tabS[0] = sal1;
    tabS[1] = sal2;
    tabS[2] = sal3;
    for(int i=0; i<tabS.length; i++){
        System.out.println("Tableau  "+tabS[i]);
    }
    
        
   maPile.push(sal1);
   maPile.push(sal2);
   maPile.push(sal3);
   maPile.push(sal4);
   System.out.println("Infos de ma Pile de salariés :" +maPile.affiche());
    
    Employe v = maPile.pop();
    
    }

    private static void affiche(RemunerationBrute remu) {  //Affiche de RemBrute
    remu.affiche();
    }
    
   
}
