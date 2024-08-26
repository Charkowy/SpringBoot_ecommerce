package com.charko.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.charko.demo.model.Product;


@Repository
public interface IProduct extends CrudRepository<Product, Integer>{

}
