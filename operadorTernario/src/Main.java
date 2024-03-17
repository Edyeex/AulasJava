import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner valorIngresso = new Scanner(System.in);
  	System.out.print("Qual o valor do ingresso? ");
	double valor = valorIngresso.nextDouble();

	String terAcesso = valor >=500 ? "Area VIP" : "PISTA";

	System.out.println(terAcesso);
  }
}