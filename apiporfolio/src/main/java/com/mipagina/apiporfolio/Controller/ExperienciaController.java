/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import com.mipagina.apiporfolio.Model.Experiencia;
import com.mipagina.apiporfolio.service.IExperienciaService;
import java.sql.Date;
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
public class ExperienciaController {
      @Autowired
    private IExperienciaService interExperiencia;
    
    @GetMapping ("/experiencia/traer")
    public List<Experiencia> getExperiencia() {
        return interExperiencia.getExperiencia();
    }
    
        @PostMapping ("/experiencia/crear")
    public String createStudent(@RequestBody Experiencia exp){
        interExperiencia.saveExperiencia(exp);
        //devuelve un string avisando si creo correctamente
        return "La Experiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        //devuelve un string avisando si elimino correctamente
        return "La Experiencia fue eliminada correctamente";
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editExperiencia (@PathVariable Long id,
                                @RequestParam ("nombre_empresa") String nuevoNombreEmpresa,
                                @RequestParam ("es_trabajo_actual") int nuevoEsTrabajoActual,
                                @RequestParam ("descripcion") String nuevoDescripcion,
                                @RequestParam ("tipo") String nuevoTipo,
                                @RequestParam ("fecha_inicio") Date nuevoFechaInicio,
                                @RequestParam ("fecha_fin") Date nuevoFechaFin,
                                @RequestParam ("lugar") String nuevoLugar,
                                @RequestParam ("fecha_ultima_actualizacion") Date nuevoFecha_ultima_actualizacion,
                                @RequestParam ("image_logo") String nuevoImage_logo,
                                @RequestParam ("reminder") int nuevoReminder,
                                @RequestParam ("persona_id") int nuevoPersona_id) {
        //busco la Experiencia en cuestion
        Experiencia exp = interExperiencia.findExperiencia(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        exp.setNombre_empresa(nuevoNombreEmpresa);
        exp.setEs_trabajo_actual(nuevoEsTrabajoActual);
        exp.setDescripcion(nuevoDescripcion);
        exp.setTipo(nuevoTipo);
        exp.setFecha_inicio(nuevoFechaInicio);
        exp.setFecha_fin(nuevoFechaFin);
        exp.setLugar(nuevoLugar);
        exp.setFecha_ultima_actualizacion(nuevoFecha_ultima_actualizacion);
        exp.setImage_logo(nuevoImage_logo);
        exp.setReminder(nuevoReminder);
        exp.setPersona_id(nuevoPersona_id);
        
        interExperiencia.saveExperiencia(exp);
        //retorna la nueva Experiencia
        return exp;
    }
    
      
}
