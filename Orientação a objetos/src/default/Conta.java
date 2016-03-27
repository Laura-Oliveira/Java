package deful;

public class Conta
{
	int number;
	double saldo;
	double limite;
	
	void deposita(double valor)
	{
		this.saldo+=valor;
	}
	
	void saca(double valor)
	{
		this.saldo-=valor;
	}
	
	void imprimeExtrato()
	{
		System.out.println("Saldo "+this.saldo);
	}
	
	double consultaSaldoDisponivel()
	{
		return this.saldo + this.limite;
		
	}
	
	void transfere(Conta destino,double valor)
	{
		this.saldo = valor;
		destino.saldo = valor;
	}
}
