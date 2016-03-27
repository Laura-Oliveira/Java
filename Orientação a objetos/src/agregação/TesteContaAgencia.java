package agregacao;

public class TesteContaAgencia 
{

	public static void main(String[] args) 
	{
		Agencia agenciaNovaReferencia = new Agencia();
		Conta conta = new Conta(agenciaNovaReferencia);
		
		conta.agencia = agenciaNovaReferencia;
	
		agenciaNovaReferencia.number = 5;
		
		System.out.println(agenciaNovaReferencia.number);

	}

}
