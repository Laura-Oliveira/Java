
public class TestTurma 
{

	public static void main(String[] args) 
	{
		Turma turma = new Turma();
		Turma turma1 = new Turma();
		
		turma.ensino = "analise de sistemas";
		turma.periodo = 2016.1;
		turma.serie = 6;
		turma.sigla = "treinamento dificil combate facil";
		
		turma1.ensino = "analise de sistemas";
		turma1.periodo = 2016.1;
		turma1.serie = 4;
		turma1.sigla = "senta e chora";
		
		System.out.println(turma.ensino);
		System.out.println(turma.periodo);
		System.out.println(turma.serie);
		System.out.println(turma.sigla);
		
		System.out.println(turma1.ensino);
		System.out.println(turma1.periodo);
		System.out.println(turma1.serie);
		System.out.println(turma1.sigla);
		

	}

}
