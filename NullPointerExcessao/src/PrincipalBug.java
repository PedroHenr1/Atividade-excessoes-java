
public class PrincipalBug {
	public static void main(String[] args){

		try {
			test();
		} catch (Excessao e) {}
	}
	
	public static void test() throws Excessao{
		String nome = null;
		try {
			System.out.println("O seu nome é: " + nome.toUpperCase());
		}catch (NullPointerException e) {
			throw new Excessao("Erro de execução");
		}
	
	}
}
