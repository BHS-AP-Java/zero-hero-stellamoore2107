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
    Player p = new Player("my player");
    Baker myBaker = new Baker(p);
    Store myStore = new Store("Cool Store");
    myBaker.getName();
    myBaker.takeJob(myStore);

    Customer sarah = new Customer("Sarah", 20, "chocolate");
    myBaker.bakeCake();




  }
}
