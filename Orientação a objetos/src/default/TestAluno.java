package deful;

public class TestAluno 
{

	public static void main(String[] args) 
	{
		Aluno aluno = new Aluno();
		Aluno aluno1 = new Aluno();
		
		aluno.name = "Laura Regina";
		aluno.dataDeNascimento = 15/03/1996;
		aluno.rg = 9098890;
		
		aluno1.name = "Igor Alvim";
		aluno1.dataDeNascimento = 04/04/1993;
		aluno1.rg = 1234532;
		
		System.out.println(aluno.name);
		System.out.println(aluno.dataDeNascimento);
		System.out.println(aluno.rg);
		
		System.out.println(aluno1.name);
		System.out.println(aluno1.dataDeNascimento);
		System.out.println(aluno1.rg);

	}

}
