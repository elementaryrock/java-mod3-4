import java.util.*;
class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
