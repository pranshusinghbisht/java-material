package com.practice2.dao;

import com.practice2.model.Product;
import com.practice2.utility.EMUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductRepoImpl implements ProductRepoDao{
    public boolean insertProductDetails(Product product) {
        boolean x = false;
      EntityManager em = EMUtil.provideEntityManager();

      em.getTransaction().begin();
      em.persist(product);
      x = true;
      em.getTransaction().commit();
      em.close();
        return x;
    }

    public List<Product> getAllProductDetails() {
        EntityManager em = EMUtil.provideEntityManager();
        List<Product> products = null;

        Query q = em.createQuery("select p from Product p");

        products = q.getResultList();

        em.close();
        return products;
    }

    public Product findProduct(int productId) {
        EntityManager em = EMUtil.provideEntityManager();
        return EMUtil.provideEntityManager().find(Product.class,productId);
    }

    public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select p from Product p where p.price>:f and p.price<:t";
        Query q = em.createQuery(jpql);
        q.setParameter("f",fromPrice);
        q.setParameter("t",toPrice);

        List<Product> productList = q.getResultList();
        return productList;
    }
}
