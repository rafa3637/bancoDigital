
public class contaCorrent extends conta{
	
	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Corrente ===");
		super.imprimirInfoComuns();
	}
}
