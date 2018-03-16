
public class DoubleCheckedLockingSingleton 
{
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				Singleton1 obj = Singleton1.getInstance();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				Singleton1 obj = Singleton1.getInstance();
			}
		});
		
		t1.start();
		t2.start();
		
	}
}

class Singleton1
{
	private static Singleton1 obj;
	
	private Singleton1()
	{
		System.out.println("Instance Created");
	}
	
	public static Singleton1 getInstance()
	{
		if(obj == null)
		{
			synchronized(Singleton1.class)
			{
				if(obj == null)
				obj = new Singleton1();
			}
			
		}
		
		return obj;
	}
	
	
}
