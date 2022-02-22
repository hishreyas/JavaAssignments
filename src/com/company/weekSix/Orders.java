package com.company.weekSix;

import java.io.IOException;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) throws IOException {
        int i;
        for(;;){
        System.out.println("Select Any One: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Purchase Order");
        System.out.println("2.Sales Order");
        int choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter the number of purchase Orders: ");
                int n = sc.nextInt();
                PurchaseOrder[] purchaseOrders = new PurchaseOrder[n];
                for (i = 0; i < n; i++) {
                    purchaseOrders[i] = new PurchaseOrder();
                    purchaseOrders[i].accept();
                }
                for (PurchaseOrder purchaseOrder : purchaseOrders) {
                    purchaseOrder.display();
                    System.out.println("Object is created");
                }
                break;
            case 2:
                System.out.println("Enter the number of sales orders: ");
                int m = sc.nextInt();
                SalesOrder[] salesOrders = new SalesOrder[m];
                for (i = 0; i < m; i++) {
                    salesOrders[i] = new SalesOrder();
                    salesOrders[i].accept();
                }
                for (SalesOrder salesOrder : salesOrders) {
                    salesOrder.display();
                    System.out.println(" Object is created ");
                }
                break;

        }
        }
    }
}


abstract class Order {
    int id;
    String description;
}

class PurchaseOrder extends Order {
    String customerName;
    String vendorName;

    public void accept() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id,description,names of customers and vendors: ");
        id = sc.nextInt();
        description = sc.next();
        customerName = sc.next();
        vendorName = sc.next();
    }

    public void display() {
        System.out.println("id: " + id);
        System.out.println("Description: " + description);
        System.out.println("CustomerName: " + customerName);
        System.out.println("VendorName: " + vendorName);
        System.out.println("----------------------");

    }
}

class SalesOrder extends Order {
    String customerName, vendorName;

    public void accept() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id,description,names of customers and vendors: ");
        id = sc.nextInt();
        description = sc.next();
        customerName = sc.next();
        vendorName = sc.next();
    }

    public void display() {
        System.out.println("id: " + id);
        System.out.println("Description: " + description);
        System.out.println("CustomerName: " + customerName);
        System.out.println("VendorName: " + vendorName);
        System.out.println("----------------------");
    }
}
