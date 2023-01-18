/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Softskills;
import com.mipagina.apiporfolio.Repository.ISoftskillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author GHI
 */
@Service
public class SoftskillsService implements ISoftskillsService  {
       
    @Autowired
    private ISoftskillsRepository softRepository;
    //metodo para traer todas las softnas
    @Override
    public List<Softskills> getSoftskills (){
        List<Softskills> listaSoftskills = softRepository.findAll();
        return listaSoftskills;
    }
    
    //metodo para dar de alta una softna
    @Override
    public void saveSoftskills (Softskills soft){
        softRepository.save(soft);
       
    }
    
    //metodo para borrar una softna
    @Override
    public void deleteSoftskills (Long id){
        softRepository.deleteById(id);
    }
    
    //metodo Softskills para encontrar una softna
    @Override
    public Softskills findSoftskills (Long id){
        //acá si no encuentra la softna, devuelve null por eso va el orelse
        Softskills soft = softRepository.findById(id).orElse(null);
        return soft;
    }
      
}
