package com.example.demo.Models;

import javax.persistence.*;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long productsId;

    @Column
    private String UserId;
    @Column
    private String OrderDate;
    @Column
    private String TotalOrder;

    public long getproductId() {
        return productsId;
    }
    public void setproductId(long productsId){
        this.productsId = productsId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }



    public String getTotalOrder() {
        return TotalOrder;
    }

    public void setTotalOrder(String TotalOrder) {
        this.TotalOrder = TotalOrder;
    }

}






