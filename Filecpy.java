import java.io.*;
class Filecpy {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("file.txt");
            FileOutputStream fout = new FileOutputStream("file2.txt");
            int c;
            while ((c = fin.read()) != -1) {
                fout.write(c);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (Exception e) {   
            System.out.println("Error");
        }
    }
}
