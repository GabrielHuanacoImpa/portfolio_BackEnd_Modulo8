/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Idioma;
import java.util.List;

/**
 *
 * @author GHI
 */
public interface IIdiomaService {
        //metodo para traer todas las personas
    public List<Idioma> getIdioma ();
    
    //metoddo para dar de alta una persona
    public void saveIdioma (Idioma idio);
    
    //metodo para borrar una persona
    public void deleteIdioma (Long id);
    
    //metodo Idioma para encontrar una persona
    public Idioma findIdioma (Long id);
}
