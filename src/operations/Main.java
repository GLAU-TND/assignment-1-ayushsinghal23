package operations;

import linkedlist.LinkedlistImplement;
import operations.Operations;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedlistImplement linkedlist = new LinkedlistImplement();
        Operations tasks = new Operations();
        System.out.println("Welcome to Ayush's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            tasks.addContact(linkedlist);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 2) {
            tasks.viewcontact(linkedlist);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 3) {
            tasks.searchContact(linkedlist);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 4) {
            tasks.deleteContact(linkedlist);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 5) {
            System.out.println("App terminate");
        }
    }
}

