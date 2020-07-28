package com.servicio.springboot.jpa.hibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.springboot.jpa.hibernate.models.entity.Producto;
import com.servicio.springboot.jpa.hibernate.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	

	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	@GetMapping("/listar/byprecio/{precio}")
	public List<Producto> detallePrecio(@PathVariable Integer precio) {
		return productoService.findByPrecio(precio);
	}
	
	@GetMapping("/listar/bynombreyprecio")
	public List<Producto> detalleNombrePrecio(@RequestHeader String nombre, @RequestHeader Integer precio){
		return productoService.findByNombreAndPrecio(nombre, precio);
	}
}
