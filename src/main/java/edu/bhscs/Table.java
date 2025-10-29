// We are trying to understand the fencepost problem
// and use that in our table drawing
package edu.bhscs;

public class Table {
  // Fields and Propertires
  int legs;
  int width;

  // Constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
  }

  // Methods
  public void draw() {
    int eachWidth = this.width / this.legs;
    int remainder = this.width % this.legs;
    int difference = this.width - remainder;
    String widthLine = "";
    for (int i = 0; i < difference; i++){
      widthLine += "-";
    }

    String topline = widthLine.substring(0, difference);
    String legline = "";
    for (int i = 0; i < legs; i++){
      legline += "!";
      for (int j = 0; j < eachWidth; j++){
        legline += " ";
      }
    }
    System.out.println(topline);
    for (int i = 0; i < 4; i++){
      System.out.println(legline);
    }
  }
}
