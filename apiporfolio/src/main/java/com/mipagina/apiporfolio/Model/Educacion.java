/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author GHI
 */

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
        
    private String institucion;
    private String titulo;
    private String domicilio;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String image_institucion;
    private Date ultima_actualizacion;
    private int reminder;
    private int persona_id;           
}
