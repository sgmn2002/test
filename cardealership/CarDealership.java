package com.mycompany.cardealership;

import java.util.Scanner;

public class CarDealership { 

    public static void main(String[] args){
        Customer C1 = new Customer();             
        C1.setName("Saeed");                       //Setting the Customer's Name.
        C1.setIDNum(443000987);                    //Setting the Customer's ID number.
        C1.setSalary(3000);                //Setting the Customer's Salary .
        
        System.out.println("The Salary is : "+C1.getSalary()); // To show the employee and know his salary.

        Vehicle V1 = new Vehicle();               //instantiating a class.
        V1.setMake("MG");                     //Setting the vehicle's Make.
        V1.setModel("GT");                      //Setting the vehicle's Model.
        V1.setPrice(50000);                       //Setting the price of the vehicle.
        
        System.out.println("The Make is : "+V1.getMake());
        System.out.println("The Model is : "+V1.getModel());
        System.out.println("The Price is : "+V1.getPrice());

        Employee E1 = new Employee();           

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you accept to give him the loan? ");       // A question to the employee to accept or reject funding
        String f = scan.next();

        C1.PurchaseCar(V1, E1, f);    //I called Method PurchaseCar and gave it  the objects V1 , E1 and the value of f . 
    }

}
