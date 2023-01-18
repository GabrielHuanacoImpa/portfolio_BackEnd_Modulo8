/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipagina.apiporfolio.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import java.sql.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author GHI
 */

@Getter @Setter
@Entity
public class Hardskills {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String habilidadH;
    private int nivelH;
    private int persona_id;
    
}
