package edu.bhscs;

import java.util.Scanner;

public class Player {
  // Fields and Properties
  String name;
  Scanner s;
  int accomplishments;

  // Constructor
  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  // Methods
  public void accomplish(int amount) {
    this.accomplishments += amount;
  }

  public void answerQuestions() {
    System.out.println("What's your question? ");
    String question = this.s.next();
    System.out.println(question + " is a dumb question.");
  }

  public String giveAnswer(String question) {
    System.out.println(question);
    return s.nextLine();
  }
  ;
}
