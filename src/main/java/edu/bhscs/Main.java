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

    String mystring = pushup("garlic");
    System.out.println(mystring);
    System.out.println();

    Bakery myBakery = new Bakery("My");
    Customer simon = new Customer("Simon");

    String theGoodStuff = "chocolate";
    Cake chocholateCake = new Cake(theGoodStuff);

    chocholateCake.eaten();
    System.out.println("This cake weighs " + chocholateCake.getWeight() + " pounds");
  }

  public static String pushup(String food) {
    return "sweat " + food;
  }
}

// What is strange about this program is that sometimes when char and int variables are
// combined, instead of printing next to each other as expected, they add together to create a
// larger number.
// Another strange thing is that the char variables must use single quotes to declare the
// variable instead of the usual double quotes used for strings.
