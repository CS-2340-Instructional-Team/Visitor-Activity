package com.example.visitor;

public class Main {
    public static void main(String[] args) {
        SubComposite mySub = new SubComposite();
        mySub.addComponent(new Turkey());
        mySub.addComponent(new Cheese());
        mySub.addComponent(new Lettuce());
        mySub.addComponent(new Ham());
        mySub.addComponent(new Tomato());

        System.out.println("Original Order: " + mySub.getName());
        System.out.println("Original Cost: $" + mySub.getCost());

        StudentDiscountVisitor studentDiscount = new StudentDiscountVisitor();
        mySub.accept(studentDiscount);
        System.out.println("Student Discount: $" + studentDiscount.getTotalDiscount());

        LoyaltyDiscountVisitor loyaltyDiscount = new LoyaltyDiscountVisitor();
        mySub.accept(loyaltyDiscount);
        System.out.println("Loyalty Discount: $" + loyaltyDiscount.getDiscount());

        double finalPrice = mySub.getCost() - studentDiscount.getTotalDiscount() - loyaltyDiscount.getDiscount();
        System.out.println("Final Price: $" + finalPrice);
    }
}
