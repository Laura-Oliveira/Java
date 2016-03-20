
public class Funcionario 
{
	String name;
	double salary;
	double aumento = 500;
	
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
