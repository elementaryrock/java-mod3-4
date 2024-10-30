import java.io.*;
class Deserialization {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("Serial.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Person p = (Person)in.readObject();
            p.display();
            in.close();
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (Exception e) {   
            System.out.println("Error");
        }
    }
}
