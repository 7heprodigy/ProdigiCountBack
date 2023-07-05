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

/**
 * @ 7heprodigy
 * @version 1.0 06/27/2023
 * Clase que reprensenta las entidades de proveedor producto.
 */


@Entity
@Table(name="provedor_producto")
public class ProveedorProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name = "proveedor_razon_social")
	private String proveedorRazonSocial;
	
	@Column (name = "proveedor_telefono")
	private String proveedorTelefono;
	
	@Column (name = "proveedor_direccion")
	private String proveedorDireccion;
	
	@Column (name = "proveedor_correo")
	private String proveedorCorreo;

	
	/**
	 * @return the proveedorRazonSocial
	 */
	public String getProveedorRazonSocial() {
		return proveedorRazonSocial;
	}

	/**
	 * @param proveedorRazonSocial the proveedorRazonSocial to set
	 */
	public void setProveedorRazonSocial(String proveedorRazonSocial) {
		this.proveedorRazonSocial = proveedorRazonSocial;
	}

	/**
	 * @return the proveedorTelefono
	 */
	public String getProveedorTelefono() {
		return proveedorTelefono;
	}

	/**
	 * @param proveedorTelefono the proveedorTelefono to set
	 */
	public void setProveedorTelefono(String proveedorTelefono) {
		this.proveedorTelefono = proveedorTelefono;
	}

	/**
	 * @return the proveedorDireccion
	 */
	public String getProveedorDireccion() {
		return proveedorDireccion;
	}

	/**
	 * @param proveedorDireccion the proveedorDireccion to set
	 */
	public void setProveedorDireccion(String proveedorDireccion) {
		this.proveedorDireccion = proveedorDireccion;
	}

	/**
	 * @return the proveedorCorreo
	 */
	public String getProveedorCorreo() {
		return proveedorCorreo;
	}

	/**
	 * @param proveedorCorreo the proveedorCorreo to set
	 */
	public void setProveedorCorreo(String proveedorCorreo) {
		this.proveedorCorreo = proveedorCorreo;
	}

	@Override
	public String toString() {
		return "ProveedorProducto [proveedorRazonSocial=" + proveedorRazonSocial + ", proveedorTelefono="
				+ proveedorTelefono + ", proveedorDireccion=" + proveedorDireccion + ", proveedorCorreo="
				+ proveedorCorreo + ", getProveedorRazonSocial()=" + getProveedorRazonSocial()
				+ ", getProveedorTelefono()=" + getProveedorTelefono() + ", getProveedorDireccion()="
				+ getProveedorDireccion() + ", getProveedorCorreo()=" + getProveedorCorreo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
