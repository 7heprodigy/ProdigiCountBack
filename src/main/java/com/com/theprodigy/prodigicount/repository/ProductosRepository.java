/**
 * 
 */
package com.com.theprodigy.prodigicount.repository;


import org.springframework.data.repository.CrudRepository;

import com.com.theprodigy.prodigicount.entity.Producto;

/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Interface que contiene el CRUD con jpa para la tabla productos.
 */
public interface ProductosRepository extends CrudRepository<Producto, Long> {

}
