class TestRun
{
	public static void main(String args[])
	{
		try
		{
			int a=10,b=0;
			int c = a/b;
			System.out.println("Ans  = "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Execution ends here");
		}
	}
}