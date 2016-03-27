package deful;

public class TestConta 
{

	public static void main(String[] args) 
	{
		Conta c1 = new Conta(); 
		c1.number = 1234; 
		c1.saldo = 1000; 
		c1.limite = 500; 
		
		Conta c2 = new Conta(); 
		c2.number = 5678; 
		c2.saldo = 2000; 
		c2.limite = 250; 
		
		System.out.println(c1.number); 
		System.out.println(c1.saldo); 
		System.out.println(c1.limite);

	}

}
