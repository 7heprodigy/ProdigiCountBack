/**
 * 
 */
package com.com.theprodigy.prodigicount.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.com.theprodigy.prodigicount.entity.CategoriaProducto;
import com.com.theprodigy.prodigicount.service.CategoriasProducService;

import jakarta.persistence.Id;


/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Controllador que manipula el flujo de los servicios rest del microservicio de categoria
 */

@RestController
@RequestMapping("/categoriaProductos")
public class CategoriaController {

	@Autowired
	private CategoriasProducService categoriasProducServiceImpl;
	
	@GetMapping
	@RequestMapping(value = "consultarCategorias", method = RequestMethod.GET)
	public ResponseEntity<?> consultarCategorias(){
		
		List<CategoriaProducto> categoriasConsultados = this.categoriasProducServiceImpl.consultarCategorias();
		 System.out.println(categoriasConsultados);
		return ResponseEntity.ok(categoriasConsultados);
	}
	
	
	
	@GetMapping
	@RequestMapping(value = "consultarCategoriasPorId/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> consultarCategoriasPorId(@PathVariable("id")Integer idCategoriaProducto){
		

		Optional<CategoriaProducto> categoriasConsultadasPorId = this.categoriasProducServiceImpl.consultarCategoriasPorId(idCategoriaProducto);
		
		 System.out.println("Mi categoria " + categoriasConsultadasPorId);
		 
		return ResponseEntity.ok(categoriasConsultadasPorId);
	}
}
