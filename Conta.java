
public class Conta {
	int numConta;
	int agencia;
	double saldo;
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void extrato( ) {
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numConta);
		System.out.println("Saldo: " + saldo);
	}

}
