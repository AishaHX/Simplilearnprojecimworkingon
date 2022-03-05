package com.Simplilearn.MyClass;

import java.util.Scanner;

public class Product {
    private String Name;
    private int id;
    private int price;

    //reading data from the user
    public void readData() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter id:");
        id = obj.nextInt();
        System.out.println("Enter Name:");
        Name = obj.next();
        System.out.println("Enter price:");
        price = obj.nextInt();
        obj.close();
    }
}
