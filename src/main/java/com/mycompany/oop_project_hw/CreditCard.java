/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project_hw;

/**
 *
 * @author BERKİN
 */
class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String securityCode;
    private String expirationDate;

    public CreditCard(String cardNumber, String cardHolderName, String securityCode, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    // Getters

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    
    
    //Setters

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

   

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    
    } }


