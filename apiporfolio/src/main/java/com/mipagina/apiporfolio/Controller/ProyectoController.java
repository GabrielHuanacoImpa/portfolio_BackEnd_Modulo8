/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import static com.mipagina.apiporfolio.ApiporfolioApplication.URL_FROND_END;
import com.mipagina.apiporfolio.Model.Proyecto;
import com.mipagina.apiporfolio.service.IProyectoService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author GHI
 */
@CrossOrigin(origins = URL_FROND_END)

@RestController
public class ProyectoController {
        @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping ("/proyecto/traer")
    public List<Proyecto> getProyecto() {
        return interProyecto.getProyecto();
    }
    
        @PostMapping ("/proyecto/crear")
    public Proyecto createStudent(@RequestBody Proyecto pro){
        interProyecto.saveProyecto(pro);
        //devuelve un string avisando si creo correctamente
        //return "La Proyecto fue creada correctamente";
        return pro;
    }
    
    @DeleteMapping ("/proyecto/borrar/{id}")
    public Long deleteProyecto (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        //devuelve un string avisando si elimino correctamente
        //return "La Proyecto fue eliminada correctamente";
        return id;
    }

    @PutMapping ("/proyecto/editar/{id}")
    public Proyecto editProyecto (@PathVariable Long id, @RequestBody Proyecto dato){
        Proyecto pro = interProyecto.findProyecto(id);
        
        pro.setNombre_proyecto(dato.getNombre_proyecto());
        pro.setFecha_inicioP(dato.getFecha_inicioP());
        pro.setFecha_finP(dato.getFecha_finP());
        pro.setDescripcionP(dato.getDescripcionP());
        pro.setLink(dato.getLink());
        pro.setUrl_imagenes(dato.getUrl_imagenes());
        pro.setDomicilio(dato.getDomicilio());
        pro.setTipo_ocupacion(dato.getTipo_ocupacion());
        pro.setUltima_actualizacion(dato.getUltima_actualizacion());
        pro.setUrl_image_logo(dato.getUrl_image_logo());
        pro.setReminder(dato.getReminder());
        pro.setPersona_id(dato.getPersona_id());

        
        interProyecto.saveProyecto(pro);
        return pro;
    }
        
}
