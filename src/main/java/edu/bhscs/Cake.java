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

  // I have to make a constructor
  public Cake(String topping) {
    this.topping = topping;
  }

  // Methods
  public void draw(int x, int y, int z, int slope) {

    this.layersToPrint = z;
    printTop(x, y, z, slope);
    printMiddle(x, y, z, slope);
  }

  public void printTop(int x, int y, int z, int slope) {
    // Assign topping shapes
    String topper = "";
    if (this.topping == "strawberry") {
      topper = "^";
    }
    if (this.topping == "chocolate") {
      topper = "<";
    }
    // Make top line
    String shift = "";
    this.toplinesMade = 0;

    for (var i = 0; i < z; i++) {
      System.out.println(shiftTopLine(z, slope, shift) + makeTopLine(x, topper, slope, z) + "|");
    }
  }

  public void printMiddle(int x, int y, int z, int slope) {
    String midline = "";
    int shiftamount = (slope * z) - this.toplinesMade;
    for (var i = 0; i < x; i++) {
      midline += "-";
    }
    midline += "|";
    int extend = z * slope;
    for (var i = 0; i < extend; i++) {
      midline += "/";
    }
    for (var j = 0; j < y; j++) {
      System.out.println("|" + midline);
    }
  }

  public String makeTopLine(int x, String topper, int slope, int z) {
    int width = x - z;
    this.toplinesMade += 1;
    String topline = "";
    for (var i = 0; i < width + toplinesMade + slope; i++) {
      topline += topper;
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
