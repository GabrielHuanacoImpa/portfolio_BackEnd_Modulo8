/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import com.mipagina.apiporfolio.Model.UserAut;
import com.mipagina.apiporfolio.service.IUserAutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author GHI
 */

@RestController
public class UserAutController {
        @Autowired
    private IUserAutService interUserAut;
    
    @GetMapping ("/userAut/traer")
    public List<UserAut> getUserAuts() {
        return interUserAut.getUserAut();
    }
    
    @PostMapping ("/userAut/crear")
    public String createStudent(@RequestBody UserAut userAut){
        interUserAut.saveUserAut(userAut);
        //devuelve un string avisando si creo correctamente
        return "La userAutna fue creada correctamente";
    }
    
    @DeleteMapping ("/userAut/borrar/{id}")
    public String deleteUserAut (@PathVariable Long id){
        interUserAut.deleteUserAut(id);
        //devuelve un string avisando si elimino correctamente
        return "La userAut fue eliminada correctamente";
    }
    
    @PutMapping ("/userAut/editar/{id}")
    public UserAut editUserAut (@PathVariable Long id,
                                @RequestParam ("email") String nuevoEmail,
                                @RequestParam ("password") String nuevoPassword,
                                @RequestParam ("rol") String nuevoRol) {
        //busco la userAutna en cuestion
        UserAut userAut = interUserAut.findUserAut(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        userAut.setEmail(nuevoEmail);
        userAut.setPassword(nuevoPassword);
        userAut.setRol(nuevoRol);

        interUserAut.saveUserAut(userAut);
        //retorna la nueva userAutna
        return userAut;
    }
}
