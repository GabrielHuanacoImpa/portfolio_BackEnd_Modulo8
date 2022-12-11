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
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    private String nombre_empresa;
    private int es_trabajo_actual;
    private String descripcion;
    private String tipo;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String lugar;
    private Date fecha_ultima_actualizacion;
    private String image_logo;
    private int reminder;
    private int persona_id;
}
