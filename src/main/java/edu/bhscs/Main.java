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
    Player user = new Player("me");
    String name = user.giveAnswer("What is your name? ");
    String age = user.giveAnswer("How old are you? ");
    Cake myCake = new Cake(name, age);
    myCake.draw(6, 4, 4, 2);
  }
}
