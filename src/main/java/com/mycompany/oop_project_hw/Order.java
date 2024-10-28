/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project_hw;

/**
 *
 * @author BERKİN
 */
class Order {
   private User user;
    private Product product;
    private CreditCard creditCard;

    public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
    }

    public void processOrder() {
        product.decreaseStock(1);
        user.orderProduct(product);
    }
    //getters

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
    //setters

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
} 

