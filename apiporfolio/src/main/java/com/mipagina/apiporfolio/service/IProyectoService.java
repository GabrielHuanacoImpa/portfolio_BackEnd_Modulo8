/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Proyecto;
import java.util.List;
/**
 *
 * @author GHI
 */
public interface IProyectoService {
              //metodo para traer todas las personas
    public List<Proyecto> getProyecto ();
    
    //metoddo para dar de alta una persona
    public void saveProyecto (Proyecto pro);
    
    //metodo para borrar una persona
    public void deleteProyecto (Long id);
    
    //metodo Proyecto para encontrar una persona
    public Proyecto findProyecto (Long id);  
}
