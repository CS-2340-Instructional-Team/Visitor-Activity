package com.example.visitor;


public interface DiscountVisitor {
    //DO NOT MODIFY
    void visit(Turkey turkey);
    void visit(Ham ham);
    void visit(Cheese cheese);
    void visit(Lettuce lettuce);
    void visit(Tomato tomato);
    void visit(SubComposite sub);
}