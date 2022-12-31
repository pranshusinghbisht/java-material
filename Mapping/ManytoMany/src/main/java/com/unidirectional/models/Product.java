package com.unidirectional.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_product")
public class Product {
    @Id
    private String pId;
    private String productName;

    @ManyToMany(mappedBy = "productList")
    private List<Cateogry> cateogries = new ArrayList<>();

    public Product(String pId, String productName) {
        this.pId = pId;
        this.productName = productName;
    }

    public Product() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Cateogry> getCateogries() {
        return cateogries;
    }

    public void setCateogries(List<Cateogry> cateogries) {
        this.cateogries = cateogries;
    }
}
