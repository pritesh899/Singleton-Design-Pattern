public class Singleton 
{

	public static void main(String[] args) 
	{
		ABC obj = ABC.getInstance();
		ABC obj1 = ABC.getInstance();
	}

}

class ABC
{
	private static ABC  obj = new ABC();;
	
	private ABC()
	{
		System.out.println("Instance Created");
	}
	
	public static ABC getInstance()
	{
		
		return obj;
	}
}
