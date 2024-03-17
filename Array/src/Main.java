import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

	//integers ... numeros
	int[] valores = {10, 20, 15, 30, 40};
	Arrays.sort(valores); // Organiza em ordem numerica
    System.out.println(Arrays.toString(valores));
	System.out.println(valores.length);

	// Strings ... nomes, palavras...
	String[] cars = {"BMW", "Ford", "Dodge", "Opel", "McLaren", "Koenigsegg", "Hennessey"};
	cars[3] = "Lotus";
	Arrays.sort(cars); // Organiza em ordem alfabetica
	System.out.println(Arrays.toString(cars));
	System.out.println(cars[5]);

	// Multidimensionais

	String[][] cars2 = {{"BMW", "Ford", "Dodge", "Bugatti"}, {"Opel", "McLaren", "Koenigsegg", "Hennessey"}};
	System.out.println(Arrays.deepToString(cars2));
  }
}