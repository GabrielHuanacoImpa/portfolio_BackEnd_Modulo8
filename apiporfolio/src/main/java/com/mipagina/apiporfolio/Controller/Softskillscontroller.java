/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import static com.mipagina.apiporfolio.ApiporfolioApplication.URL_FROND_END;
import com.mipagina.apiporfolio.Model.Softskills;
import com.mipagina.apiporfolio.service.ISoftskillsService;
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
public class Softskillscontroller {
    
    @Autowired
    private ISoftskillsService interSoftskills;
    
    @GetMapping ("/softskills/traer")
    public List<Softskills> getSoftskills() {
        return interSoftskills.getSoftskills();
    }
    
        @PostMapping ("/softskills/crear")
    public Softskills createStudent(@RequestBody Softskills soft){
        interSoftskills.saveSoftskills(soft);
        //devuelve un string avisando si creo correctamente
        //return "La Softskills fue creada correctamente";
        return soft;
    }
    
    @DeleteMapping ("/softskills/borrar/{id}")
    public Long deleteSoftskills (@PathVariable Long id){
        interSoftskills.deleteSoftskills(id);
        //devuelve un string avisando si elimino correctamente
        //return "La Softskills fue eliminada correctamente";
        return id;
    }
    
    @PutMapping ("/softskills/editar/{id}")
    public Softskills editSoftskills (@PathVariable Long id,@RequestBody Softskills dato) {
        //busco la Softskills en cuestion
        Softskills soft = interSoftskills.findSoftskills(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        //soft.setId(dato.getId());
        soft.setHabilidad(dato.getHabilidad());
        soft.setNivel(dato.getNivel());
        soft.setPersona_id(dato.getPersona_id());
        
        interSoftskills.saveSoftskills(soft);
        //retorna la nueva Softskills
        return soft;
    }
    
}
