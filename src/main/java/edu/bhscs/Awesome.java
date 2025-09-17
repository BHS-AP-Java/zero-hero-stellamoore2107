package edu.bhscs;

public class Awesome {
  //fields/properties: this is the stuff that awesome has
  String name;



  // we need to Construct something awesome
  public Awesome(String name){
    System.out.println("I am the most awesome " + name);
    this.name = name;
  }

  // METHODS ARE ABILITIES OF THE CLASS/TYPE
  String getName(){
    return this.name;
  }
}
