/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project_hw;

/**
 *
 * @author BERKİN
 */
class Product {
       private String name;
    private String color;
    private String category;
    private int stock;
    private double weight;
    private String description;

    public Product(String name, String color, String category, int stock, double weight, String description) {
        this.name = name;
        this.color = color;
        this.category = category;
        this.stock = stock;
        this.weight = weight;
        this.description = description;
    }


    public void decreaseStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Insufficient stock available.");
        }
    }
    
    
    //Getters

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }
    
    
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

