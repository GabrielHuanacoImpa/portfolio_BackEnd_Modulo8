/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Softskills;
import java.util.List;
/**
 *
 * @author GHI
 */
public interface ISoftskillsService{

    //metodo para traer todas las personas
    public List<Softskills> getSoftskills ();
    
    //metoddo para dar de alta una persona
    public void saveSoftskills (Softskills soft);
    
    //metodo para borrar una persona
    public void deleteSoftskills (Long id);
    
    //metodo Softskills para encontrar una persona
    public Softskills findSoftskills (Long id); 
}
