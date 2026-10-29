class Fruit {
  boolean seadless;
  boolean seasonal;
  float price;

  void setProperties (boolean seed, boolean season, float p) {
    seadless = seed;
    seasonal = season;
    price = p;
  }

  void printProperties() {
    if (seadless) System.out.println("Fruit is seadless");
      else System.out.println("Fruit is seeded");
    if (seasonal) System.out.println("Fruit is seasonal");
      else System.out.println("Fruit is non-seasonal");
    System.out.println("Price is: " + price);
  }
}

class FruitDemo {
  public static void main(String[] args) {
    Fruit f = new Fruit();
    f.setProperties(true, false, 50.0f);
    f.printProperties();
  }
}
