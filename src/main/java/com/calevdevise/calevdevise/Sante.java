/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calevdevise.calevdevise;

/**
 *
 * @author Paul EDIDE
 */
public class Sante implements ISante{
    
    private int idSante;
    private double secuSociale;
    private double compleTA;
    private double compleTB;
    private double compleSante;
    private double maladieAT;

    public Sante() {
    }

    public Sante(int idSante, double secuSociale, double compleTA, double compleTB, double compleSante, double maladieAT) {
        this.idSante = idSante;
        this.secuSociale = secuSociale;
        this.compleTA = compleTA;
        this.compleTB = compleTB;
        this.compleSante = compleSante;
        this.maladieAT = maladieAT;
    }

    public Sante(int idSante, double secuSociale, double compleTA, double compleSante) {
        this.idSante = idSante;
        this.secuSociale = secuSociale;
        this.compleTA = compleTA;
        this.compleSante = compleSante;
    }

    /**
     * @return the idSante
     */
    

    /**
     * @param idSante the idSante to set
     */
    public void setIdSante(int idSante) {
        this.idSante = idSante;
    }

    

    /**
     * @param secuSociale the secuSociale to set
     */
    public void setSecuSociale(double secuSociale) {
        this.secuSociale = secuSociale;
    }

    

  

    /**
     * @return the compleTB
     */
    public double getCompleTB() {
        return compleTB;
    }

    /**
     * @param compleTB the compleTB to set
     */
    public void setCompleTB(double compleTB) {
        this.compleTB = compleTB;
    }

    /**
     * @param compleSante the compleSante to set
     */
    public void setCompleSante(double compleSante) {
        this.compleSante = compleSante;
    }

    /**
     * @return the maladieAT
     */
    public double getMaladieAT() {
        return maladieAT;
    }

    /**
     * @param maladieAT the maladieAT to set
     */
    public void setMaladieAT(double maladieAT) {
        this.maladieAT = maladieAT;
    }

    @Override
    public int getIdSante() {
        return idSante;
    }

    @Override
    public double getSecuSociale() {
    return secuSociale;
    }

    @Override
    public double getCompleTA() {
        
    return compleTA; 
    }

    @Override
    public double getCompleSante() {
       return compleSante;
    }

   
    
}
