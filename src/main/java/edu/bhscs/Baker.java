package edu.bhscs;

// Stella Moore
// P2
// Zerohero
// 9/15/25

/*
 * DESCRIPTION: Requirements: A cake, a baker, a buyer, and a bakesale Make cakes and have them sold
 * INPUT: I don't know what that means yet OUTPUT: I don't know what that means yet either EDGE
 * CASE: Everything is an edge case right now
 */

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  int skill;
  String name;
  String[] orders;
  String topping;

  // CONSTRUCTOR
  Baker(Player p) {
    this.p = p;
  }

  // METHODS

  public void learn(int amount) {
    this.skill += amount;
  }

  void takeOrder(int price, Customer c) {
    cash += c.pay(price);

  }

  void bakeCake() {
    String answer = this.p.giveAnswer("What kind of cake do you want to bake? ");
    this.skill++;
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.name);
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.name);
    }
  }

  void getName() {
    this.name = this.p.giveAnswer("What is your name? ");
  }
}
