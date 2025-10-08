package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  int skill;
  String name;

  // CONSTRUCTOR
  Baker(Player p) {
    this.p = p;
  }

  // METHODS

  public void learn(int amount){
    this.skill += amount;
  }
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("What kind of cake do you want? ");
    this.skill++;
    return new Cake(answer, this.f, this.skill);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.name);
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.name);
    }
  }

  void getName(){
    this.name = this.p.giveAnswer("What is your name? ");
  }
}
