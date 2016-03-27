package agregacao;

public class TestaCienteCartao 
{

	public static void main(String[] args) 
	{
		CartaoDeCredito cartao = new CartaoDeCredito(11111);
		Cliente clienteNovaReferencia = new Cliente();
				
		cartao.cliente = clienteNovaReferencia; //o objeto cartao acessa a referencia do objeto cliente
								   //por meio da variavel cliente, e esta referencia
								   //� colocada na variavel cliente1 (outro objeto)
		//resumindo, eu pego a refenrencia de um objeto (objeto cliente), 
		//e coloco essa referencia em outro objeto (cliente1)
		//uma especie de ponteiro em Java
		clienteNovaReferencia.name = "Laura Regina";
		clienteNovaReferencia.code = 11111;
		
		System.out.println(clienteNovaReferencia.name);
		System.out.println(clienteNovaReferencia.code);

	}

}
