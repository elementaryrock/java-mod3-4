import java.io.*;

class FileWriter {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("file.txt");
            int c;
            while ((c = fin.read())!= -1) {
                System.out.println((char)c);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (Exception e) {
            System.out.println("Error");
        }

    }
}