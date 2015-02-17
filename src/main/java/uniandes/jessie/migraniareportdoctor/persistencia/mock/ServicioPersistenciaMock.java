/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.jessie.migraniareportdoctor.persistencia.mock;

import java.util.ArrayList;
import java.util.List;
import uniandes.jessie.migraniareportdoctor.dto.EpisodioDolor;
import uniandes.jessie.migraniareportdoctor.dto.Paciente;
import uniandes.jessie.migraniareportdoctor.excepciones.OperacionInvalidaException;
import uniandes.jessie.migraniareportdoctor.logica.interfaces.IServicioPersistenciaMockLocal;
import uniandes.jessie.migraniareportdoctor.logica.interfaces.IServicioPersistenciaMockRemote;

/**
 *
 * @author estudiante
 */
public class ServicioPersistenciaMock implements IServicioPersistenciaMockLocal, IServicioPersistenciaMockRemote

{
    
    private static ArrayList<EpisodioDolor> episodios;
    
    private static ArrayList<Paciente> pacientes;
    
    public ServicioPersistenciaMock ()
    {
        if (pacientes == null)
        {
            pacientes = new ArrayList<Paciente>();
            
            episodios = new ArrayList<EpisodioDolor> ();
            
   
        }
    }
    
    

    @Override
    public void create(Object obj) throws OperacionInvalidaException {
        if (obj instanceof Paciente)
        {
            Paciente p = (Paciente) obj;
            pacientes.add (p);
        }
        else if (obj instanceof EpisodioDolor)
        {
            EpisodioDolor e = (EpisodioDolor) obj;
            episodios.add (e);
        }
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Paciente)
        {
            Paciente edit = (Paciente) obj;
            
            Paciente paciente;
            
            for (int i = 0; i < pacientes.size(); i++)
            {
                paciente = pacientes.get(i);
                if (paciente.getId() == edit.getId())
                {
                    pacientes.set(i, edit);
                    break;
                }
            }
        }
        else if (obj instanceof EpisodioDolor)
        {
            EpisodioDolor edit = (EpisodioDolor) obj;
            EpisodioDolor episodio;
            
            for (int i = 0; i < episodios.size(); i++)
            {
                episodio = episodios.get(i);
                if (episodio.getId()== edit.getId())
                episodios.set(i, edit);
                break;
            }
        }
    }

    @Override
    public void delete(Object obj) throws OperacionInvalidaException {
        if (obj instanceof Paciente)
        {
            Paciente pacienteaborrar = (Paciente) obj;
            
            for (int i = 0; i < pacientes.size(); i++)
            {
                Paciente pac = pacientes.get(i);
                if (pac.getId()==pacienteaborrar.getId())
                {
                    pacientes.remove(i);
                    break;
                }
            }
        }
        else if (obj instanceof EpisodioDolor)
        {
            EpisodioDolor episodioborrar = (EpisodioDolor) obj;
            
            for (int i = 0; i < episodios.size(); i++)
            {
                EpisodioDolor epi = episodios.get(i);
                if (epi.getId()==episodioborrar.getId())
                {
                    episodios.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public List findAll(Class c) {
       if (c.equals(Paciente.class))
       {
           return pacientes;
       }
       else if (c.equals(EpisodioDolor.class))
       {
           return episodios;
       }
       else
           return null;
    }
    
}
