/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.oop_project_hw;

/**
 *
 * @author BERKİN
 */
public class Oop_Project_HW {    //TEST CLASS!!!!

    public static void main(String[] args) { 
        
        //title
        System.out.println("-------------------------------------------------------");
        System.out.println("| WELCOME TO OUR POOR FRIENDLY E-COMMERCE APPLICATION |");
        System.out.println("-------------------------------------------------------");
        
        
        // Create a user
        User user = new User("Bateman321", "Patrick", "Bateman", "1985-07-15", "sigmaBateman77", "ptrck.bateman77@icloud.com", "123 Main St", "456 Work St");

        // Create a credit card
        CreditCard creditCard = new CreditCard(" 3556 4926 4226 3681", " Patrick Bateman", " 123", " 2025-12");

        // Create a products
        Product product = new Product("iPhone 12 mini", "Silver", "Electronics", 10, 0.3, "iPhone 12 mini description");
        Product product2 = new Product("Samsung Galaxy S21", "Black", "Electronics", 5, 0.2, "Samsung Galaxy S21 description");

        // Perform operations
        user.orderProduct(product);
        user.addFavoriteProduct(product);
        
        user.orderProduct(product2);
        user.addFavoriteProduct(product2);

        // Testing functionality 
        System.out.println("User's Ordered Products: " + user.getProductsOrdered().get(0).getName());
        System.out.println("User's Favorite Products: " + user.getFavoriteProducts().get(1).getName());
        System.out.println("User's Credit Cards: " + creditCard.toString());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("-----------------------------------------------");
        

        // Testing functionality after the second order
        System.out.println("-----------------------------------------------");
        System.out.println("User's Ordered Products: " + user.getProductsOrdered().get(1).getName());
        System.out.println("User's Favorite Products: " + user.getFavoriteProducts().get(0).getName());
        System.out.println("User's Credit Cards: " + creditCard.toString());
        System.out.println("Product Stock: " + product2.getStock());
    }
} 



    


    

