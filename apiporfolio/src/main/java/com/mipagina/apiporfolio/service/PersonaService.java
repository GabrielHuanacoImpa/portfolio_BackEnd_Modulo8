/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mipagina.apiporfolio.Repository.IPersonaRepository;

/**
 *
 * @author GHI
 */
@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaRepository persoRepository;
    //metodo para traer todas las personas
    @Override
    public List<Persona> getPersonas (){
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }
    
    //metodo para dar de alta una persona
    @Override
    public void savePersona (Persona perso){
        persoRepository.save(perso);
    }
    
    //metodo para borrar una persona
    @Override
    public void deletePersona (Long id){
        persoRepository.deleteById(id);
    }
    
    //metodo Persona para encontrar una persona
    @Override
    public Persona findPersona (Long id){
        //acá si no encuentra la persona, devuelve null por eso va el orelse
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
    
}
