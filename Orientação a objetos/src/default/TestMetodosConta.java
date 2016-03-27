package deful;

public class TestMetodosConta 
{

	public static void main(String[] args) 
	{
		Conta conta = new Conta();
		
		conta.deposita(1000);
		conta.imprimeExtrato();
		conta.saca(500);
		conta.imprimeExtrato();
		
		double saldoDisponivel = conta.consultaSaldoDisponivel();
		
		System.out.println("Saldo disponivel "+saldoDisponivel);

	}

}
