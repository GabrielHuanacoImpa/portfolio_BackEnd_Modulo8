/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import static com.mipagina.apiporfolio.ApiporfolioApplication.URL_FROND_END;
import com.mipagina.apiporfolio.Model.Educacion;
import com.mipagina.apiporfolio.service.IEducacionService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author GHI
 */
@CrossOrigin(origins = URL_FROND_END)

//@CrossOrigin(maxAge = 3600)
//@RequestMapping("educacion")
@RestController
public class EducacionController {
      @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping ("/educacion/traer")
     // @GetMapping ("traer")
    public List<Educacion> getEducacion() {
        return interEducacion.getEducacion();
    }
    //@CrossOrigin(origins = URL_FROND_END)
    //@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requestor-Type")
        @PostMapping ("/educacion/crear")
    //@PostMapping ("crear")
    public Educacion createStudent(@RequestBody Educacion edu){
        interEducacion.saveEducacion(edu);
        //devuelve un string avisando si creo correctamente
        //return "La Educacion fue creada correctamente";
        return edu;
    }
    /*
    @DeleteMapping ("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        //devuelve un string avisando si elimino correctamente
        return "La Educacion fue eliminada correctamente";
    }
*/
        @DeleteMapping ("/educacion/borrar/{id}")
    public Long deleteEducacion (@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        //devuelve un string avisando si elimino correctamente
        return id;
    }
    
   
    /*
    public Educacion editEducacion (@PathVariable Long id,
                                @RequestParam ("institucion") String nuevoInstitucion,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("domicilio") String nuevoDomicilio,
                                @RequestParam ("fecha_inicio") Date nuevoFechaInicio,
                                @RequestParam ("fecha_fin") Date nuevoFechaFin,
                                @RequestParam ("image_institucion") String nuevoImage_institucion,
                                @RequestParam ("ultima_actualizacion") Date nuevoUltima_actualizacion,
                                @RequestParam ("reminder") int nuevoReminder,
                                @RequestParam ("persona_id") int nuevoPersona_id) {
        //busco la Educacion en cuestion
        Educacion edu = interEducacion.findEducacion(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        edu.setInstitucion(nuevoInstitucion);
        edu.setTitulo(nuevoTitulo);
        edu.setDomicilio(nuevoDomicilio);
        edu.setFecha_inicio(nuevoFechaInicio);
        edu.setFecha_fin(nuevoFechaFin);
        edu.setImage_institucion(nuevoImage_institucion);
        edu.setUltima_actualizacion(nuevoUltima_actualizacion);
        edu.setReminder(nuevoReminder);
        edu.setPersona_id(nuevoPersona_id);
        
        interEducacion.saveEducacion(edu);
        //retorna la nueva Educacion
        return edu;
    }
*/
@PutMapping ("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id, @RequestBody Educacion dato){
        
      Educacion edu = interEducacion.findEducacion(id);
        edu.setInstitucion(dato.getInstitucion());

        edu.setTitulo(dato.getTitulo());
        edu.setDomicilio(dato.getDomicilio());

        edu.setFecha_inicio(dato.getFecha_inicio());
        edu.setFecha_fin(dato.getFecha_fin());

        edu.setImage_institucion(dato.getImage_institucion());
        edu.setUltima_actualizacion(dato.getUltima_actualizacion());
        edu.setReminder(dato.getReminder());
        edu.setPersona_id(dato.getPersona_id());
        
        interEducacion.saveEducacion(edu);
        
        return edu;
    }
        
}
