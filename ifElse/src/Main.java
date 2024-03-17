import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner valorCarro = new Scanner(System.in);
	System.out.print("Qual é o valor do carro ? R$");
	int valor = valorCarro.nextInt();

	if (valor > 100_000)
	  System.out.println(valor + "R$ ta ficando maluco? não compre, ta caro");
	else if (valor >= 90_000 && valor <= 100_000 ) {
	  System.out.println("Pode comprar, tá no precin...");
	}else
	  System.out.println("Não compre, tá muito suspeito esse preço");
  }
}