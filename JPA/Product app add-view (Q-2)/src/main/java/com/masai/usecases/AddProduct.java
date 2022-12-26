package com.masai.usecases;

import com.masai.model.Product;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class AddProduct {
    public static void main(String[] args) {
       EntityManager em = EMUtil.provideEntityManager();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Poduct Name : ");
        String name = sc.next();

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price : ");
        int price = sc.nextInt();

        Product product = new Product();
        product.setProductName(name);
        product.setQuantity(quantity);
        product.setPrice(price);



        em.getTransaction().begin();

        em.persist(product);

        em.getTransaction().commit();

        System.out.println("Insert Product Successfull : ");

        em.close();


    }
}
