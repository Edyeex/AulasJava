import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

	Scanner numberOne = new Scanner(System.in);
	System.out.print("Digite o primeiro numero: ");
	double primeiroNumero = numberOne.nextDouble();

	Scanner numbertwo = new Scanner(System.in);
	System.out.print("Digite o segundo numero: ");
	double segundoNumero= numbertwo.nextDouble();

	double soma = primeiroNumero + segundoNumero;
	System.out.println("O primeiro numero eh: " + primeiroNumero);
	System.out.println("O segundo numero eh: " + segundoNumero);
	System.out.println("A soma dos numeros eh: " + soma);

  }
}