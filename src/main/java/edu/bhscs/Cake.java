package edu.bhscs;

public class Cake {
  // Properties
  String ingredient;
  int weight;
  Customer owner;
  int cost;
  Baker baker;
  Bakesale bakesale;

  // I have to make a constructor
  public Cake(String chosenIngredient, int cost, Baker baker, Bakesale bakesale) {
    this.ingredient = chosenIngredient;
    this.baker = baker;
    System.out.println(baker.name + " is baking a cake with " + ingredient);
    this.weight = 10;
    this.cost = cost;
    this.bakesale = bakesale;
  }

  public void getWeight() {
    System.out.println("The " + ingredient + " cake weights " + weight + " pounds");
  }
}
