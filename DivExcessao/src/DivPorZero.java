public class DivPorZero extends Exception{
	public DivPorZero(int num,int denom){
		System.out.println("Resultado de " + num + "/" + denom + " falhou.");
	}
}
