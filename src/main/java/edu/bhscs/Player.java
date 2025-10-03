package edu.bhscs;

public class Player {
  // Fields and Properties
  String name;
  Scanner s;

  // Constructor
  public Player player(String name){
    this.name = name;
    this.s = new Scanner(System.in); 
  }

  // Methods

  public void answerQuestions(){
    System.out.println("What's your question? ");
    String question = this.s.next();
    System.out.println( question + " is a dumb question.");
  }

}
