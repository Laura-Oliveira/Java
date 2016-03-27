package agregacao;

public class Conta 
{
	int number;
	double saldo;
	double limite;
	Agencia agencia = new Agencia();
	//muitas contas possuem uma agencia
		//enquanto que uma a agencia possuem apenas uma conta
		//muitos -> um
	
	Conta(Agencia agencia)
	{
		this.agencia = agencia;
	}
	
	
}
