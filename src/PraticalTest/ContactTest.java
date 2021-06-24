package PraticalTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactTest {
    public static void main(String[] args){
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("1. Add a new contact");
            System.out.println("2. Display contacts");
            System.out.println("3. Find a contact by name");
            System.out.println("4. Exit");
            System.out.println("Enter Your choice: ");

            int choice =in.nextInt();
            in.nextLine();
            switch (choice){
                case 1 :
                    System.out.println("Enter Your Name : ");
                    String n =in.nextLine();
                    System.out.println("Enter Your Phone Number: ");
                    String nu =in.nextLine();
                    System.out.println("Enter Your Email address: ");
                    String e =in.nextLine();
                    System.out.println("Enter Your Company: ");
                    String co =in.nextLine();
                    contacts.add(new Contact(n,nu, e,co));
                    break;
                case 2:
                    for(int i=0;i<contacts.size();i++){
                        Contact c = contacts.get(i);
                        System.out.println("Name :"+ c.getName());
                        System.out.println("Phone Number: "+ c.getNum());
                        System.out.println("Email: "+ c.getemail());
                        System.out.println("Company: " +c.getCom());
                    }
                    break;
                case 3:
                    System.out.println("Enter an information piece about person:");
                    String info = in.nextLine();
                    Contact c = findPerson(contacts, info);
                    if(c != null)
                    {
                        System.out.print("Name :"+ c.getName());
                        System.out.print("Phone number: " + c.getNum());
                        System.out.print("Email: " + c.getemail());
                        System.out.print("Company: " +c.getCom());
                        System.out.println();
                    }
                    else
                        System.out.println("Contact not found.");

                    break;

            }
            if(choice == 4)
                break;

            System.out.println("___________________________________________");
        }
    }
    private static Contact findPerson(ArrayList<Contact> contacts, String info)
    {
        Contact c = null;
        for(int i = 0; i < contacts.size(); i++)
        {
            if(contacts.get(i).getName().contains(info))
                c = contacts.get(i);

            if(contacts.get(i).getCom().contains(info))
                c = contacts.get(i);

            if(contacts.get(i).getNum().contains(info))
                c = contacts.get(i);

            if(contacts.get(i).getemail().contains(info))
                c = contacts.get(i);
        }
        return c;
    }
}
