package agregacao;

public class TestCartaoDeCredito 
{

	public static void main(String[] args) 
	{
		CartaoDeCredito cdc1 = new CartaoDeCredito(11111); 
		cdc1.dataDeValidade = "01/01/2013"; 
		
		CartaoDeCredito cdc2 = new CartaoDeCredito(22222); 
		cdc2.dataDeValidade = "01/01/2014"; 
		
		System.out.println(cdc1.number);
		System.out.println(cdc1.dataDeValidade); 
		System.out.println(cdc2.number);
		System.out.println(cdc2.dataDeValidade);

	}

}
