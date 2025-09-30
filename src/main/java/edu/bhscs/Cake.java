package edu.bhscs;

public class Cake {
  // Properties
  String ingredient;
  int weight;
  Customer owner;
  int cost;
  Baker baker;
  Bakesale bakesale;
  Flour flour;
  int quality;

  // I have to make a constructor
  public Cake(String chosenIngredient, int cost, Baker baker, Bakesale bakesale, Flour flour) {
    this.ingredient = chosenIngredient;
    this.baker = baker;
    this.flour = flour;
    System.out.println(baker.name + " is baking a cake with " + ingredient);
    this.weight = 10;
    this.cost = cost;
    this.bakesale = bakesale;
    this.quality = baker.experience + flour.quality;
  }

  public void getWeight() {
    System.out.println("The " + ingredient + " cake weights " + weight + " pounds");
  }
}
