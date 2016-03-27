package deful;

public class Funcionario 
{
	String name;
	double salary = 1000;
	double aumento = 500;
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	double AumentoSalario()
	{
		return this.salary + this.aumento;
	}
	

	void DadoNomeFuncionario(String name)
	{
		this.name = name;
	}
	
	void DadoSalarioFuncionario(double salary)
	{
		this.salary = salary;
	}
}
