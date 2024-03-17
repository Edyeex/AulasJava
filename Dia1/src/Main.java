import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

	Scanner nameScanner = new Scanner(System.in);
	System.out.println("Qual eh o seu nome? ");
	String firstName = nameScanner.nextLine();

	Scanner idadeScanner = new Scanner(System.in);
	System.out.println("Digite a sua idade: ");
	byte idadeCliente = idadeScanner.nextByte();

	//Scanner alturaScanner = new Scanner(System.in);
	//System.out.println("Qual a sua altura: ");
	//double altura = alturaScanner.nextDouble();

	Scanner salarioScanner = new Scanner(System.in);
	System.out.println("Qual eh o seu salario? ");
	int salarioMensal = salarioScanner.nextInt();

	System.out.println("Seu nome eh: " + firstName.toUpperCase());
	System.out.println("Voce tem: " + idadeCliente + " anos.");
	//System.out.println("Sua altura eh: " + altura + "m");
	System.out.println("Seu salario eh de: " + salarioMensal + "R$");

  }
}
//byte minhaIdade = 24;
//	String firstName = "Éder" + " Casagranda";
//	int salarioMensal = 50_000;
//	double altura = 1.76;
//
//
//	System.out.println("Meu nome eh: " + firstName.toUpperCase());
//	System.out.println("Minha idade eh: " + minhaIdade + " anos.");
//	System.out.println("Minha altura eh: " + altura + "m");
//	System.out.println("Meu salario mensal eh: " + salarioMensal + "R$ mensais.");