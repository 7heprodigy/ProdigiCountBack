/**
 * 
 */
package com.com.theprodigy.prodigicount.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.com.theprodigy.prodigicount.entity.Producto;
import com.com.theprodigy.prodigicount.service.ProductosServices;

/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Controllador que manipula el flujo de los servicios rest del microservicio de productos
 */

@RestController
@RequestMapping("/productos")
public class ProductosController {

	private ProductosServices productosServicesImpl;
	
	@GetMapping
	@RequestMapping(value = "consultarProductos", method = RequestMethod.GET)
	public ResponseEntity<?> consultarProductos(){
		
		List<Producto> productosConsultados = this.productosServicesImpl.consultarProductos();
		
		return ResponseEntity.ok(productosConsultados);
	}
}
