import java.io.*;
class Vowels{
	public static void main(String args[]){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			System.out.println("Enter string");
			String s = br.readLine();
			int v=0,cons=0;
			for (int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if ((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
				{
					v++;
				}
				else
					cons++;
			}
			System.out.println("Vowels: "+v);
			System.out.println("Consonants: "+cons);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}