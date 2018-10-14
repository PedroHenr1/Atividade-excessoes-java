
public class ProgramaError {
	public static void main(String[] args) {
		
		try {
			test();
		} catch (ExcessaoIndice e) {
		}
	}

	public static void test() throws ExcessaoIndice{
		int[] vet = {1,2,3};
		
		try {
			System.out.println(vet[3]);
		}catch (IndexOutOfBoundsException e) {
			throw new ExcessaoIndice("O indice nao foi encontrado.");
		}
	
	}
}
