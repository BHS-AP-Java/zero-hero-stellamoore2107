package edu.bhscs;

public class Customer {
  // Properties
  String name;
  int money;
  String state;
  Cake cake;

  public Customer(String chosenName, int givenMoney) {
    name = chosenName;
    money = givenMoney;
    state = "hungry";
    System.out.println("Hey, my name is " + name + ", I am " + state + ", and I have " + money + " dollars");
  }

  public void purchase(Cake cakeToPurchase, Customer buyer) {
    cakeToPurchase.owner = buyer;
    money = money - cakeToPurchase.cost;
    cake = cakeToPurchase;
    cakeToPurchase.bakesale.money += cakeToPurchase.cost;
    cakeToPurchase.baker.baked += 1;
    System.out.println(
        "I, "
            + buyer.name
            + ", just bought a cake made with "
            + cakeToPurchase.ingredient
            + " that costed "
            + cakeToPurchase.cost
            + " dollars. I now have "
            + money
            + " dollars");
  }

  public void eatCake(){
    cake.weight -= 2;
    state = "full";
  }

  public void statusCheck(){
    System.out.println("My name is "
    + name + ", I have "
    + money + " dollars, I own a "
    + cake.ingredient + " cake and I feel "
    + state + ".");
  }
}
