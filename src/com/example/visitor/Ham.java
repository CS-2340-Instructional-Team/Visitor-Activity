package com.example.visitor;

public class Ham implements SubComponent {
    @Override
    public void accept(DiscountVisitor visitor) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    @Override
    public double getCost() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
}