import java.util.Scanner;
class Palin
{
  public static void main(String args[])
  {
    System.out.println("Enter String");
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    int i,j=str.length()-1;
    for (i=0;i<str.length();i++)
    {
      if (str.charAt(i)!=str.charAt(j))
        {
        System.out.println("Not a Palindrome string");
        break;
        }
      else
        j--;
    }
    if (i>j)
      System.out.println("Palindrome string");
  }
}
