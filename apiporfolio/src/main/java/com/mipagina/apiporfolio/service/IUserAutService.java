/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.service;

import com.mipagina.apiporfolio.Model.UserAut;
import java.util.List;

/**
 *
 * @author GHI
 */
public interface IUserAutService {
    //metodo para traer todas las personas
    public List<UserAut> getUserAut ();
    
    //metoddo para dar de alta una persona
    public void saveUserAut (UserAut userAut);
    
    //metodo para borrar una persona
    public void deleteUserAut (Long id);
    
    //metodo UserAut para encontrar una persona
    public UserAut findUserAut (Long id);
}
