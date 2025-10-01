// This is a customer that can spend money to buy cakes from the bakesale and eat them.

package edu.bhscs;

public class Customer {
  // Properties
  String name;
  int money;
  String feeling;
  Cake cake;
  Cookies cookies;
  double commission;

  public Customer(String chosenName, int givenMoney) {
    name = chosenName;
    money = givenMoney;
    feeling = "hungry";
    System.out.println(
        "Hey, my name is " + name + ", I am " + feeling + ", and I have " + money + " dollars");
  }

  public void purchaseCake(Cake cakeToPurchase, Customer buyer) {
    cakeToPurchase.owner = buyer;
    money = money - cakeToPurchase.cost;
    commission = cakeToPurchase.cost / 5;
    cake = cakeToPurchase;
    cakeToPurchase.bakesale.money += (cakeToPurchase.cost - commission);
    cakeToPurchase.baker.cakesBaked += 1;
    cakeToPurchase.baker.money += commission;
    System.out.println(
        "I, "
            + buyer.name
            + ", just bought a cake made with "
            + cakeToPurchase.ingredient
            + " that costed "
            + cakeToPurchase.cost
            + " dollars. I now have "
            + money
            + " dollars");
  }

  public void purchaseCookies(Cookies cookiesToPurchase, Customer buyer) {
    cookiesToPurchase.owner = buyer;
    money = money - cookiesToPurchase.cost;
    commission = cookiesToPurchase.cost / 10;
    cookies = cookiesToPurchase;
    cookiesToPurchase.bakesale.money += (cookiesToPurchase.cost - commission);
    cookiesToPurchase.baker.cakesBaked += 1;
    cookiesToPurchase.baker.money += commission;
    System.out
        .println("I, " + buyer.name + ", just bought a batch of cookies made with " + cookiesToPurchase.ingredient
            + " that costed " + cookiesToPurchase.cost + " dollars. I now have " + money + " dollars");
  }

  public void eatCake() {
    cake.weight -= 2;
    feeling = "full";
  }

  public void eatCookies(){
    cookies.batchAmount -= 2;
    feeling = "full";
  }
  public void statusCheck() {
    System.out.println(
        "My name is "
            + name
            + ", I have "
            + money
            + " dollars, and I feel "
            + feeling
            + ".");
  }
}
