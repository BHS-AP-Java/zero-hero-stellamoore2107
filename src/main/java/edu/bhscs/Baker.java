package edu.bhscs;

public class Baker {
  public Baker(){
    System.out.println("Baker created");
  }

  public Cake bakecake(){
    return new Cake("whimsy");
  }
}
