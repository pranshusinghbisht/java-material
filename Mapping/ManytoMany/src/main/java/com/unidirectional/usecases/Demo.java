package com.unidirectional.usecases;

import com.unidirectional.models.Cateogry;
import com.unidirectional.models.Product;
import com.unidirectional.utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Product product1 = new Product();
        product1.setpId("pId1");
        product1.setProductName("I phone 14 max pro");

        Product product2 = new Product();
        product2.setpId("pId2");
        product2.setProductName("Samsung s22 ultra");

        Product product3 = new Product();
        product3.setpId("pId3");
        product3.setProductName("Micromax Tv");

        Cateogry cateogry1 = new Cateogry();
        cateogry1.setcId("cid1");
        cateogry1.setTitle("Electronics");

        Cateogry cateogry2 = new Cateogry();
        cateogry2.setcId("cid2");
        cateogry2.setTitle("Mobile Phones");

        List<Product> cateogry1ProductList = cateogry1.getProductList();
        cateogry1ProductList.add(product1);
        cateogry1ProductList.add(product2);
        cateogry1ProductList.add(product3);

        List<Product> cateogry2ProductList = cateogry2.getProductList();
        cateogry2ProductList.add(product1);
        cateogry2ProductList.add(product2);

/*
        cateogry1.getProductList().add(product1);
        cateogry1.getProductList().add(product2);
        cateogry1.getProductList().add(product3);

        cateogry2.getProductList().add(product1);
        cateogry2.getProductList().add(product2);
*/

        em.getTransaction().begin();
        em.persist(cateogry1);
        em.persist(cateogry2);
        em.getTransaction().commit();
//        System.out.println(cateogry1.getProductList().size());
        System.out.println("done...");
        em.close();

    }

    }
