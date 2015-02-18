/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.dto;

import java.util.Date;

/**
 *
 * @author estudiante
 */
public class EpisodioDolor {
    
    //--Atributos--
    
    private int id;
    
    private Date tiempoDolor;
    
    private String medicamentos;
    
    private String nivelDolor;
    
    private String localizacion;
    
    private String intensidad;
    
    private String patronSuenio;
    
    private String exacerbante;
    
    //--Constructores--
    
    public EpisodioDolor ()
    {
        
    }
    
    public EpisodioDolor (int pId, Date pTiempoDolor, String pMedicamentos, String pNivelDolor,
            String pLocalizacion, String pIntensidad, String pPatronSuenio, String pExacerbante)
    {
        id = pId;
        tiempoDolor = pTiempoDolor;
        medicamentos = pMedicamentos;
        nivelDolor = pNivelDolor;
        localizacion = pLocalizacion;
        intensidad = pIntensidad;
        patronSuenio = pPatronSuenio;
        exacerbante = pExacerbante;
    }
    
    //--Setters & Getters
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTiempoDolor() {
        return tiempoDolor;
    }

    public void setTiempoDolor(Date tiempoDolor) {
        this.tiempoDolor = tiempoDolor;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getNivelDolor() {
        return nivelDolor;
    }

    public void setNivelDolor(String nivelDolor) {
        this.nivelDolor = nivelDolor;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public String getPatronSuenio() {
        return patronSuenio;
    }

    public void setPatronSuenio(String patronSuenio) {
        this.patronSuenio = patronSuenio;
    }

    public String getExacerbante() {
        return exacerbante;
    }

    public void setExacerbante(String exacerbante) {
        this.exacerbante = exacerbante;
    }
    
    
}
