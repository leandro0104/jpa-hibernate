package com.servicio.springboot.jpa.hibernate.models.service;

import java.util.List;

import com.servicio.springboot.jpa.hibernate.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	public List<Producto> findByPrecio(Integer precio);
	public List<Producto> findByNombreAndPrecio(String nombre, Integer precio);
}
