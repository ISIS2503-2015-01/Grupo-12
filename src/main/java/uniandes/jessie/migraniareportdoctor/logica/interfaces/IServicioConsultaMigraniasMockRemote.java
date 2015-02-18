/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.logica.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import uniandes.jessie.migraniareportdoctor.dto.EpisodioDolor;
import uniandes.jessie.migraniareportdoctor.dto.Paciente;

/**
 *
 * @author estudiante
 */

@Remote
public interface IServicioConsultaMigraniasMockRemote {
    
    public List<Paciente> getPacientes();
    
    public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteID (int id);
    
     public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteTiempo (int id, int primero, int ultimo);
    
    public EpisodioDolor darEpisodioDolor (int id, int idPaciente);
    
}
