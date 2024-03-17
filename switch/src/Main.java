import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	// coletar o nome do produto
	System.out.print("digite o nome do produto: ");
	Scanner s = new Scanner(System.in);
	String produto = s.next().toLowerCase();

	// retornar o nome do produto
	switch (produto) {
	  case "banana":
		System.out.println("R$6.45");
		break;
	  case "uva":
		System.out.println("R$14.45");
		break;
	  case "laranja":
		System.out.println("R$3.85");
		break;
	  case "tomate":
		System.out.println("R$3.25");
		break;
	  case "abacate":
	  System.out.println("R$8.60");

	}

  }
}