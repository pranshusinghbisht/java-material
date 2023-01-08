package com.practice2.dao;

import com.practice2.model.Product;

import java.util.List;

public interface ProductRepoDao {
    public boolean insertProductDetails(Product product);
     public List<Product> getAllProductDetails();
 public Product findProduct(int productId);
 public List<Product>  getProductInPriceRange(int fromPrice, int toPrice);
}
