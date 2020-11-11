package com.example.lntappb2.overriding;

public class Gst extends IncomeTax {
    @Override
    public int calculateTax(int income) {
        int oldTax = super.calculateTax(income);
        int newTax = oldTax + oldTax/15;
        return  oldTax+newTax;
    }
}
