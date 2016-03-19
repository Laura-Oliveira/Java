
public class Fibonacci 
{
	
	static long fibo(int numero)
	{
		if(numero < 2)
		{
			return numero;
		}
		else
		{
			return fibo(numero - 1) + fibo(numero - 2);
		}
	}
	
	public static void main(String[] args) 
	{ 
		for(int i = 0; i < 30; i++) 
		{ 
			System.out.println("(" + i + "):" + Fibonacci.fibo(i)); 
		}
		
	}

		
}
