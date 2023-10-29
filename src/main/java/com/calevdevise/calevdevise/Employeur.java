/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author PC
 */
public class Employeur {
    private int idEmployeur;
    private String raisonSociale;
    private String adresseEmp;
    
    private String codePostale;
    private String ville;
    private String pays;
    private String codeAPE;
    private String siret;
    private String numTVA;
    private String immatriculation;
    private String refOrganisme;
    private static int compteur =0;

    
    //Constructeurs
    public Employeur(String rs, String s){
    
    raisonSociale = rs;
    siret = s;
    compteur ++;  //compteur = compteur +1
    
    }
    public Employeur(){
    raisonSociale = "inconnue";
    siret = "inconnue";
    compteur ++;  //compteur = compteur +1
    }
    
    /**
     * @return the idEmployeur
     */
    public int getIdEmployeur() {
        return idEmployeur;
    }

    /**
     * @param idEmployeur the idEmployeur to set
     */
    public void setIdEmployeur(int idEmployeur) {
        this.idEmployeur = idEmployeur;
    }

    /**
     * @return the raisonSociale
     */
    public String getRaisonSociale() {
        return raisonSociale;
    }

    /**
     * @param raisonSociale the raisonSociale to set
     */
    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    /**
     * @return the adresseEmp
     */
    public String getAdresseEmp() {
        return adresseEmp;
    }

    /**
     * @param adresseEmp the adresseEmp to set
     */
    public void setAdresseEmp(String adresseEmp) {
        this.adresseEmp = adresseEmp;
    }

    /**
     * @return the codePostale
     */
    public String getCodePostale() {
        return codePostale;
    }

    /**
     * @param codePostale the codePostale to set
     */
    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the pays
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays the pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * @return the codeAPE
     */
    public String getCodeAPE() {
        return codeAPE;
    }

    /**
     * @param codeAPE the codeAPE to set
     */
    public void setCodeAPE(String codeAPE) {
        this.codeAPE = codeAPE;
    }

    /**
     * @return the siret
     */
    public String getSiret() {
        return siret;
    }

    /**
     * @param siret the siret to set
     */
    public void setSiret(String siret) {
        this.siret = siret;
    }

    /**
     * @return the numTVA
     */
    public String getNumTVA() {
        return numTVA;
    }

    /**
     * @param numTVA the numTVA to set
     */
    public void setNumTVA(String numTVA) {
        this.numTVA = numTVA;
    }

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @param immatriculation the immatriculation to set
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     * @return the refOrganisme
     */
    public String getRefOrganisme() {
        return refOrganisme;
    }

    /**
     * @param refOrganisme the refOrganisme to set
     */
    public void setRefOrganisme(String refOrganisme) {
        this.refOrganisme = refOrganisme;
    }
    
    //Methode affiche()
    public String affiche(){
        return "L'employeur :"+raisonSociale+" ,"+siret;
    }

    /**
     * @return the compteur
     */
    public static int getCompteur() {
        return compteur;
    }

    /**
     * @param aCompteur the compteur to set
     */
    public static void setCompteur(int aCompteur) {
        compteur = aCompteur;
    }
}
