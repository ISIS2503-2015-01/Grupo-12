/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.dto;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Paciente {
    
    private int id;
    
    private String nombre;
    
    private String apellidos;
    
    private ArrayList<EpisodioDolor> episodios;
    
    public Paciente()
    {
        
    }
    
    public Paciente (int pId, String pNombre, String pApellidos)
    {
        id = pId;
        nombre = pNombre;
        apellidos = pApellidos;
        episodios = new ArrayList<EpisodioDolor>();
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int pId)
    {
        id = pId;
    }
    
    public String getNombre ()
    {
        return nombre;
    }
    
    public void setNombre (String pNombre)
    {
        nombre = pNombre;
    }
    
    public String getApellidos ()
    {
        return apellidos;
    }
    
    public ArrayList<EpisodioDolor> getEpisodios()
    {
        return episodios;
    }
    
    public void setEpisodios (ArrayList<EpisodioDolor> epi)
    {
        episodios = epi;
    }
}


