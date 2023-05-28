package com.platzi.marketplatzi.persistence.crud;

import com.platzi.marketplatzi.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
