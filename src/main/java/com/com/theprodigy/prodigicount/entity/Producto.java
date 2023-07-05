/**
 * 
 */
package com.com.theprodigy.prodigicount.entity;

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
	
	@Column(name = "tipo_producto")
	private String tipoProducto;
	
	@Column(name = "cantidad_producto")
	private String cantidadProducto;
	
	@Column(name = "precio_producto")
	private Integer precioProducto;
	
	@Column(name = "tamano_producto")
	private String tamanoProducto;
	
	@Column(name = "marca_producto")
	private String marcaProducto;
	
	@Column(name = "vencimiento_producto")
	private String vencimientoProducto;
	
	@Column(name = "costo_producto")
	private String costoProducto;
	
	@Column(name = "proveedor_productos")
	private Integer proveedorProductos;
	
	@Column(name = "categoria_producto")
	private Integer categoriaProducto;

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(String cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Integer getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getTamanoProducto() {
		return tamanoProducto;
	}

	public void setTamanoProducto(String tamanoProducto) {
		this.tamanoProducto = tamanoProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public String getVencimientoProducto() {
		return vencimientoProducto;
	}

	public void setVencimientoProducto(String vencimientoProducto) {
		this.vencimientoProducto = vencimientoProducto;
	}

	public String getCostoProducto() {
		return costoProducto;
	}

	public void setCostoProducto(String costoProducto) {
		this.costoProducto = costoProducto;
	}

	public Integer getProveedorProductos() {
		return proveedorProductos;
	}

	public void setProveedorProductos(Integer proveedorProductos) {
		this.proveedorProductos = proveedorProductos;
	}

	public Integer getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(Integer categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	@Override
	public String toString() {
		return "Producto [tipoProducto=" + tipoProducto + ", cantidadProducto=" + cantidadProducto + ", precioProducto="
				+ precioProducto + ", tamanoProducto=" + tamanoProducto + ", marcaProducto=" + marcaProducto
				+ ", vencimientoProducto=" + vencimientoProducto + ", costoProducto=" + costoProducto
				+ ", proveedorProductos=" + proveedorProductos + ", categoriaProducto=" + categoriaProducto
				+ ", getTipoProducto()=" + getTipoProducto() + ", getCantidadProducto()=" + getCantidadProducto()
				+ ", getPrecioProducto()=" + getPrecioProducto() + ", getTamanoProducto()=" + getTamanoProducto()
				+ ", getMarcaProducto()=" + getMarcaProducto() + ", getVencimientoProducto()="
				+ getVencimientoProducto() + ", getCostoProducto()=" + getCostoProducto() + ", getProveedorProductos()="
				+ getProveedorProductos() + ", getCategoriaProducto()=" + getCategoriaProducto() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
}
