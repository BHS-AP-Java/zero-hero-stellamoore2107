package edu.bhscs;

public class Cake {
  // Properties
  String name;
  String age;
  String line;
  int x;
  int y;
  int candles;


  // I have to make a constructor
  public Cake(String age, String name) {
    this.age = age;
    this.name = name;
  }

  // Methods
  public void findOffset() {
  }

  public void draw(Table t) {

  }

  public void draw(int x, int y, int candles) {

  }

  public void makeLine(int x, int y){
    this.line = "|";
    for (int i = 0; i < x-2; i++){
      this.line += "-";
    }
    this.line += "|";
  }

  public void printLines(int x, int y){
    String topline = "";
    for (int i = 0; i < x; i++){
      topline += "-";
    }

    System.out.println(topline);
    for (int i = 0; i < y-1; i++){
      System.out.println(this.line);
    }
  }

  public void makeCandle(){
    // Fencepost Problem
    while (!(x % candles == 0)){
      x += 1;
    }
  }
}
