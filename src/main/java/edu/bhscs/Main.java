// Stella Moore
// P2
// Zerohero
// 9/15/25

/*
 * DESCRIPTION:
 *  Requirements: A cake, a baker, a buyer, and a PTSA
 *  Make cakes and have them sold
 * INPUT: I don't know what that means yet
 * OUTPUT: I don't know what that means yet either
 * EDGE CASE: Everything is an edge case right now
 */

package edu.bhscs;

class Main {

  public static void main(String[] args) {

    Bakesale PTSABakesale = new Bakesale("the BHS PTSA");
    Customer simon = new Customer("Simon", 10);
    Baker sillyBaker = new Baker("Whimsical Baker");
    sillyBaker.bakecake("whimsy", 10, sillyBaker, PTSABakesale);

    String theGoodStuff = "chocolate";
    Cake chocolateCake = new Cake(theGoodStuff, 5, sillyBaker, PTSABakesale);

    simon.purchase(chocolateCake, simon);
    sillyBaker.bakerStatus();
    PTSABakesale.getMoney();
    simon.eatCake();
    simon.statusCheck();

    chocolateCake.getWeight();
  }
}
