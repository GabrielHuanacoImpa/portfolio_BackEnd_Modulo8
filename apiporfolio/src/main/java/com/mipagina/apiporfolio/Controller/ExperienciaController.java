/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import static com.mipagina.apiporfolio.ApiporfolioApplication.URL_FROND_END;
import com.mipagina.apiporfolio.Model.Experiencia;
import com.mipagina.apiporfolio.service.IExperienciaService;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author GHI
 */
@CrossOrigin(origins = URL_FROND_END)

@RestController
public class ExperienciaController {
      @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping ("/experiencia/traer")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }
    
    @PostMapping ("/experiencia/crear")
    //@PostMapping ("crear")
    public Experiencia createStudent(@RequestBody Experiencia exp){
        interExperiencia.saveExperiencia(exp);
        //devuelve un string avisando si creo correctamente
        //return "La Experiencia fue creada correctamente";
        return exp;
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public Long deleteExperiencia (@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        //devuelve un string avisando si elimino correctamente
        //return "La Experiencia fue eliminada correctamente";
        return id;
    }
   
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id, @RequestBody Experiencia dato){
        
      Experiencia exp = interExperiencia.findExperiencia(id);
        exp.setNombre_empresa(dato.getNombre_empresa());
        exp.setEs_trabajo_actual(dato.getEs_trabajo_actual());
        exp.setDescripcion(dato.getDescripcion());
        exp.setTipo(dato.getTipo());
        exp.setFecha_inicio(dato.getFecha_inicio());
        exp.setFecha_fin(dato.getFecha_fin());
        exp.setLugar(dato.getLugar());
        exp.setFecha_ultima_actualizacion(dato.getFecha_ultima_actualizacion());
        exp.setImage_logo(dato.getImage_logo());
        exp.setReminder(dato.getReminder());
        exp.setPersona_id(dato.getPersona_id());

        interExperiencia.saveExperiencia(exp);
        
        return exp;
    }
      
}
