package com.example.demo.Models;

import javax.persistence.*;

@Entity
//Products
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long productId;

    @Column
    private String ProductName;
    @Column
    private String ProductQuantity;
    @Column
    private String ProductPrice;
    @Column
    private String TotalSales;

    public long getproductId() {
        return productId;
    }
    public void setproductId(long productId){
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(String ProductQuantity) {
        this.ProductQuantity = ProductQuantity;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(String TotalSales) {
        this.TotalSales = TotalSales;
    }

}
