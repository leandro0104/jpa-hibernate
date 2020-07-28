package com.servicio.springboot.jpa.hibernate.models.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.servicio.springboot.jpa.hibernate.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

 List<Producto> findByPrecio(Integer precio);
 List<Producto> findByNombreAndPrecio(String nombre, Integer precio);
	
}
