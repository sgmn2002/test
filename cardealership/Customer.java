package com.mycompany.cardealership;

public class Customer {
    private String Name;
    private int IDNum;
    private double Salary;

    public void PurchaseCar(Vehicle V1, Employee E1, String finance){
        E1.handleCustomer(this, V1, finance);         //giving the method handleCustomer the values we gave to the class Customer and the method PurchaseCar.
    
    }

    //A list of setters and getters to give values to and use the (private) objects above:

    public String getName() { return Name; }

    public int getIDNum() { return IDNum; }

    public double getSalary() { return Salary; }

    public void setSalary(double Salary) { this.Salary= Salary; }

    public void setIDNum(int IDNum) { this.IDNum = IDNum; }

    public void setName(String Name) { this.Name = Name; }

}
