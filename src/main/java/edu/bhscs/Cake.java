package edu.bhscs;

public class Cake {
  // Properties
  int layers;
  String topping;
  String kind;
  int weight;
  int toplinesMade;
  int layersToPrint;
  String name;
  String age;
  int finalWidth;
  int cakeOffset;
  int tableOffset;
  int x;
  int slope;
  int z;
  String middle;
  int y;
  int toplineLength;
  boolean offsetting;


  // I have to make a constructor
  public Cake(String age, String name) {
    this.age = age;
    this.name = name;
  }

  // Methods
  public int findOffset(int tableWidth) {
    this.offsetting = true;
    makeMiddle(this.x, this.y, this.z, this.slope, "^");
    int offset = (this.finalWidth - tableWidth) / 2;
    if (this.finalWidth > tableWidth) {
      this.cakeOffset = 0;
      this.tableOffset = Math.abs(offset);
    } else {
      this.cakeOffset = Math.abs(offset);
      this.tableOffset = 0;
    }
    return this.tableOffset;
  }

  public void draw(Table t) {
    int tableWidth = t.getWidth();
    findOffset(tableWidth);
    this.draw(7, 4, 4, 2);
    t.draw(new Cake("5", "Susie"));
    System.out.println("This cake is for " + name + " who is turning " + age);
  }

  public void draw(int x, int y, int z, int slope) {
    this.x = x;
    this.layersToPrint = z;
    this.slope = slope;
    this.z = z;
    this.y = y;
    makeMiddle(x, y, z, slope, "^");
    printTop(x, y, z, slope);
    printMiddle();
  }

  public void printTop(int x, int y, int z, int slope) {
    // Assign topping shapes
    String topper = "^";

    // Make top line
    String offsetShift = "";
    for (int i = 0; i < this.cakeOffset; i++) {
      offsetShift += " ";
    }
    String shift = "";
    this.toplinesMade = 0;

    String topline = shiftTopLine(z, slope, shift) + makeTopLine(x, topper, slope, z) + "|";
    this.toplineLength = topline.length();
    this.layersToPrint += 1;
    for (var i = 0; i < z; i++) {
      System.out.println(
          offsetShift + shiftTopLine(z, slope, shift) + makeTopLine(x, topper, slope, z) + "|");
    }
  }

  public void makeMiddle(int x, int y, int z, int slope, String topper) {
    String midline = "";
    midline += "|";
    for (var i = 0; i < x; i++) {
      midline += "-";
    }
    midline += "|";
    makeTopLine(x, topper, slope, z);
    this.toplinesMade -= 1;
    int midlineLength = midline.length();
    int difference = this.toplineLength - midlineLength;
    System.out.println("The difference between the topline length and midline length is " + difference);
    for (int i = 0; i < difference + 1; i++) {
      midline += "/";
    }
    midline += "|";
    this.finalWidth = midline.length();
    this.middle = midline;
  }

  public void printMiddle() {
    String midline = "";
    for (int i = 0; i < this.cakeOffset; i++) {
      midline += " ";
    }
    midline += this.middle;
    for (int i = 0; i < this.y; i++) {
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
