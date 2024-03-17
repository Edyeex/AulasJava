public class Main {
  public static void main(String[] args) {
      // PriceProduct = $20
      // Comprar somente entre $10 e $15
    int priceProduct = 20;
    boolean buy = priceProduct >= 10 && priceProduct <= 15;
    System.out.println(buy);
    // && = AND

  }
}