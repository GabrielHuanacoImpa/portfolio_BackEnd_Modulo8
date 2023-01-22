/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.Experiencia;
import com.mipagina.apiporfolio.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author GHI
 */
@Service
public class ExperienciaService implements IExperienciaService{
        
    @Autowired
    private IExperienciaRepository expRepository;
    //metodo para traer todas las expnas
    @Override
    public List<Experiencia> getExperiencia (){
        List<Experiencia> listaExperiencia = expRepository.findAll();
        return listaExperiencia;
    }
    
    //metodo para dar de alta una expna
    @Override
    public void saveExperiencia (Experiencia exp){
        expRepository.save(exp);
       
    }
    
    //metodo para borrar una expna
    @Override
    public void deleteExperiencia (Long id){
        expRepository.deleteById(id);
    }
    
    //metodo Experiencia para encontrar una expna
    @Override
    public Experiencia findExperiencia (Long id){
        //acá si no encuentra la expna, devuelve null por eso va el orelse
        Experiencia exp = expRepository.findById(id).orElse(null);
        return exp;
    }
    
}
