import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int numero = number.nextInt();

    if (numero < 9 && numero >=1){
      System.out.println("Esse numero tem 1 digito.");
    } else if (numero < 100 && numero >= 10) {
      System.out.println("Esse numero tem 2 digitos.");
    } else if (numero < 1000 && numero >=100) {
      System.out.println("Esse numero tem 3 digitos.");
    } else if (numero < 10000 && numero >= 1000) {
      System.out.println("Esse numero tem 4 digitos.");
    } else if (numero < 100000 && numero >= 10000) {
      System.out.println("Esse numero tem 5 digitos.");
    }else
      System.out.println("Esse numero tem 6 digitos ou mais...");

  }
}