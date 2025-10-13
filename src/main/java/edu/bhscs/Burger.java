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

public class Burger {
  // Properties
  String buntype;
  Boolean lettuce;
  Boolean cheese;
  Boolean tomato;
  int cost;
  int weight;

  // Constructor
  public Burger() {
    this.weight = 10;
  }

  // Methods
  public void beEaten() {
    this.weight -= 2;
  }

  private static void breadGuts(int width) {
    String guts = "";
    for (int i = 0; i < width; i++) {
      guts += "=";
    }
  }

  public void draw() {
    for (int i = 0; i < 10; i++) {
      System.out.println(" //" + breadGuts(10) + "  ");
    }
  }
}
