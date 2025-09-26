// Stella Moore
// P2
// Zerohero
// 9/15/25

/*
 * DESCRIPTION: Whatever Mr. Reiber says
 * INPUT: I don't know what that means yet
 * OUTPUT: I don't know what that means yet either
 * EDGE CASE: Everything is an edge case right now
 */

package edu.bhscs;

class Main {

  public static void main(String[] args) {

    Bakery myBakery = new Bakery("My");
    Customer simon = new Customer("Simon", 10);
    Baker sillyBaker = new Baker("Whimsical Baker");
    sillyBaker.bakecake("whimsy", 10, sillyBaker);

    String theGoodStuff = "chocolate";
    Cake chocolateCake = new Cake(theGoodStuff, 5, sillyBaker);

    simon.purchase(chocolateCake, simon);
    sillyBaker.bakerStatus();

    System.out.println("This cake weighs " + chocolateCake.getWeight() + " pounds");
  }
}
