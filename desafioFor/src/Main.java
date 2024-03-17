public class Main {
  public static void main(String[] args) {
	for (int i = 0; i <= 100; i++) {
	  if (i % 2 == 0 )
		System.out.print(i + " ");
	}
	System.out.println(" ");
	System.out.println(" ");

	for (int j = 0; j <= 100; j++) {
	  if (j % 2 != 0 )
		System.out.print(j + " ");
	}
  }
}