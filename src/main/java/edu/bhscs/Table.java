// We are trying to understand the fencepost problem
// and use that in our table drawing
package edu.bhscs;

public class Table {
  // Fields and Propertires
  int legs;
  int width;
  int spaces;
  String leg;

  // Constructor
  public Table(int legs, int width, String leg) {
    this.legs = legs;
    this.width = width;
    this.spaces = legs + 1;
    this.leg = leg;
  }

  // Methods
  public void draw(Cake c) {
    int legLength = this.leg.length();
    int remainder = this.width % this.spaces;
    int filling = (this.width / this.spaces) - 1;
    filling -= (legLength - 1);
    this.width -= (remainder + 1);
    int offset = c.findOffset(this.width);
    for (int i = 0; i < offset; i++) {
      System.out.print(" ");
    }
    for (int i = 0; i < this.width; i++) {
      System.out.print("-");
    }
    System.out.println();
    String legline = "";
    for (int i = 0; i < offset; i++) {
      legline += " ";
    }
    for (int i = 0; i < spaces - 1; i++) {
      for (var j = 0; j < filling; j++) {
        legline += " ";
      }
      legline += this.leg;
    }
    for (int i = 0; i < 4; i++) {
      System.out.println(legline);
    }
  }

  public int getWidth() {
    return (this.width - ((this.width % this.spaces) + 1));
  }
}
