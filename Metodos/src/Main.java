public class Main {
  public static void main(String[] args) {
	productList("Laranja", 10.86);
	productList("Banana", 6.25);

  }

  public static void productList(String productName, Double productValue) {
	System.out.println(productName + " - " + productValue + "R$");

  }
}