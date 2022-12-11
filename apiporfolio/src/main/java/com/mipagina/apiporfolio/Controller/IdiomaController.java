/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import com.mipagina.apiporfolio.Model.Idioma;
import com.mipagina.apiporfolio.service.IIdiomaService;
//import java.sql.Date;
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
public class IdiomaController {
     
    @Autowired
    private IIdiomaService interIdioma;
    
    @GetMapping ("/idioma/traer")
    public List<Idioma> getIdioma() {
        return interIdioma.getIdioma();
    }
    
        @PostMapping ("/idioma/crear")
    public String createStudent(@RequestBody Idioma idio){
        interIdioma.saveIdioma(idio);
        //devuelve un string avisando si creo correctamente
        return "La Idioma fue creada correctamente";
    }
    
    @DeleteMapping ("/idioma/borrar/{id}")
    public String deleteIdioma (@PathVariable Long id){
        interIdioma.deleteIdioma(id);
        //devuelve un string avisando si elimino correctamente
        return "La Idioma fue eliminada correctamente";
    }
    
    @PutMapping ("/idioma/editar/{id}")
    public Idioma editIdioma (@PathVariable Long id,
                                @RequestParam ("habilidad") String nuevoHabilidad,
                                @RequestParam ("nivel") int nuevoNivel,
                                @RequestParam ("persona_id") int nuevoPersona_id) {
        //busco la Idioma en cuestion
        Idioma idio = interIdioma.findIdioma(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        idio.setHabilidad(nuevoHabilidad);
        idio.setNivel(nuevoNivel);
        idio.setPersona_id(nuevoPersona_id);
        
        interIdioma.saveIdioma(idio);
        //retorna la nueva Idioma
        return idio;
    }
    
    
}
