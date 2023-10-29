/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author Paul EDIDE
 */
public final class Employe {
    private int idEmploye;
    private String nom;
    private String prenom;
    private String convCollective = "aucune";

    public Employe(int idEmploye, String nom, String prenom) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Employe(int idEmploye, String nom) {
        this.idEmploye = idEmploye;
        this.nom = nom;
    }

    public Employe(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public Employe() {
    }
    
    
    
    void setIdEmploye(int idEmploye){
    this.idEmploye = idEmploye;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @param convCollective the convCollective to set
     */
    public void setConvCollective(String convCollective) {
        this.convCollective = convCollective;
    }

    /**
     * @return the idEmploye
     */
    public int getIdEmploye() {
        return idEmploye;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the convCollective
     */
    public String getConvCollective() {
        return convCollective;
    }
    
}
