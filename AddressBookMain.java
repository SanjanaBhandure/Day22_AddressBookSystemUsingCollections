/*
 * The AddressBook Program implements an application that simply
 * displays the Contacts in Address Book that can be modified in certain ways.
 * UC-5 : Ability to add multiple person to Address Book
 *
 * @author: Sanjana Bhandure
 * @version: 1.4
 * @date: 20-05-2022
 */

package com.bridgelabz.addressBookSystemUsingCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static boolean isRunning = true;

    //ArrayList object is created
    ArrayList<Contact> person = new ArrayList<Contact>();

    //Taking input from the user
    static Scanner scanner = new Scanner(System.in);

    public void console() {
        System.out.println("-----------------");
        System.out.println("1. Create contact");
        System.out.println("2. Edit Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Print all contacts");
        System.out.println("5. Add multiple person to Address Book");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                createContacts();
                break;

            case 2:
                editContacts();
                break;

            case 3:
                deleteContact();
                break;

            case 4:
                printAllContacts();
                break;

            case 5:
                addMultiplePerson();
                break;

            case 6:
                System.out.println("Exit...");
                isRunning = false;
                break;

            default:
                System.out.println("Enter valid option: ");
                break;
        }
    }

    /*
     * createContacts method created to create contacts with the given fields.
     */
    public void createContacts() {
        Contact contacts = new Contact();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        contacts.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        contacts.setLastName(lastName);

        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        contacts.setAddress(address);

        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        contacts.setCity(city);

        System.out.println("Enter State: ");
        String state = scanner.nextLine();
        contacts.setState(state);

        System.out.println("Enter zip: ");
        String zip = scanner.nextLine();
        contacts.setZip(zip);

        System.out.println("Enter PhoneNumber: ");
        String phoneNumber = scanner.nextLine();
        contacts.setPhoneNo(phoneNumber);

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        contacts.setEmail(email);

        System.out.println("Contact " +firstName+ "created Successfully");
        person.add(contacts);
        System.out.println(person.toString());
    }

    /*
     * editContacts method created to update contacts with the given fields.
     */
    public void editContacts() {
        System.out.println("Enter the name to edit: ");
        String first = scanner.next();

        boolean isPerson = false;

        //for loop used to get the size of array to edit the contact
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getFirstName().equals(first)) {

                isPerson = true;
                System.out.println("Enter your choice to edit: \n1. First Name\n2. Last Name\n3. Address\n4.City\n5. State\n6. Zip\n7. PhoneNumber\n8. Email\n9. Exit ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter First Name: ");
                        String firstName = scanner.next();
                        person.get(i).setFirstName(firstName);
                        break;

                    case 2:
                        System.out.println("Enter Last Name: ");
                        String lastName = scanner.next();
                        person.get(i).setLastName(lastName);
                        break;

                    case 3:
                        System.out.println("Enter Address: ");
                        String address = scanner.next();
                        person.get(i).setAddress(address);

                    case 4:
                        System.out.println("Enter City: ");
                        String city = scanner.next();
                        person.get(i).setCity(city);
                        break;

                    case 5:
                        System.out.println("Enter State: ");
                        String state = scanner.next();
                        person.get(i).setState(state);
                        break;

                    case 6:
                        System.out.println("Enter Zip: ");
                        String zip = scanner.nextLine();
                        person.get(i).setZip(zip);
                        break;

                    case 7:
                        System.out.println("Enter PhoneNumber: ");
                        String phoneNumber = scanner.nextLine();
                        person.get(i).setPhoneNo(phoneNumber);
                        break;

                    case 8:
                        System.out.println("Enter Email: ");
                        String email = scanner.next();
                        person.get(i).setEmail(email);
                        break;

                    default:
                        System.out.println("Select valid option: ");

                } //end of switch
                System.out.println(person);
            }
            if (!isPerson)
                System.out.println("Contact not found!!!");
        }
    } // end of for loop

    /*
     * deleteContacts method created to remove specific contact.
     */
    public void deleteContact() {
        System.out.println("Enter the First Name of the contact that you want to delete: ");
        String firstName = scanner.next();

        for (int i = 0; i< person.size();i++) {
            if (person.get(i).getFirstName().equals(firstName)) {
                person.remove(person.get(i));
                System.out.println("Contact removed successfully!!!");
            }else
                System.out.println("Contact not found.");
        }
    }

    /*
     * addMultiplePerson method created to add multiple person to address Book
     */
    public void addMultiplePerson() {
        while (true) {
            System.out.println("Enter your choice \n1. Create Contact\n2. Edit Contact" +
                    "\n3. To Delete Contact\n4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> createContacts();
                case 2 -> editContacts();
                case 3 -> deleteContact();
                case 4 -> System.out.println("Exit..");
                default -> System.out.println("Invalid Choice");
            }
            if (option == 4)
                break;
        }
    }

    /*
     * printAllContacts method created to print all contacts of AddressBook
     */
    public void printAllContacts() {
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }
    }

    public static void main(String[] args) {
        /*
         * Displaying Welcome to Address Book Program in AddressBookMain class
         */
        System.out.println("Welcome to Address Book Program!");

        //AddressBookMain object created
        AddressBookMain addressBookMain = new AddressBookMain();
        while (isRunning) {
            addressBookMain.console();
        }
    }
}