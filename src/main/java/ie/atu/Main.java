package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    String firstName;
    String Name3, Email3, Course3;
    Scanner scanner = new Scanner(System.in);
    Student user1 = new Student();

    //Student 1
        System.out.print("STUDENT 1\n");
        System.out.print("Enter Student Name: ");
        user1.setName(scanner.nextLine());
        System.out.print("Enter Student Email: ");
        user1.setEmail(scanner.nextLine());
        System.out.print("Enter Student Course: ");
        user1.setCourse(scanner.nextLine());
        System.out.print("\n");


    //displays all information gathered
        user1.displayInfo();
}
    }

