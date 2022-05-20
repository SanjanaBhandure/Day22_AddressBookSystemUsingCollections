/*
 * The AddressBook Program implements an application that simply
 * displays the Contacts in Address Book that can be modified in certain ways.
 * UC-2: Ability to add a new Contact to Address Book.
 *
 * @author: Sanjana Bhandure
 * @version: 1.2
 * @date: 20-05-2022
 */

package com.bridgelabz.addressBookSystemUsingCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static boolean isRunning = true;
    static Scanner scanner = new Scanner(System.in);

    //ArrayList object is created
    ArrayList<Contact> person = new ArrayList<Contact>();

    /*
     * console method created to read choices from users
     */
    public void console() {
        System.out.println("-----------------");
        System.out.println("1. Create contact");
        System.out.println("2. Exit");
        System.out.println("Enter your choice: ");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                createContact();
                break;

            case 2:
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
    public void createContact() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        contact.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        contact.setLastName(lastName);

        System.out.println("Enter E-mail: ");
        String email = scanner.nextLine();
        contact.setEmail(email);

        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        contact.setAddress(address);

        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        contact.setCity(city);

        System.out.println("Enter State: ");
        String state = scanner.nextLine();
        contact.setState(state);

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        contact.setPhoneNo(phoneNumber);

        System.out.println("Enter Zip: ");
        String zip = scanner.nextLine();
        contact.setZip(zip);

        person.add(contact);
        System.out.println("Contact Added Successfully");
        System.out.println(person.toString());
    }

    public static void main(String[] args) {
        //AddressBookMain object created
        AddressBookMain addressBookMain= new AddressBookMain();
        while (isRunning) {
            addressBookMain.console();
        }
    }
}