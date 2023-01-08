package com.practice2.service;

import com.practice2.exceptions.ProductException;
import com.practice2.model.Product;

import java.util.List;

public interface ProductService {
    public boolean addProduct(Product product) throws ProductException;

    public List<Product> getAllProducts();

    public Product getProductById(int productId) throws ProductException;
    public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException;
}
