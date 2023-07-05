/**
 * 
 */
package com.com.theprodigy.prodigicount.service;

import java.util.List;
import java.util.Optional;

import com.com.theprodigy.prodigicount.entity.CategoriaProducto;

import jakarta.persistence.Id;


/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Intreface que contiene los metodos de logica de negocio para las categorias de los productos.
 */
public interface CategoriasProducService {

	/**
	 * Metodo que permite consultar un listado de productos.
	 * @return listado de categorias del producto.
	 */
	List<CategoriaProducto> consultarCategorias();
	
	Optional<CategoriaProducto> consultarCategoriasPorId(Integer idCategoriaProducto);
	
}
