public class Main {
  public static void main(String[] args) {
	System.out.println("Listar os numeros pare de 0 até 100:");
	evenNumbers(20);
  }

  public static void evenNumbers(int numbers) {
	for (int i = 0; i <= 100; i++)
	  if (i % 2 == 0)
		System.out.print(i + " ");
  }
}