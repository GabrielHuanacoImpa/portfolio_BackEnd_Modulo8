/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipagina.apiporfolio.Repository;

import com.mipagina.apiporfolio.Model.Hardskills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GHI
 */

@Repository //mapeamos como registro
//la interface extiende de JpaRepository (que maneja repositorios JPA)
//en los parametros <> deben ir <clase a persistir, tiupo de dato de su ID>
public interface IHardskillsRepository extends JpaRepository<Hardskills, Long>  {
    
}
