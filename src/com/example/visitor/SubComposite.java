package com.example.visitor;

import java.util.*;

public class SubComposite implements SubComponent {
    private List<SubComponent> components = new ArrayList<>();

    public void addComponent(SubComponent comp) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public void accept(DiscountVisitor visitor) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public double getCost() {
        //DO NOT MODIFY
        return components.stream().mapToDouble(SubComponent::getCost).sum() + 3;
    }

    public String getName() {
        // DO NOT MODIFY
        return components.stream().map(SubComponent::getName).reduce("Sub with Bread", (a, b) -> a + ", " + b);
    }
}