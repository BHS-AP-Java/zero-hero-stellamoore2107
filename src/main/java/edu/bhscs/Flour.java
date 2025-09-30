package edu.bhscs;

public class Flour {
  // Fields and Properties
  String name;
  int price;
  int lbs;
  int quality;

  // Constructor
  public Flour(String name, int price, int lbs) {
    this.name = name;
    this.price = price;
    this.lbs = lbs;
    this.quality = 5;
  }

  // Methods
  public void goesbad() {
    this.quality = 0;
  }
}
