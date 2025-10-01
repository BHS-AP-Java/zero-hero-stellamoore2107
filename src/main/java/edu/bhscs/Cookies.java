// These are cookies, an alternative baked good for customers to buy and bakers to bake.

package edu.bhscs;

public class Cookies {
  // Fields and properties
  String ingredient;
  int batchAmount;
  Flour flour;
  int cost;
  Baker baker;
  Bakesale bakesale;
  Customer owner;

  // Constructor
  public Cookies(String ingredient, int batchAmount, Flour flour, Baker baker, Bakesale bakesale){
    this.ingredient = ingredient;
    this.batchAmount = batchAmount;
    this.bakesale = bakesale;
    this.flour = flour;
    this.baker = baker;
    this.cost = this.flour.quality + this.batchAmount + this.baker.experience;
    System.out.println(baker.name + " is baking a batch of cookies with " + ingredient);
  }
}
