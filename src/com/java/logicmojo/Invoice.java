package com.java.logicmojo;

public class Invoice {
    private Pen pen;
    private int quantity;

    public Invoice(Pen pen, int quantity) {
        this.pen = pen;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = (pen.price) * this.quantity;
        return price;
    }

//    public void printInvoice(){
//        //print the invoice//
//    }
//
//    public void saveToDB(){
//        //save the data into db//
//    }
}
