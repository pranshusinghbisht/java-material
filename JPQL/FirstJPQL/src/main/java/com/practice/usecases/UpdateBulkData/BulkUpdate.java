package com.practice.usecases.UpdateBulkData;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class BulkUpdate {
    public static void main(String[] args) {

    EntityManager em = EMUtil.provideEntityManager();

    String jpql = "update Employee set salary=salary+500";

    Query q = em.createQuery(jpql);
    // as this is a dml command so it has a transactional area
    em.getTransaction().begin();
    int x = q.executeUpdate();
    em.getTransaction().commit();
        System.out.println(x+" row updated...");
        em.close();
}
}
