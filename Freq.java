import java.io.*;
class Freq{
	public static void main(String args[]){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.println("Enter string");
			String s = br.readLine();
			System.out.println("Enter the character to be searched");
			char c = (char) br.read();
			int count=0;
			for (int i=0;i<s.length();i++)
			{
				if (c==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println("Frequency is "+count);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}