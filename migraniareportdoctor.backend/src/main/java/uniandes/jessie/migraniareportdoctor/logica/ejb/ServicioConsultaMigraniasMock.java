/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.logica.ejb;

import java.util.ArrayList;
import java.util.List;
import uniandes.jessie.migraniareportdoctor.dto.EpisodioDolor;
import uniandes.jessie.migraniareportdoctor.dto.Paciente;
import uniandes.jessie.migraniareportdoctor.logica.interfaces.IServicioConsultaMigraniasMockLocal;
import uniandes.jessie.migraniareportdoctor.logica.interfaces.IServicioConsultaMigraniasMockRemote;
import uniandes.jessie.migraniareportdoctor.logica.interfaces.IServicioPersistenciaMockLocal;

/**
 *
 * @author estudiante
 */
public class ServicioConsultaMigraniasMock implements IServicioConsultaMigraniasMockLocal, IServicioConsultaMigraniasMockRemote

{
    
    private IServicioPersistenciaMockLocal persistencia;

    @Override
    public List<Paciente> getPacientes() {
        return persistencia.findAll(Paciente.class);
    }

    @Override
    public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteID(int id) {
        List<Paciente> pa = getPacientes();
        for (Paciente pa1 : pa) {
            if (pa1.getId() == id) {
                return pa1.getEpisodios();
            }
        }
        return null;
    }

    @Override
    public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteTiempo(int id, int primero, int ultimo) {
       ArrayList<EpisodioDolor> epi = this.revisarEpisodiosDolorPacienteID(id);
       ArrayList<EpisodioDolor> epiTiempo = new ArrayList<EpisodioDolor>();
        for (EpisodioDolor epi1 : epi) {
            //condición a modificar cuando termine de implementar los Date del tiempo.
            if (true) {
                epiTiempo.add(epi1);
            }
        }
       return epiTiempo;
    }

    @Override
    public EpisodioDolor darEpisodioDolor(int id, int idPaciente) {
        
        ArrayList<EpisodioDolor> epis = this.revisarEpisodiosDolorPacienteID(idPaciente);
        for (EpisodioDolor epi : epis) {
            if (epi.getId() == id) {
                return epi;
            }
        }
        return null;
    }
    
}
