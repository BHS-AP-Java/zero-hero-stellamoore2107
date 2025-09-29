package edu.bhscs;

public class Baker {
  // Fields/properties
  String name;
  int money;
  int baked;
 // Constructor (something that makes an instance of the class)
  public Baker(String name) {
    this.name = name;
    this.money = 0;
    this.baked = 0;
    System.out.println("My name is " + name + " the baker and I have made " + baked + " cakes.");
  }

  public void bakerStatus() {
    System.out.println("My name is " + name + " the baker and I have baked " + baked + " cakes.");
  }

  public Cake bakecake(String chosenIngredient, int cost, Baker baker, Bakesale bakesale) {
    return new Cake(chosenIngredient, cost, baker, bakesale);
  }
}
