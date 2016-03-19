// Vamos aprender nos próximos capitulos para que serve o import .
import java .io. IOException ;
import java .io. InputStream ;
 import java . util . Scanner ;

class GeradorDePadroes 
{
	public static void main ( String [] args ) 
	{
		int opc =1;
		
		while ( opc !=0) 
		{
			Scanner scanner = new Scanner ( System .in); 
			String valorTela = scanner . nextLine (); 
			opc = Integer . parseInt ( valorTela ); 
			
			if( opc ==1) 
			{
				System.out.println("Opcao 1");
			} 
			else if( opc ==2) 
			{
				System.out.println("Opcao 2");
			} 
			else if( opc ==3) 
			{
				System.out.println("Opcao 3");
			} 
			else if( opc ==4) 
			{
				System.out.println("Opcao 4");
			} 
			else if( opc ==5) 
			{
				System.out.println("Opcao 5");
			}
			
		}
			
	}
	
}