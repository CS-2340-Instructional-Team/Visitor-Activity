package com.example.visitor;

public interface SubComponent {
    //DO NOT MODIFY
    void accept(DiscountVisitor visitor);
    double getCost();
    String getName();
}