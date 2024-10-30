class Multiply
{
	public synchronized void display(int n)
	{
		for (int i=1;i<=n;i++)
			System.out.println(n+"*"+i+"="+(n*i));
	}
}

class MyClass1 extends Thread
{
	private Multiply t;
	public MyClass1(Multiply t)
	{
		this.t = t;
	}
	public void run()
	{
		t.display(3);
	}
}

class MyClass2 extends Thread
{
	private Multiply t;
	public MyClass2(Multiply t)
	{
		this.t=t;
	}
	public void run()
	{
		t.display(4);
	}
}
class ThreadSync
{
	public static void main(String args[])
	{
		Multiply obj = new Multiply();
		MyClass1 m = new MyClass1(obj);
		MyClass2 n = new MyClass2(obj);
		m.start();
		n.start();
	}
}