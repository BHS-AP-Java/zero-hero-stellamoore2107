package edu.bhscs;

public class Cake {
  // Properties
  int layers;
  int width;
  String topping;
  String kind;
  int weight;
  Customer owner;
  int cost;
  Baker baker;
  Flour flour;
  int quality;

  // I have to make a constructor
  public Cake(String topping) {
    this.topping = topping;
  }

  // Methods
  public void draw(int x, int y, int z, int slope) {

  }

  public void printTop(int x){
    // Assing topping shapes
    String topper = "";
    if (this.topping == "strawberry"){
      topper = "<";
    }
    if (this.topping == "vanilla"){
      topper = "^";
    }
    if (this.topping == "chocholate"){
      topper = "/";
    }

    // Make top line
    String toppingLine = "";
    for(var i = 0; i < x + 1; i++){
      toppingLine += topper;
    }
    System.out.println(toppingLine);

  }
}
