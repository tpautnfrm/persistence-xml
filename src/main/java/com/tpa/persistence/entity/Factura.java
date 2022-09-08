package com.tpa.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion = new Date();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	private List<DetalleFactura> detalle = new ArrayList<>();

	
	
	@Override
	public String toString() {
		return "Factura [id=" + id + ", fechaCreacion=" + fechaCreacion + ", detalle=" + detalle + "]";
	}

	public void addDetalle(DetalleFactura det) {
		this.detalle.add(det);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<DetalleFactura> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleFactura> detalle) {
		this.detalle = detalle;
	}

}
