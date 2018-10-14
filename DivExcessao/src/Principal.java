
public class Principal{
	public static void main(String[] args) {

		try {
			test();
		} catch (DivPorZero e) {}
	}
	
	public static void test() throws DivPorZero{
		int num = 4;
		int denom = 0;
		
		try {
			System.out.println("A divisao de: " + num + "/" + denom + " é: " + num/denom);
		}catch (ArithmeticException e) {
			throw new DivPorZero(num,denom);
		}
	
	}
}
