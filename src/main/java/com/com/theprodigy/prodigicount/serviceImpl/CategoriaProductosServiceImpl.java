/**
 * 
 */
package com.com.theprodigy.prodigicount.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.theprodigy.prodigicount.entity.CategoriaProducto;
import com.com.theprodigy.prodigicount.repository.CategoriaProducRepository;
import com.com.theprodigy.prodigicount.service.CategoriasProducService;

import jakarta.persistence.Id;



/**
 * @ 7heprodigy
 * @version 1.0 06/28/2023
 * Clase que implementa los metodos de logica del negocio de la interface de ProductosService.
 */

@Service
public class CategoriaProductosServiceImpl implements CategoriasProducService {

	 /**
     * Bean Repository de spring inyectado para ejecutar el CRUD.
     */
    
	@Autowired
	private CategoriaProducRepository categoriaProducRepository;
	
	@Override
	public List<CategoriaProducto> consultarCategorias() {
		
		List<CategoriaProducto> categoriaDataSource = StreamSupport.stream(
				this.categoriaProducRepository.findAll().spliterator(), false).collect(Collectors.toList());
		return categoriaDataSource;
	}

	@Override
	public Optional<CategoriaProducto> consultarCategoriasPorId(Integer idCategoriaProducto) {
		System.out.println("Encontro la categoria" + idCategoriaProducto);
		Optional<CategoriaProducto> categoriaProducto = this.categoriaProducRepository.findById(idCategoriaProducto);
		System.out.println("Encontro la categoria");
		return categoriaProducto;
	}
	
}
