package com.unidirectional.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_category")
public class Cateogry {
    @Id
    private String cId;
    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> productList = new ArrayList<>();




    public Cateogry(String cId, String title) {
        this.cId = cId;
        this.title = title;
    }

    public Cateogry() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
