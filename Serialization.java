import java.io.*;
class Person implements Serializable {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Serialization {
    public static void main(String[] args) {
        try{
            Person p = new Person("John", 25);
            FileOutputStream fout = new FileOutputStream("Serial.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(p);
            out.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (Exception e) {   
            System.out.println("Error");
        }
    }
}
