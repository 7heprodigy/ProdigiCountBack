/**
 * 
 */
package com.com.theprodigy.prodigicount.entity;

import java.util.Date;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @ 7heprodigy
 * @version 1.0 06/26/2023
 * Clase que reprensenta las entidades de producto.
 */
@Data
@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private long idProducto;
	
	@Column(name = "tipo_producto")
	private String tipoProducto;
	
	@Column(name = "cantidad_producto")
	private String cantidadProducto;
	
	@Column(name = "precio_producto")
	private Double precioProducto;
	
	@Column(name = "tamano_producto")
	private String tamanoProducto;
	
	@Column(name = "marca_producto")
	private String marcaProducto;
	
	@Column(name = "vencimiento_producto")
	private Date vencimientoProducto;
	
	@Column(name = "costo_producto")
	private Double costoProducto;
	
	@Column(name = "proveedor_producto")
	private Integer proveedorProducto;
	
	@Column(name = "categoria_producto")
	private Integer categoriaProducto;
	
	
}
