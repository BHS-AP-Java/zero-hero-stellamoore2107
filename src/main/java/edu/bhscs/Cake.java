package edu.bhscs;

public class Cake implements Offsetable{
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
  int slashes;

  // I have to make a constructor
  public Cake(String age, String name) {
    this.age = age;
    this.name = name;
  }

  // Methods
  public int findOffset(int tableWidth) {
    getCakeWidth();
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
    printTop(x, y, z, slope);
    printMiddle(x, y, z, slope, "^");
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


    for (var i = 0; i < z; i++) {
      System.out.println(
          offsetShift + shiftTopLine(z, slope, shift) + makeTopLine(x, topper, slope, z) + "|");
    }
  }

  public void printMiddle(int x, int y, int z, int slope, String topper) {
    String midline = "";
    for (int i = 0; i < this.cakeOffset; i++) {
      midline += " ";
    }
    midline += "|";
    int toplineLength = (makeTopLine(x, "^", slope, z).length()) + this.cakeOffset;
    for (var i = 0; i < x; i++) {
      midline += "-";
    }
    midline += "|";
    int midlineLength = midline.length();
    int difference = toplineLength - midlineLength;
    this.slashes = difference;
    for (int i = 0; i < difference + 1; i++) {
      midline += "/";
    }
    midline += "|";
    for (int i = 0; i < y; i++) {
      System.out.println(midline);
    }
    this.finalWidth = midline.length();
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

  public void getCakeWidth() {
    this.finalWidth = 16;
  }
}
