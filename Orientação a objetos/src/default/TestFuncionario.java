package deful;

public class TestFuncionario 
{

	public static void main(String[] args) 
	{
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		
		funcionario.name = "Jose Neto";
		funcionario.salary = 3000;
		funcionario.AumentoSalario();
		
		funcionario1.name = "Ellysangela Rodrigues";
		funcionario1.salary = 3000;
		funcionario.AumentoSalario();
		
		System.out.println(funcionario.name);
		System.out.println(funcionario.AumentoSalario());
		
		System.out.println(funcionario1.name);
		System.out.println(funcionario1.AumentoSalario());

	}

}
