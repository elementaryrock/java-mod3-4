import java.io.*;
class Names{
	public static void main(String args[]){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.println("Enter string");
			String s[] = new String[5];
			for (int i=0;i<s.length;i++)
			{
				s[i]=br.readLine();
			}
			for(int i=0;i<s.length-1;i++)
			{
				for(int j=0;j<s.length-1-i;j++)
				{
					if (s[j].compareTo(s[j+1])>0)
					{
						String t=s[j];
						s[j]=s[j+1];
						s[j+1]=t;
					}
				}
			}
			System.out.println("The sorted string array is ");
			for (int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
				
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}