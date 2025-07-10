package com.example.visitor;

public class LoyaltyDiscountVisitor implements DiscountVisitor {
    private double discount = 0.0;

    public void visit(SubComposite sub) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    // DO NOT MODIFY
    public void visit(Turkey t) {}
    public void visit(Ham h) {}
    public void visit(Cheese c) {}
    public void visit(Lettuce l) {}
    public void visit(Tomato t) {}

    public double getDiscount() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
}