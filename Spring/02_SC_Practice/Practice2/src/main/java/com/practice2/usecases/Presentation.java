package com.practice2.usecases;

import com.practice2.configuration.AppConfig;
import com.practice2.exceptions.ProductException;
import com.practice2.model.Product;
import com.practice2.service.ProductService;
import com.practice2.utility.EMUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class Presentation {

    @Autowired
    private ProductService productService;

    public void insertProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name : ");
        String pName = sc.next();

        System.out.print("Enter Quantity : ");
        int pQuantity = sc.nextInt();

        System.out.print("Enter Price : ");
        int pPrice = sc.nextInt();

        Product product = new Product();
        product.setProductName(pName);
        product.setPrice(pPrice);
        product.setQuantity(pQuantity);

        Boolean res = null;
        try {

            res = productService.addProduct(product);
            if(res){
                System.out.println("Insert Successfully...");
            }else{
                System.out.println("Not inserted...");
            }

        } catch (ProductException e) {
            throw new RuntimeException(e);
        }


    }

    public void printAllProduct(){

      List<Product> list = productService.getAllProducts();
      list.forEach(product -> System.out.println(product));
    }

    public void searchProduct(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id to get Product : ");
        int pid = sc.nextInt();

        try {
           Product p = productService.getProductById(pid);
            System.out.println(p);
        } catch (ProductException e) {
            throw new RuntimeException(e);
        }

    }
    public void GetProductsWithingPriceRange(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Get Product within Range : ");
        System.out.print("From Price : ");
        int fromPrice = sc.nextInt();

        System.out.print("To Price : ");
        int toPrice = sc.nextInt();
        List<Product> list = null;
        try {
          list =  productService.getProductsBetweenPrice(fromPrice,toPrice);
            list.forEach(product -> System.out.println(product));

        } catch (ProductException e) {
            throw new RuntimeException(e);
        }

    }








    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
       Presentation obj = applicationContext.getBean("presentation", Presentation.class);
//       obj.insertProduct();
//        obj.printAllProduct();

//        obj.searchProduct();

        obj.GetProductsWithingPriceRange();



        ((AnnotationConfigApplicationContext)applicationContext).close();

    }


}
