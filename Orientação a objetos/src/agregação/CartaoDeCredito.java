package agregacao;

public class CartaoDeCredito 
{
	int number;
	String dataDeValidade;
	Cliente cliente;	
	//classe em que no relacionamento esta do lado muitos, contera o objeto
	//da classe em que no relacionamento esta do lado um
	//agrega�ao muitos -> um
	//explicacao:um cartao possui um cliente
	//mas um cliente pode possuir varios cartoes de credito
	
	CartaoDeCredito(int number)
	{
		this.number = number;
	}
}
