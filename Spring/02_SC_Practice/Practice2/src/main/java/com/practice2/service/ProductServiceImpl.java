package com.practice2.service;

import com.practice2.dao.ProductRepoDao;
import com.practice2.exceptions.ProductException;
import com.practice2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepoDao repoDao;

    public boolean addProduct(Product product) {

       return repoDao.insertProductDetails(product);

    }

    public List<Product> getAllProducts() {
        return repoDao.getAllProductDetails();
    }

    public Product getProductById(int productId) throws ProductException {

        Product product = repoDao.findProduct(productId);
        if(product == null){
            throw new ProductException("Product not found...");
        }else{
            return product;
        }

    }

    public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {

        List<Product> list= repoDao.getProductInPriceRange(fromPrice,toPrice);
        if(list.isEmpty()){
            throw new ProductException("Product not found...");
        }else{
            return list;
        }

    }
}
