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

      Bakesale PTSABakesale = new Bakesale("the BHS PTSA");
      Customer simon = new Customer("Simon", 10);
      Customer sarah = new Customer ("Sarah", 20);
      Baker sillyBaker = new Baker("Whimsical Baker");
      Flour wholeFlour = new Flour ("whole", 1, 5, PTSABakesale);

      Cake chocolateCake = sillyBaker.bakecake("chocolate", 5, sillyBaker, PTSABakesale, wholeFlour);
      Cookies chocolateChipCookies = sillyBaker.bakeCookies("chocolate chips", 5, wholeFlour, sillyBaker, PTSABakesale);

      simon.purchaseCake(chocolateCake, simon);
      sarah.purchaseCookies(chocolateChipCookies, sarah);
      sillyBaker.bakerStatus();
      PTSABakesale.getMoney();
      simon.eatCake(); simon.statusCheck();
      sarah.eatCookies();
      sarah.statusCheck();
      chocolateCake.getWeight();

  }
}
