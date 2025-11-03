// We are trying to understand the fencepost problem
// and use that in our table drawing
package edu.bhscs;

public class Table {
  // Fields and Propertires
  int legs;
  int width;
  int spaces;

  // Constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.spaces = legs + 1;
  }

  // Methods
  public void draw(){
    int remainder = this.width % this.spaces;
    int filling = (this.width / this.spaces) - 1;
    this.width -= (remainder + 1);
    for (int i = 0; i < this.width; i++){
      System.out.print("-");
    }
    System.out.println();
    String legline = "";
    for (int i = 0; i < spaces - 1; i++){
      for (var j = 0; j < filling; j++){
        legline += " ";
      }
      legline += "!";
    }
    for (int i = 0; i < 4; i++){
      System.out.println(legline);
    }
  }

  public int getWidth(){
    return this.width;
  }
}

