/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import static com.mipagina.apiporfolio.ApiporfolioApplication.URL_FROND_END;
import com.mipagina.apiporfolio.Model.Idioma;
import com.mipagina.apiporfolio.service.IIdiomaService;
//import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = URL_FROND_END)
@RestController
public class IdiomaController {
     
    @Autowired
    private IIdiomaService interIdioma;
    
    @GetMapping ("/idioma/traer")
    public List<Idioma> getIdioma() {
        return interIdioma.getIdioma();
    }
    
        @PostMapping ("/idioma/crear")
    public Idioma createStudent(@RequestBody Idioma idio){
        interIdioma.saveIdioma(idio);
        //devuelve un string avisando si creo correctamente
        //return "La Idioma fue creada correctamente";
        return idio;
    }
    
    @DeleteMapping ("/idioma/borrar/{id}")
    public Long deleteIdioma (@PathVariable Long id){
        interIdioma.deleteIdioma(id);
        //devuelve un string avisando si elimino correctamente
        //return "La Idioma fue eliminada correctamente";
        return id;
    }

    @PutMapping ("/idioma/editar/{id}")
    public Idioma editIdioma (@PathVariable Long id, @RequestBody Idioma dato){
        Idioma idio = interIdioma.findIdioma(id);
        
        //idio.setId(dato.getId());
        idio.setHabilidadI(dato.getHabilidadI());
        idio.setNivelI(dato.getNivelI());
        idio.setPersona_id(dato.getPersona_id());
        
        interIdioma.saveIdioma(idio);
        return idio;
    }
}
