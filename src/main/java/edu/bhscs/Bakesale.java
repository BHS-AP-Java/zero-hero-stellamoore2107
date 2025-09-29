package edu.bhscs;

public class Bakesale {
  // Constructor
  String name;
  Cake inventory;
  int money;

  public Bakesale(String name) {
    this.name = name;
    System.out.println("Welcome to " + name + " bakesale");
  }

  public void getMoney(){
    System.out.println(name + " bakesale has made " + money + " dollars");
  }
}
