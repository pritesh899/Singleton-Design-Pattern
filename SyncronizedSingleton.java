
//Using synchronized keyword for multiple threads to create a single instance of a class

public class SyncronizedSingleton {
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						SyncronizedGetInstance obj = SyncronizedGetInstance.getInstance();
					}
				});
		
		Thread t2 = new Thread(new Runnable()
				{
					public void run()
					{
						SyncronizedGetInstance obj = SyncronizedGetInstance.getInstance();
					}
				});
		
		t1.start();
		t2.start();
	}
}

class SyncronizedGetInstance
{
	private static SyncronizedGetInstance obj;
	
	private SyncronizedGetInstance()
	{
		System.out.println("Instance Created");
	}
	
	public static synchronized SyncronizedGetInstance getInstance()
	{
		if(obj == null)
		{
			obj = new SyncronizedGetInstance();
		}
		return obj;
	}
}
