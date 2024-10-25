import java.util.Scanner;

import javax.swing.JOptionPane;

public class Banco {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero da conta");
		int nConta = sc.nextInt();
		System.out.println("Digite a agencia");
		int ag = sc.nextInt();
		
		JOptionPane.showInputDialog("Digite a agencia");
		
		
		Conta conta = new Conta();
		conta.agencia = ag;
		conta.numConta = nConta;
		
		
		Conta conta1 = new Conta();
		conta1.agencia = 5;
		conta1.numConta = 112;
		Conta conta2 = new Conta();
		conta2.agencia = 7;
		conta2.numConta = 234;
		
		conta1.depositar(75);
		conta1.sacar(50);
		conta1.extrato();
	}

}
