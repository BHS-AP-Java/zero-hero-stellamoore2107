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
    Customer simon = new Customer("Simon");
    Baker sillyBaker = new Baker();
    sillyBaker.bakecake();

    String theGoodStuff = "chocolate";
    Cake chocholateCake = new Cake(theGoodStuff);

    simon.purchase(chocholateCake);

    chocholateCake.eaten();
    System.out.println("This cake weighs " + chocholateCake.getWeight() + " pounds");
  }

  public static String pushup(String food) {
    return "sweat " + food;
  }
}

