package com.platzi.marketplatzi.persistence;

import com.platzi.marketplatzi.persistence.crud.ProductoCrudRepository;
import com.platzi.marketplatzi.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
