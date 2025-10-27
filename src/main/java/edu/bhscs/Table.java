package edu.bhscs;

public class Table {
  // Fields and Propertires
  int legs;
  int width;

  // Constructor
  public Table(int legs, int width){
    this.legs = legs;
    this.width = width;
  }

  // Methods
  public void draw(){
    int eachWidth = this.width / this.legs;
    String topline = "";
    String legline = "#";
    for (var i = 0; i < this.width; i++){
      topline += "=";
    }
    for (var i = 0; i < legs; i++){
      for (var j = 0; j < eachWidth; j++){
        legline += " ";
      }
      legline += "#";
    }

    System.out.println(topline);
    for (var i = 0; i < 5; i++){
      System.out.println(legline);
    }
  }
}
