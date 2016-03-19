package agregação;

public class TestAlunoTurma 
{

	public static void main(String[] args) 
	{
		Aluno aluno = new Aluno();
		Turma turmaNovaReferencia = new Turma();
		
		aluno.turma = turmaNovaReferencia;
		
		turmaNovaReferencia.ensino = "analinse de sistemas";
		turmaNovaReferencia.periodo = 2016.1;
		turmaNovaReferencia.serie = 4;
		turmaNovaReferencia.sigla = "senta e chora";
		
		System.out.println(turmaNovaReferencia.ensino);
		System.out.println(turmaNovaReferencia.periodo);
		System.out.println(turmaNovaReferencia.serie);
		System.out.println(turmaNovaReferencia.sigla);

	}

}
