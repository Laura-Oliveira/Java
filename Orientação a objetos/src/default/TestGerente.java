package deful;

public class TestGerente 
{

	public static void main(String[] args) 
	{
		Gerente gerente = new Gerente();
		gerente.salario = 1000;
		
		System.out.println("Salario: "+gerente.salario);
		
		System.out.println("Salario com 10% de aumento: ");
		gerente.aumentarSalario();
		System.out.println("Salario: "+gerente.salario);
		
		System.out.println("Salario com 30% de aumento: ");
		gerente.aumentarSalario(0.30);
		System.out.println("Salario: "+gerente.salario);		

	}

}
