package edu.bhscs;

public class Baker {
  // Fields/properties
  String name;
  double money;
  int cakesBaked;
  int cookiesBaked;
  int experience;

  // Constructor (something that makes an instance of the class)
  public Baker(String name) {
    this.name = name;
    this.money = 0;
    this.cakesBaked = 0;
    System.out.println(
        "My name is "
            + name
            + " the baker, I have "
            + money
            + " dollars and I have made "
            + cakesBaked
            + " cakes.");
  }

  // Methods
  public void bakerStatus() {
    System.out.println(
        "My name is "
            + name
            + " the baker, I have "
            + money
            + " dollars, I have baked "
            + cakesBaked
            + " cakes and "
            + cookiesBaked
            + " cookies.");
  }

  public Cake bakecake(
      String chosenIngredient, int cost, Baker baker, Bakesale bakesale, Flour flour) {
    this.experience += 1;
    return new Cake(chosenIngredient, cost, baker, bakesale, flour);
  }

  public Cookies bakeCookies(
      String ingredient, int batchAmount, Flour flour, Baker baker, Bakesale bakesale) {
    this.experience += 1;
    this.cookiesBaked += batchAmount;
    return new Cookies(ingredient, batchAmount, flour, baker, bakesale);
  }
}
