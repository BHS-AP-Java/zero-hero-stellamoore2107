package edu.bhscs;

// Draws a simple face
public class Face implements Offsetable {
  void draw() {
    this.draw(null);
  }

  void draw(Offsetable other) {
    System.out.println(" ^ ^ ");
    System.out.println("  |  ");
    System.out.println("\\___/");
  }

  public int getWidth() {
    return 5;
  }

  public int getOffset(Offsetable below) {
    return 0;
  }
}
