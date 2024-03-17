import java.text.NumberFormat;

public class Main {
  public static void main(String[] args) {
	NumberFormat pound = NumberFormat.getCurrencyInstance();
	String poductValue = pound.format(1120.80);
	System.out.println(poductValue);
  }
}