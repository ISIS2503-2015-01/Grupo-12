/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uniandes.jessie.migraniareportdoctor.dto.EpisodioDolor;
import uniandes.jessie.migraniareportdoctor.dto.Paciente;
import uniandes.jessie.migraniareportdoctor.logica.interfaces.IServicioConsultaMigraniasMockLocal;

/**
 * REST Web Service
 *
 * @author estudiante
 */
@Path("/ConsultaMigranias")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConsultaMigraniasService {

   @EJB
   private IServicioConsultaMigraniasMockLocal consultaEjb;
   
   @GET
   @Path ("pacientes/")
   public List<Paciente> getPacientes()
   {
       return consultaEjb.getPacientes();
   }
   
   @GET
   @Path ("pacientes/episodiosdolor/")
   public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteID (int id)
   {
       return consultaEjb.revisarEpisodiosDolorPacienteID(id);
   }
   
   @GET
   @Path ("pacientes/episodiosdolor/")
   public ArrayList<EpisodioDolor> revisarEpisodiosDolorPacienteTiempo (int id, Date primero, Date ultimo)
   {
       return consultaEjb.revisarEpisodiosDolorPacienteTiempo(id, primero, ultimo);
   }
   
   @GET
   @Path ("pacientes/episodiosdolor/")
   public EpisodioDolor darEpisodioDolor (int id, int idPaciente)
   {
       return consultaEjb.darEpisodioDolor(id, idPaciente);
   }
}
