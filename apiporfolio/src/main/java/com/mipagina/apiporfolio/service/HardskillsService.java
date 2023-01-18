/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Hardskills;
import com.mipagina.apiporfolio.Repository.IHardskillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author GHI
 */
@Service
public class HardskillsService implements IHardskillsService {
    
    @Autowired
    private IHardskillsRepository hardRepository;
    //metodo para traer todas las hardnas
    @Override
    public List<Hardskills> getHardskills (){
        List<Hardskills> listaHardskills = hardRepository.findAll();
        return listaHardskills;
    }
    
    //metodo para dar de alta una hardna
    @Override
    public void saveHardskills (Hardskills hard){
        hardRepository.save(hard);
       
    }
    
    //metodo para borrar una hardna
    @Override
    public void deleteHardskills (Long id){
        hardRepository.deleteById(id);
    }
    
    //metodo Hardskills para encontrar una hardna
    @Override
    public Hardskills findHardskills (Long id){
        //acá si no encuentra la hardna, devuelve null por eso va el orelse
        Hardskills hard = hardRepository.findById(id).orElse(null);
        return hard;
    }
       
}
