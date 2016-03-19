package agregação;

public class TestClient 
{

	public static void main(String[] args) 
	{
		Cliente c1 = new Cliente(); 
		c1.name = "Rafael Cosentino"; 
		c1.code = 1; 
		Cliente c2 = new Cliente(); 
		c2.name = "Jonas Hirata"; 
		c2.code = 2; 
		System.out.println(c1.name); 
		System.out.println(c1.code); 
		System.out.println(c2.name); 
		System.out.println(c2.code);

	}

}
