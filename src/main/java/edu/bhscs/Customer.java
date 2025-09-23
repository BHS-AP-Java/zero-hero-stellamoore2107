package edu.bhscs;

public class Customer {
  // Properties
  String name;
  int money;
  public Customer(String chosenName, int givenMoney) {
    name = chosenName;
    money = givenMoney;
    System.out.println("Hey, my name is " + name + " and I have " + money + " dollars");
  }

  public void purchase(Cake cakeToPurchase, Customer buyer) {
    cakeToPurchase.owner = buyer;
    money = money - cakeToPurchase.cost;
    System.out.println("I, " +  buyer.name + ", just bought a cake made with " + cakeToPurchase.ingredient + " that costed " + cakeToPurchase.cost + " dollars. I now have " + money + " dollars");
  }
}
