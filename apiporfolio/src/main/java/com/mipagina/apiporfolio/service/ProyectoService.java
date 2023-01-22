/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Proyecto;
import com.mipagina.apiporfolio.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author GHI
 */
@Service
public class ProyectoService implements IProyectoService {
            
    @Autowired
    private IProyectoRepository proRepository;
    //metodo para traer todas las pronas
    @Override
    public List<Proyecto> getProyecto (){
        List<Proyecto> listaProyecto = proRepository.findAll();
        return listaProyecto;
    }
    
    //metodo para dar de alta una prona
    @Override
    public void saveProyecto (Proyecto pro){
        proRepository.save(pro);
       
    }
    
    //metodo para borrar una prona
    @Override
    public void deleteProyecto (Long id){
        proRepository.deleteById(id);
    }
    
    //metodo Proyecto para encontrar una prona
    @Override
    public Proyecto findProyecto (Long id){
        //acá si no encuentra la prona, devuelve null por eso va el orelse
        Proyecto pro = proRepository.findById(id).orElse(null);
        return pro;
    }
    
}
