class Display extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			if (i%2==0)
				System.out.println(i+" is an even number");
		}
	}
}
class Print implements Runnable
{
	public void run()
	{
		for (int i=0;i<=15;i++)
		{
			if (i%7==0)
				System.out.println(i+" is divisible by 7");
		}
	}
}
class TestMultiThread
{
	public static void main(String args[])
	{
		try
		{
			Display d = new Display();
			Print p = new Print();
			Thread t = new Thread(p);
			d.start();
			t.start();
			d.join();
			t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}