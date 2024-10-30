import java.io.*;
class FileMerge
{
  public static void main(String args[])
  {
    try{
      FileInputStream fin1 = new FileInputStream("A.txt");
      FileInputStream fin2 = new FileInputStream("B.txt");
      FileOutputStream fout = new FileOutputStream("C.txt");
      int i;
      while ((i = fin1.read())!=-1)
      {
        fout.write(i);
      }
      while ((i = fin2.read())!=-1)
      {
        fout.write(i);
      }
      fin1.close();
      fin2.close();
      fout.close();
      FileInputStream f = new FileInputStream("C.txt");
      while((i = f.read())!=-1)
      {
        System.out.println((char)i);
      }
      f.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
