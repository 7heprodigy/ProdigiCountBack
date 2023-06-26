/**
 * 
 */
package com.com.theprodigy.prodigicount.service;

import java.util.List;

import com.com.theprodigy.prodigicount.entity.Producto;

/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Intreface que contiene los metodos de logica de negocio para los productos.
 */
public interface ProductosServices {

	/**
	 * Metodo que permite consultar un listado de productos.
	 * @return listado de productos.
	 */
	List<Producto> consultarProductos();
	

}
