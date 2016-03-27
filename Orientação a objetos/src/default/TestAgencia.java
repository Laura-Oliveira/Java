package deful;

public class TestAgencia 
{

	public static void main(String[] args) 
	{
		Agencia a1 = new Agencia(1234); 
		a1.number = 1234; 
		Agencia a2 = new Agencia(5678); 
		a2.number = 5678; 
		System.out.println(a1.number); 
		System.out.println(a2.number);

	}

}
