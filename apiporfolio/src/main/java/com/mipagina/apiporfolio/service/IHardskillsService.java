/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Hardskills;
import java.util.List;
/**
 *
 * @author GHI
 */
public interface IHardskillsService {

    //metodo para traer todas las personas
    public List<Hardskills> getHardskills ();
    
    //metoddo para dar de alta una persona
    public void saveHardskills (Hardskills hard);
    
    //metodo para borrar una persona
    public void deleteHardskills (Long id);
    
    //metodo Hardskills para encontrar una persona
    public Hardskills findHardskills (Long id);

}
