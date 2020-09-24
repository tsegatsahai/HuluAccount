import java.util.Scanner;

public class Main {
    public static void main(String [] arg){

        ContactsDAO contactList = new ContactsDAO();
        Contact user1 = new Contact("John","Snow",123456789,"deep@deep.com");
        Contact user2 = new Contact("Jamie","Lannister",123456789,"deep@deep.com");
        Contact user3 = new Contact("Tyrion","Lannister",123456789,"deep@deep.com");

        contactList.addContact(user1);
        contactList.addContact(user2);
        contactList.addContact(user3);
        contactList.printContacts();
        System.out.println("__________________________________________");
        contactList.updateContact(user1);
        System.out.println("__________________________________________");
        contactList.printContacts();
        contactList.removeContact("Jamie");
        System.out.println("__________________________________________");
        contactList.printContacts();


    }

}
