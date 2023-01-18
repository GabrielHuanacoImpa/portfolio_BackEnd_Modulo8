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
//import java.time.LocalDateTime;
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
 //   @NotNull(message = "no puede estar vacio")
//@Column(name="create_at")
//@Temporal(TemporalType.TIMESTAMP)
//@JsonFormat(shape = JsonFormat.Shape.STRING, locale = "es_PE", timezone = "America/Argentina")
   
   private Date fecha_inicio;
   // LocalDateTime fecha_inicio;
   // @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_fin;
    private String image_institucion;
  //  @Temporal(TemporalType.TIMESTAMP)
    private Date ultima_actualizacion;
    private int reminder;
    private int persona_id;  
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio.plusDays(1);
    }

    public void setFecha_inicio(LocalDateTime fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getImage_institucion() {
        return image_institucion;
    }

    public void setImage_institucion(String image_institucion) {
        this.image_institucion = image_institucion;
    }

    public Date getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(Date ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public int getReminder() {
        return reminder;
    }

    public void setReminder(int reminder) {
        this.reminder = reminder;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
    */
    
    
}
