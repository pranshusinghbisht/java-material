package com.masai.usecases;

import com.masai.model.Product;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class SearchProductById {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id to search : ");
        int id = sc.nextInt();

        Product product = em.find(Product.class,id);

        System.out.println(product.toString());

        em.close();

    }
}
