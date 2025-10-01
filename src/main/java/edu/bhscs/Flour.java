// This flour is an ingredient of the cakes that affects their quality and cost, and
// must be bought by the bakesale

package edu.bhscs;

public class Flour {
  // Fields and Properties
  String name;
  int price;
  int lbs;
  int quality;

  // Constructor
  public Flour(String name, int price, int lbs, Bakesale bakesale) {
    this.name = name;
    this.price = price;
    this.lbs = lbs;
    this.quality = 5;
    bakesale.money -= price;
    System.out.println("The " + bakesale.name + " bakesale bought " + name + " flour for " + price + " dollars. They now have " + bakesale.money + " dollars");
  }

  // Methods
  public void goesbad() {
    this.quality = 0;
  }
}
