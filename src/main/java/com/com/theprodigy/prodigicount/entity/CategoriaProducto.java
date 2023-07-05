/**
 * 
 */
package com.com.theprodigy.prodigicount.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @ 7heprodigy
 * @version 1.0 06/28/2023
 * Clase que reprensenta la tabla categorias producto.
 */
@Data
@Entity
@Table(name = "categoria_producto")
public class CategoriaProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "categoria_id")
	private Integer categoriaId;
	
	@Column(name = "categoria_nombre")
	private String categoriaNombre;
	
	@Column(name = "categoria_descripcion")
	private String categoriaDescripcion;
	
	

	public Integer getCategoriaId() {
		return categoriaId;
	}

	
	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}


	public String getCategoriaNombre() {
		return categoriaNombre;
	}


	public void setCategoriaNombre(String categoriaNombre) {
		this.categoriaNombre = categoriaNombre;
	}


	public String getCategoriaDescripcion() {
		return categoriaDescripcion;
	}


	public void setCategoriaDescripcion(String categoriaDescripcion) {
		this.categoriaDescripcion = categoriaDescripcion;
	}

	@Override
	public String toString() {
		return "CategoriaProducto [categoriaId=" + categoriaId + ", categoriaNombre=" + categoriaNombre
				+ ", categoriaDescripcion=" + categoriaDescripcion + ", getCategoriaId()=" + getCategoriaId()
				+ ", getCategoriaNombre()=" + getCategoriaNombre() + ", getCategoriaDescripcion()="
				+ getCategoriaDescripcion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
