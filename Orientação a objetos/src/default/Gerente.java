package deful;

public class Gerente
{
	String name;
	double salario;
	
	void aumentarSalario()
	{
		this.aumentarSalario(0.1);
	}
	
	void aumentarSalario(double taxa)
	{
		this.salario += this.salario * taxa;
	}
}
