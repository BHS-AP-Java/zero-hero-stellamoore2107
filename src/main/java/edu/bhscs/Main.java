// Stella Moore
// P2
// Zerohero
// 9/15/25

/*
 * DESCRIPTION:
 *  Requirements: A cake, a baker, a buyer, and a bakesale
 *  Make cakes and have them sold
 * INPUT: I don't know what that means yet
 * OUTPUT: I don't know what that means yet either
 * EDGE CASE: Everything is an edge case right now
 */

package edu.bhscs;

class Main {

  public static void main(String[] args) {
    date10_27();
  }

  public static void date10_27() {
    Baker bob = new Baker("bob");
    Table t = new Table(4, 30);
    t.setLeg("|?|");
    Cake bDay = bob.bakes();
    bDay.draw(t);
  }
}
