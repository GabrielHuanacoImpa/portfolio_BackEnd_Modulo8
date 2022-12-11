/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Model;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author GHI
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    //@Column
    private String nombre;
    //@Column
    private String apellido;
    //@Column
    private String domicilio;
    //@Column
    //@JsonFormat(pattern = "yyyy-MM-dd" )
    //@Column (name = "fechaNac", updatable = false, nullable = false)
    //@Temporal(TemporalType.DATE)
    private Date fechaNac;
    //@Column
    private String telefono;
    //@Column
    private String correo;
    //@Column
    private String sobre_mi;
    //@Column
    private String url_foto;
    //@Column
    private String url_foto_fondo;
    //@Column
    private String ocupacion;
    //@Column
    private String nacionalidad;
}
