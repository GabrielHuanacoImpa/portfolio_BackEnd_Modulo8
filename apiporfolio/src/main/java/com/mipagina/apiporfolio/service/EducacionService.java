/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Educacion;
import com.mipagina.apiporfolio.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author GHI
 */
@Service
public class EducacionService implements IEducacionService {
          
    @Autowired
    private IEducacionRepository eduRepository;
    //metodo para traer todas las edunas
    @Override
    public List<Educacion> getEducacion (){
        List<Educacion> listaEducacion = eduRepository.findAll();
        return listaEducacion;
    }
    
    //metodo para dar de alta una eduna
    @Override
    public void saveEducacion (Educacion edu){
        eduRepository.save(edu);
       
    }
    
    //metodo para borrar una eduna
    @Override
    public void deleteEducacion (Long id){
        eduRepository.deleteById(id);
    }
    
    //metodo Educacion para encontrar una eduna
    @Override
    public Educacion findEducacion (Long id){
        //acá si no encuentra la eduna, devuelve null por eso va el orelse
        Educacion edu = eduRepository.findById(id).orElse(null);
        return edu;
    }
    
}
