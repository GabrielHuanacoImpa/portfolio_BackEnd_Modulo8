/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import com.mipagina.apiporfolio.Model.Proyecto;
import com.mipagina.apiporfolio.service.IProyectoService;
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
public class ProyectoController {
        @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping ("/proyecto/traer")
    public List<Proyecto> getProyecto() {
        return interProyecto.getProyecto();
    }
    
        @PostMapping ("/proyecto/crear")
    public String createStudent(@RequestBody Proyecto pro){
        interProyecto.saveProyecto(pro);
        //devuelve un string avisando si creo correctamente
        return "La Proyecto fue creada correctamente";
    }
    
    @DeleteMapping ("/proyecto/borrar/{id}")
    public String deleteProyecto (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        //devuelve un string avisando si elimino correctamente
        return "La Proyecto fue eliminada correctamente";
    }
    
    @PutMapping ("/proyecto/editar/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                @RequestParam ("nombre_proyecto") String nuevoNombre_proyecto,
                                @RequestParam ("fecha_inicio") Date nuevoFecha_inicio,
                                @RequestParam ("fecha_fin") Date nuevoFecha_fin,
                                @RequestParam ("descripcion") String nuevoDescripcion,
                                @RequestParam ("link") String nuevoLlink,
                                @RequestParam ("url_imagenes") String nuevoUrl_imagenes,
                                @RequestParam ("domicilio") String nuevoDomicilio,

                                @RequestParam ("tipo_ocupacion") String nuevoTipo_ocupacion,
                                @RequestParam ("ultima_actualizacion") Date nuevoUltima_actualizacion,
                                @RequestParam ("url_image_logo") String nuevoUrl_image_logo,
                                @RequestParam ("reminder") int nuevoReminder,
                                @RequestParam ("persona_id") int nuevoPersona_id) {
        //busco la Proyecto en cuestion
        Proyecto pro = interProyecto.findProyecto(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        pro.setNombre_proyecto(nuevoNombre_proyecto);
        pro.setFecha_inicio(nuevoFecha_inicio);
        pro.setFecha_fin(nuevoFecha_fin);
        pro.setDescripcion(nuevoDescripcion);
        pro.setLink(nuevoLlink);
        pro.setUrl_imagenes(nuevoUrl_imagenes);

        pro.setDomicilio(nuevoDomicilio);
        pro.setTipo_ocupacion(nuevoTipo_ocupacion);
        
        pro.setUltima_actualizacion(nuevoUltima_actualizacion);
        pro.setUrl_image_logo(nuevoUrl_image_logo);
        pro.setReminder(nuevoReminder);
        pro.setPersona_id(nuevoPersona_id);
        
        interProyecto.saveProyecto(pro);
        //retorna la nueva Proyecto
        return pro;
    }
    
        
}
