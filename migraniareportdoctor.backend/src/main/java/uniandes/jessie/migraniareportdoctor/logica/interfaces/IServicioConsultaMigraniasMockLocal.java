/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.logica.interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import uniandes.jessie.migraniareportdoctor.dto.EpisodioDolor;
import uniandes.jessie.migraniareportdoctor.dto.Paciente;

/**
 *
 * @author estudiante
 */

@Local
public interface IServicioConsultaMigraniasMockLocal {
    
    /**
     * 
     * @return 
     */
    public List<Paciente> getPacientes();
    
    /**
     * 
     * @param id
     * @return 
     */
    public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteID (int id);
    
    /**
     * 
     * @param id
     * @param primero
     * @param ultimo
     * @return 
     */ 
    public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteTiempo (int id, Date primero, Date ultimo);
    
    /**
     * 
     * @param id
     * @param idPaciente
     * @return 
     */
    public EpisodioDolor darEpisodioDolor (int id, int idPaciente);
    
}
