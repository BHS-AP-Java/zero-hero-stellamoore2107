package edu.bhscs;

public class WhileLoop {
  public static void main(String[] args) {
    // Example
    boolean data = true;
    int counter = 0;
    while (data) {
      counter++;
      System.out.println(counter);
      if (counter >= 5) {
        data = false;
      }
    }
    System.out.println();
    // Application
    boolean readyForLaunch = false;
    int countdown = 10;
    while (!(readyForLaunch)) {
      if (countdown == 0) {
        System.out.println("Take off!");
        readyForLaunch = true;
        break;
      }
      System.out.println(countdown);
      countdown -= 1;
    }
    int count = 0;
    while (count < 5){
      count++;
      System.out.println(count);
    }
  }
}
