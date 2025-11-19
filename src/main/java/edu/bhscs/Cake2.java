package edu.bhscs;

public class Cake2 {
  // Fields and Properties
  String age;
String name;
  int x;
  int y;
  int z;
  int slope;
  String offset;

  // Constructor
  public Cake2 (String age, String name){
    this.age = age;
    this.name = name;
    this.offset = "";
  }

  // Methods
  public void draw(int x, int y, int z, int slope) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.slope = slope;
    printToplines();
    printMidlines();
  }

  public void printToplines() {

  }

  public void printMidlines() {
    String midline = "|";
    for (int i = 0; i < this.x; i++) {
      midline += "-";
    }
    midline += "|";
  }
}
