package day.thirteen;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Api api = new Api();

        System.out.println("---------Welcome to Customer Management System---------");

        while (true) {

            System.out.println("\n1. Add Customer");
            System.out.println("2. Fetch Customers by DOB");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Customer ID: ");
                    String id = sc.next();

                    System.out.print("Customer Name: ");
                    String name = sc.next();

                    System.out.print("DOB (yyyy-mm-dd): ");
                    String dob = sc.next();

                    System.out.print("Contact No: ");
                    String contact = sc.next();

                    api.insertRecord(id, name, dob, contact);
                    break;

                case 2:

                    System.out.print("Enter DOB (yyyy-mm-dd): ");
                    String searchDob = sc.next();

                    api.findByDOB(searchDob);
                    break;

                case 3:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}