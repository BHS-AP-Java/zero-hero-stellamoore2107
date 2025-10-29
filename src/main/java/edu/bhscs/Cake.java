package edu.bhscs;

public class Cake {
  // Properties
  int layers;
  int width;
  String topping;
  String kind;
  int weight;
  int toplinesMade;
  int layersToPrint;
  String name;
  String age;

  // I have to make a constructor
  public Cake(String age, String name) {
    this.name = name;
    this.age = age;
  }

  // Methods

  public void draw(Table t) {
    this.draw(7, 4, 4, 2);
    t.draw();
  }

  public void draw(int x, int y, int z, int slope) {

    this.layersToPrint = z;
    printTop(x, y, z, slope);
    printMiddle(x, y, z, slope, "^");

    System.out.println("This cake is for " + this.name + " who is turning " + this.age);
  }

  public void printTop(int x, int y, int z, int slope) {
    // Assign topping shapes
    String topper = "^";

    // Make top line
    String shift = "";
    this.toplinesMade = 0;

    for (var i = 0; i < z; i++) {
      System.out.println(shiftTopLine(z, slope, shift) + makeTopLine(x, topper, slope, z) + "|");
    }
  }

  public void printMiddle(int x, int y, int z, int slope, String topper) {
    String midline = "|";
    int toplineLength = makeTopLine(x, "^", slope, z).length();
    for (var i = 0; i < x; i++) {
      midline += "-";
    }
    midline += "|";
    int midlineLength = midline.length();
    int difference = toplineLength - midlineLength;
    for (int i = 0; i < difference + 1; i++){
      midline += "/";
    }
    midline += "|";
    for (int i = 0; i < y; i++){
      System.out.println(midline);
    }
  }

  public String makeTopLine(int x, String topper, int slope, int z) {
    int width = x - z;
    this.toplinesMade += 1;
    String topline = "";
    for (var i = 0; i < width + toplinesMade + slope; i++) {
      topline += topper;
    }
    for (var i = 0; i < toplinesMade - 1; i++) {
      topline += "/";
    }
    return topline;
  }

  public String shiftTopLine(int z, int slope, String shift) {
    int shiftAmount = slope * this.layersToPrint;
    for (var i = 0; i < shiftAmount; i++) {
      shift += " ";
    }
    shift += "/";
    this.layersToPrint -= 1;
    return shift;
  }
}
