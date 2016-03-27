package deful;

public class TestMetodoTransfere 
{

	public static void main(String[] args) 
	{
		Agencia agencia = new Agencia(1234);
		Conta origem = new Conta();
		//Conta origem = new Conta (agencia);
		origem.saldo = 1000;
		
		Conta destino = new Conta();
		destino.saldo = 1000;
		
		origem.transfere(destino, 500);
		
		System.out.println(origem.saldo);
		System.out.println(destino.saldo);
	}

}
