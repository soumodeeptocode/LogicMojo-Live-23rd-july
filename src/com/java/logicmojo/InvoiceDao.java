package com.java.logicmojo;

//public class InvoiceDao {
//    Invoice invoice;
//
//    public InvoiceDao(Invoice invoice) {
//        this.invoice = invoice;
//    }
//
//    public void saveToDb(){
//        //save to db//
//    }
//
//    public void saveToFile(){
//        //save to file//
//    }
//}
interface InvoiceDao{
    public void save(Invoice invoice);
}


