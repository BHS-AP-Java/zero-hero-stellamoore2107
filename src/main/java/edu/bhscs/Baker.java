package edu.bhscs;

public class Baker {
  // Constructor
  String name;
  int money;

  public Baker(String name) {
    this.name = name;
    this.money = 0;
    System.out.println("My name is " + name + " the baker and I have " + money + " dollars.");
  }

  public void bakerStatus(){
    System.out.println("My name is " + name + " the baker and I have " + money + " dollars.");
  }

  public Cake bakecake(String chosenIngredient, int cost, Baker baker) {
    return new Cake(chosenIngredient, cost, baker);
  }
}
