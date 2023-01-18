/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import static com.mipagina.apiporfolio.ApiporfolioApplication.URL_FROND_END;
import com.mipagina.apiporfolio.Model.Hardskills;
import com.mipagina.apiporfolio.service.IHardskillsService;
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
public class HardskillsController {
 
    @Autowired
    private IHardskillsService interHardskills;
    
    @GetMapping ("/hardskills/traer")
    public List<Hardskills> getHardskills() {
        return interHardskills.getHardskills();
    }
    
        @PostMapping ("/hardskills/crear")
    public Hardskills createStudent(@RequestBody Hardskills hard){
        interHardskills.saveHardskills(hard);
        //devuelve un string avisando si creo correctamente
        //return "La Hardskills fue creada correctamente"
        return hard;
    }
    
    @DeleteMapping ("/hardskills/borrar/{id}")
    public Long deleteHardskills (@PathVariable Long id){
        interHardskills.deleteHardskills(id);
        //devuelve un string avisando si elimino correctamente
        //return "La Hardskills fue eliminada correctamente";
        return id;
    }
    
    @PutMapping ("/hardskills/editar/{id}")
    public Hardskills editHardskills (@PathVariable Long id,@RequestBody Hardskills dato) {
        //busco la Hardskills en cuestion
        Hardskills hard = interHardskills.findHardskills(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        hard.setHabilidadH(dato.getHabilidadH());
        hard.setNivelH(dato.getNivelH());
        hard.setPersona_id(dato.getPersona_id());
        
        interHardskills.saveHardskills(hard);
        //retorna la nueva Hardskills
        return hard;
    }
    
    
}
