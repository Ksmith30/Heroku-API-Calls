package com.example.kyle.retrofit;

public class Product {
    String id;
    String lookUpCode;
    int count;
    String createdOn;

    Product(String id, String lookUpCode, int count, String createdOn) {
        this.id = id;
        this.lookUpCode = lookUpCode;
        this.count = count;
        this.createdOn = createdOn;
    }
}
