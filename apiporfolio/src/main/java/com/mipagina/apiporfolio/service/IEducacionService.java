/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Educacion;
import java.util.List;
/**
 *
 * @author GHI
 */
public interface IEducacionService {
              //metodo para traer todas las personas
    public List<Educacion> getEducacion ();
    
    //metoddo para dar de alta una persona
    public void saveEducacion (Educacion edu);
    
    //metodo para borrar una persona
    public void deleteEducacion (Long id);
    
    //metodo Educacion para encontrar una persona
    public Educacion findEducacion (Long id);  
}
