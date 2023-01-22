/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Experiencia;
import java.util.List;
/**
 *
 * @author GHI
 */
public interface IExperienciaService {
           //metodo para traer todas las personas
    public List<Experiencia> getExperiencia ();
    
    //metoddo para dar de alta una persona
    public void saveExperiencia (Experiencia exp);
    
    //metodo para borrar una persona
    public void deleteExperiencia (Long id);
    
    //metodo Experiencia para encontrar una persona
    public Experiencia findExperiencia (Long id); 
}
