package com.tpa.persistence.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	
    @Column(name = "nombre_articulo")
    private String nombreArticulo;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Categoria categoria;
    
    @Override
	public String toString() {
		return "Articulo [id=" + id + ", nombreArticulo=" + nombreArticulo + ", categoria=" + categoria + "]";
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
    
    
}
