package edu.bhscs;

public class Cake {
  // Properties
  String ingredient;
  int weight;
  Customer owner;
  int cost;

  // I have to make a constructor
  public Cake(String chosenIngredient, int cost, Baker baker) {
    this.ingredient = chosenIngredient;
    System.out.println("Baking the cake with..." + ingredient);
    this.weight = 10;
    this.cost = cost;
  }

  public void eaten() {
    this.weight = this.weight - 2;
  }

  public int getWeight() {
    return this.weight;
  }
}
