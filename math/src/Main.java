public class Main {
  public static void main(String[] args) {
	//double value  = Math.round(10.2) ; // --- arredonda para cima ou para baixo dependendo do valor depois da ,
	//double value = Math.ceil(10.1); // --- arredonda sempre para cima
	//double value = Math.floor(10.9); // --- arredonda sempre para baixo
	//double value = Math.random(); // gera numeros aleatorios
	int value = (int)Math.round(Math.random() * 100);// gera numeros aleatorios inteiros sem casas decimais
	System.out.println(value);
  }
}