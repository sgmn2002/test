package com.mycompany.cardealership;

public class Employee {

public void handleCustomer(Customer C1, Vehicle V1,String finance){

            if(finance.equalsIgnoreCase("yes")){                                //Checking if the condition is yes or no.
            int loanAmount = (int) (V1.getPrice()+ V1.getPrice() * 0.15);         //Here I knew the loanAmount variable is equal to the Price of the car .




            System.out.println("There is a great history for the customer and he is due for the loan... ");   //The customer is committed to repaying the loans first by first.
            System.out.println("Customer has been approved to loan " + V1.getPrice() + " from the bank to purchase the vehicle: " //Printing a statement.
                  + V1.getMake() + " " + V1.getModel() + " for the price " + V1.getPrice() + "$" );
                       
            System.out.println("You should Pay " + loanAmount / 60 +"/month for 60 month with interest. ");   // Place an order for the monthly payment of the loan .  
}
  else {       

                   //  here the System has refused the request because the loan amount / 60 > salary / 2 .

            System.out.println("it appears to me that your financially invalid to take a loan from the bank" + 
                          " so please go and come back later with more money " );

}

} 

}




