
public class LazyEvaluationSingleton 
{

	public static void main(String[] args) 
	{
		ABC obj = ABC.getInstance();
	}

}

class SingletonLazy
{
	private static SingletonLazy obj;
	
	private SingletonLazy()
	{
		System.out.println("Instance Created");
	}
	
	public static SingletonLazy getInstance()
	{
		if (obj == null)
		{
			obj = new SingletonLazy();
			
		}
		return obj;
	}
}