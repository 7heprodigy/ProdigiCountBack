/**
 * 
 */
package com.com.theprodigy.prodigicount.repository;

import org.springframework.data.repository.CrudRepository;

import com.com.theprodigy.prodigicount.entity.CategoriaProducto;

/**
 * @ 7heprodigy
 * @version 1.0 06/28/2023
 * Interface que contiene el CRUD con jpa para la tabla categoria producto.
 */
public interface CategoriaProducRepository extends CrudRepository<CategoriaProducto, Integer>{

}
