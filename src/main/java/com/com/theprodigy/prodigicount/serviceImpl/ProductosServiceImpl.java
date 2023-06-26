/**
 * 
 */
package com.com.theprodigy.prodigicount.serviceImpl;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.theprodigy.prodigicount.entity.Producto;
import com.com.theprodigy.prodigicount.repository.ProductosRepository;
import com.com.theprodigy.prodigicount.service.ProductosServices;

/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Clase que implementa los metodos de logica del negocio de la interface de ProductosService.
 */
@Service
public class ProductosServiceImpl implements ProductosServices {

    /**
     * Bean Repository de spring inyectado para ejecutar el CRUD.
     */
    
	@Autowired
	private ProductosRepository productosRepository;
	
	@Override
	public List<Producto> consultarProductos() {
		
		List<Producto> productosDataSource = StreamSupport.stream(
				this.productosRepository.findAll().spliterator(), false).collect(Collectors.toList());
		return productosDataSource;
	}

}
