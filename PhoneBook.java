import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private static  Scanner input = new Scanner(System.in);
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<String> addresses = new ArrayList<>();
    private static ArrayList<String> phoneNumbers = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();

    public static void main(String[] args) {
        enterContactDetails();

    }
    public static void getName(){
        String name = "";
        System.out.print("Enter a name: ");
        name = input.nextLine();
        if (name != "")
            names.add(name);
        else{
            System.out.println("Name cannot be empty");
            getName();
        }
    }

    public static void getPhoneNumber(){
        String phoneNumber = "";
        System.out.print("Enter phone number: ");
        phoneNumber = input.nextLine();
        if (phoneNumber != "")
            phoneNumbers.add(phoneNumber);
        else{
            System.out.println("PhoneNumber cannot be empty");
            getPhoneNumber();
        }
    }
    public static void getAddress() {
        String address = "";
        System.out.print("Enter address: ");
        address = input.nextLine();
        addresses.add(address);
    }
    public static void getEmail(){
        String email = "";
        System.out.print("Enter email address: ");
        email = input.nextLine();
        emails.add(email);
    }
    public static void enterContactDetails(){
        getName();
        getAddress();
        getPhoneNumber();
        getEmail();
        System.out.println("Add more contacts? yes or no? ");
        String reply = input.nextLine();
        switch (reply) {
            case "yes", "Yes", "YES" -> enterContactDetails();
            default -> showPhoneBook();
        }
    }
    public static void showPhoneBook(){
        System.out.println();
        for (int detail = 0; detail < names.size(); detail++){
            System.out.println("=========================================");
            System.out.printf("Name: %s%n", names.get(detail));
            System.out.println("-----------------------------------------");
            System.out.printf("Address: %s%n", addresses.get(detail));
            System.out.println("-----------------------------------------");
            System.out.printf("Telephone: %s%n", phoneNumbers.get(detail));
            System.out.println("-----------------------------------------");
            System.out.printf("Email: %s%n", emails.get(detail));
            System.out.println("=========================================");
            System.out.println();
        }
    }
}
