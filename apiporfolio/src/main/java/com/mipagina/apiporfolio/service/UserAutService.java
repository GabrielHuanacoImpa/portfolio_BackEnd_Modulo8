/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.UserAut;
import com.mipagina.apiporfolio.Repository.IUserAutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GHI
 */
@Service
public class UserAutService implements IUserAutService  {
         @Autowired
    private IUserAutRepository userAutRepository;
    //metodo para traer todas las userAutnas
    @Override
    public List<UserAut> getUserAut (){
        List<UserAut> listaUserAuts = userAutRepository.findAll();
        return listaUserAuts;
    }
    
    //metodo para dar de alta una userAutna
    @Override
    public void saveUserAut (UserAut userAut){
        userAutRepository.save(userAut);
    }
    
    //metodo para borrar una userAutna
    @Override
    public void deleteUserAut (Long id){
        userAutRepository.deleteById(id);
    }
    
    //metodo UserAut para encontrar una userAutna
    @Override
    public UserAut findUserAut (Long id){
        //acá si no encuentra la userAutna, devuelve null por eso va el orelse
        UserAut userAut = userAutRepository.findById(id).orElse(null);
        return userAut;
    }
    
}
