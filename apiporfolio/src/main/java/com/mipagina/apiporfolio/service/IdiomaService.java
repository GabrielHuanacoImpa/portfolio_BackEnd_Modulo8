/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Idioma;
import com.mipagina.apiporfolio.Repository.IIdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author GHI
 */
@Service
public class IdiomaService implements IIdiomaService  {
       
    @Autowired
    private IIdiomaRepository idioRepository;
    //metodo para traer todas las idionas
    @Override
    public List<Idioma> getIdioma (){
        List<Idioma> listaIdioma = idioRepository.findAll();
        return listaIdioma;
    }
    
    //metodo para dar de alta una idiona
    @Override
    public void saveIdioma (Idioma idio){
        idioRepository.save(idio);
       
    }
    
    //metodo para borrar una idiona
    @Override
    public void deleteIdioma (Long id){
        idioRepository.deleteById(id);
    }
    
    //metodo Idioma para encontrar una idiona
    @Override
    public Idioma findIdioma (Long id){
        //acá si no encuentra la idiona, devuelve null por eso va el orelse
        Idioma idio = idioRepository.findById(id).orElse(null);
        return idio;
    }
        
}
