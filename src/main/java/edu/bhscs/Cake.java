package edu.bhscs;

public class Cake {
  // Properties
  String kind;
  int weight;
  Customer owner;
  int cost;
  Baker baker;
  Flour flour;
  int quality;

  // I have to make a constructor
  public Cake(String kind, Flour flour, int skill) {
    this.kind = kind;
    this.flour = flour;
    this.weight = 10;
  }

  // Methods
  public int getWeight() {
    return this.weight;
  }
}
