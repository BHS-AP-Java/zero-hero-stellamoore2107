package edu.bhscs;

public class Customer {
  // Properties 
  public Customer(String name) {
    System.out.println("Hey, my name is " + name);
  }

  void purchase(String item) {
    System.out.println("I just bough a " + item);
  }
}
