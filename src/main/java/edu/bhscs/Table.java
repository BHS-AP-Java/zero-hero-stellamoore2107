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
    for (var i = 0; i < this.width; i++) {
      System.out.print("=");
    }
    System.out.println();
    for (var i = 0;i < 4; i++){
      System.out.println("#");
      for (var j = 0; j < legs-1; j++){
        for (var k = 0; k < eachWidth; k++){
          System.out.print(" ");
        }
        System.out.print("#");
      }
      System.out.println();
    }

  }
}
