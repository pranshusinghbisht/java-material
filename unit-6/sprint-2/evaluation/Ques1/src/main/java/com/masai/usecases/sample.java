package com.masai.usecases;

import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class sample {
    public static void main(String[] args) {
       EntityManager em = EMUtil.provideEntityManager();
       if(em.isOpen()){
           System.out.println("On");
       }
       else{
           System.out.println("Not on");
       }
       em.close();
    }
}
