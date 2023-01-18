/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Persona;
import java.util.List;

/**
 *
 * @author GHI
 */
public interface IPersonaService {
    //metodo para traer todas las personas
    public List<Persona> getPersonas ();
    
    //metoddo para dar de alta una persona
    public void savePersona (Persona perso);
    
    //metodo para borrar una persona
    public void deletePersona (Long id);
    
    //metodo Persona para encontrar una persona
    public Persona findPersona (Long id);
}
