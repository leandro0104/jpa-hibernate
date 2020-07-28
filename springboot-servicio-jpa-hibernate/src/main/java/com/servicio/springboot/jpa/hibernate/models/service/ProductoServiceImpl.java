package com.servicio.springboot.jpa.hibernate.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servicio.springboot.jpa.hibernate.models.entity.Producto;
import com.servicio.springboot.jpa.hibernate.models.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public List<Producto> findByPrecio(Integer precio) {
		return (List<Producto>) productoRepository.findByPrecio(precio);
	}

	@Override
	public List<Producto> findByNombreAndPrecio(String nombre, Integer precio) {
		return (List<Producto>) productoRepository.findByNombreAndPrecio(nombre, precio);
	}

	


	
}
