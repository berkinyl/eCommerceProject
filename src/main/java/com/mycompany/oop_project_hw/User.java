/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project_hw;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BERKİN
 */
      class User {

    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String emailAddress;
    private String homeAddress;
    private String workAddress;
    private List<Product> productsOrdered;
    private List<Product> favoriteProducts;
    private List<CreditCard> creditCards;

    public User(String username, String name, String surname, String dateOfBirth, String password, String emailAddress, String homeAddress, String workAddress) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.productsOrdered = new ArrayList<>();
        this.favoriteProducts = new ArrayList<>();
        this.creditCards = new ArrayList<>();
    }

    public void orderProduct(Product product) {
        product.decreaseStock(1);
        productsOrdered.add(product);
    }

    public void addFavoriteProduct(Product product) {
        favoriteProducts.add(product);
    }
    
    //Getters

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public List<Product> getProductsOrdered() {
        return productsOrdered;
    }

    public List<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }
    
    
    
    //Setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setProductsOrdered(List<Product> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    public void setFavoriteProducts(List<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

   
}
    


