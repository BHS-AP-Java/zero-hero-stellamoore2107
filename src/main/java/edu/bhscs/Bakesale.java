package edu.bhscs;

public class Bakesale {
  // Fields and properties
  String name;
  Cake inventory;
  double money;

  // Constructor
  public Bakesale(String name) {
    this.name = name;
    System.out.println("Welcome to " + name + " bakesale");
  }

  // Methods
  public void getMoney() {
    System.out.println(name + " bakesale has made " + money + " dollars");
  }
}
