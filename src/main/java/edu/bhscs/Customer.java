// This is a customer that can spend money to buy cakes from the bakesale and eat them.

package edu.bhscs;

public class Customer {
  // Properties
  String name;
  int money;
  String feeling;
  Cake cake;

  String order;

  public Customer(String chosenName, int givenMoney, String order) {
    name = chosenName;
    money = givenMoney;
    this.order = order;
    feeling = "hungry";
    System.out.println(
        "Hey, my name is " + name + " the Customer, I would like one " + order + " cake.");
  }

  public void takeCake(Cake cake) {
    this.cake = cake;
  }

  public int pay(int price) {
    this.money -= price;
    return price;
  }

  public void eatCake() {
    cake.weight -= 2;
    feeling = "full";
  }

  public void eatCookies() {
    feeling = "full";
  }

  public void statusCheck() {
    System.out.println(
        "My name is " + name + ", I have " + money + " dollars, and I feel " + feeling + ".");
  }
}
