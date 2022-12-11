/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Controller;

import com.mipagina.apiporfolio.Model.Persona;
import com.mipagina.apiporfolio.service.IPersonaService;
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
public class PersonaController {
        @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas() {
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        //devuelve un string avisando si creo correctamente
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
        //devuelve un string avisando si elimino correctamente
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("domicilio") String nuevoDomicilio,
                                @RequestParam ("fechaNac") Date nuevoFechaNac,
                                @RequestParam ("telefono") String nuevoTelefono,
                                @RequestParam ("correo") String nuevoCorreo,
                                @RequestParam ("sobre_mi") String nuevoSobre_mi,
                                @RequestParam ("url_foto") String nuevoUrl_foto,
                                @RequestParam ("url_foto_fondo") String nuevoUrl_foto_fondo,
                                @RequestParam ("ocupacion") String nuevoOcupacion,
                                @RequestParam ("nacionalidad") String nuevoNacionalidad) {
        //busco la persona en cuestion
        Persona perso = interPersona.findPersona(id);
        
        //esto puede ir en service
        // para desacoplar mejor aun el codigo en un nuevo metodo
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setDomicilio(nuevoDomicilio);
        perso.setFechaNac(nuevoFechaNac);
        perso.setTelefono(nuevoTelefono);
        perso.setCorreo(nuevoCorreo);
        perso.setSobre_mi(nuevoSobre_mi);
        perso.setUrl_foto(nuevoUrl_foto);
        perso.setUrl_foto_fondo(nuevoUrl_foto_fondo);
        perso.setOcupacion(nuevoOcupacion);
        perso.setNacionalidad(nuevoNacionalidad);
        
        
        interPersona.savePersona(perso);
        //retorna la nueva persona
        return perso;
    }
}
