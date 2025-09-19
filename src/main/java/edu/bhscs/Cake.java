package edu.bhscs;

public class Cake {
  // Properties
  String otherIngredient;
  int weight;
  // I have to make a constructor
  public Cake(String ingredient) {
    System.out.println("Baking the cake with..." + ingredient);
    this.weight = 10;
  }

  public void eaten(){
    this.weight = this.weight - 2;
  }

  public int getWeight(){
    return this.weight;
  }
}
