package com.example.visitor;

import java.util.*;

public class SubComposite implements SubComponent {
    //DO NOT MODIFY
    private final List<SubComponent> components = new ArrayList<>();

    public void addComponent(SubComponent comp) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public void accept(DiscountVisitor visitor) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public double getCost() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public String getName() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
}
