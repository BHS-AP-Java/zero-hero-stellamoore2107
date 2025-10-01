package edu.bhscs;

public class Baker {
  // Fields/properties
  String name;
  double money;
  int baked;
  int experience;

  // Constructor (something that makes an instance of the class)
  public Baker(String name) {
    this.name = name;
    this.money = 0;
    this.baked = 0;
    System.out.println(
        "My name is "
            + name
            + " the baker, I have "
            + money
            + " dollars and I have made "
            + baked
            + " cakes.");
  }

  public void bakerStatus() {
    System.out.println(
        "My name is "
            + name
            + " the baker, I have "
            + money
            + " dollars, and I have baked "
            + baked
            + " cakes.");
  }

  public Cake bakecake(
      String chosenIngredient, int cost, Baker baker, Bakesale bakesale, Flour flour) {
    this.experience += 1;
    return new Cake(chosenIngredient, cost, baker, bakesale, flour);
  }
}
