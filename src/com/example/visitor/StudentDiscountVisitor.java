package com.example.visitor;

public class StudentDiscountVisitor implements DiscountVisitor {
    private double totalDiscount = 0.0;

    public void visit(Turkey turkey) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
    public void visit(Ham ham) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
    public void visit(Cheese cheese) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
    public void visit(Lettuce lettuce) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
    public void visit(Tomato tomato) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
    public void visit(SubComposite sub) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
    public double getTotalDiscount() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }
}