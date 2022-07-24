import java.util.Scanner;
public class NokiaMenu {
    private static Scanner input = new Scanner(System.in);
    static int number;
    public static void main(String[] args){
        mainMenu();
    }
    public static void mainMenu(){
        System.out.printf("Main menu%n1. Phone book%n2. Messages%n3. Chat%n4. Call register%n5. Tones%n6. Settings%n7. Call divert%n8. Games%n9. Calculator%n10. Reminders%n11. Clock%n12. Profiles%n13. SIM services%n");
        getUserInput();
        switch (number){
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                chat();
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
                break;
            case 9:
                calculator();
                break;
            case 10:
                reminders();
                break;
            case 11:
                clock();
                break;
            case 12:
                profiles();
                break;
            case 13:
                simServices();
                break;
            default:
                mainMenu();

        }
    }
    public static void getUserInput(){
        System.out.print("\nSelect an option: ");
        number = input.nextInt();
    }
    public static void phoneBook(){
        System.out.printf("\nPhone book%n\t1. Search%n\t2. Service Nos.%n\t3. Add name%n\t4. Erase%n\t5. Edit%n\t6. Assign tone%n\t7. Send b'card%n\t8. Options%n\t9. Speed dials%n\t10 Voice tags%n");
        getUserInput();
        switch (number){
            case 8:
                phoneBookOptionsItem();
                break;
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b'card");
                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            default:
                mainMenu();
        }
    }
    public static void phoneBookOptionsItem(){
        System.out.printf("\nPhone book > Phone book options%n\t1. Type of view%n\t2. Memory status%n");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println("Memory status");
                break;
            default:
                phoneBook();
        }
    }
    public static void messages(){
        System.out.printf("\nMessages%n\t1. Write messages%n\t2. Inbox%n\t3. Outbox%n\t4. Picture messages%n\t5. Templates%n\t6. Smileys%n\t7. Message settings%n\t8. Info service%n\t9. Voice mailbox number%n\t10. Service command editor");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Write message");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture message");
                break;
            case 5:
                System.out.println("Template");
                break;
            case 6:
                System.out.println("Smiley");
                break;
            case 7:
                messageSettingsOptions();
                break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            default:
                mainMenu();
        }
    }
    public static void messageSettingsOptions(){
        System.out.printf("\nMessage > Message settings%n\t1. Set%n\t2. Common%n");
        getUserInput();
        switch (number){
            case 1:
                set();
                break;
            case 2:
                common();
                break;
            default:
                messages();
        }
    }
    public static void set(){
        System.out.printf("\nMessage > Message settings > set%n\t\t1.Message center number%n\t\t2.Message sent as%n\t\t3.Message validity");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Message center number");
                break;
            case 2:
                System.out.println("Message sent as");
                break;
            case 3:
                System.out.println("Message validity");
                break;
            default:
                messageSettingsOptions();
        }
    }
    public static void common(){
        System.out.printf("\nMessage > Message settings > common%n\t\t1. Delivery reports%n\t\t2. Reply via same center%n\t\t3. Character support");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Delivery reports");
                break;
            case 2:
                System.out.println("Reply via same center");
                break;
            case 3:
                System.out.println("Character support");
                break;
            default:
                messageSettingsOptions();
        }
    }
    public static void chat(){
        System.out.printf("%nChat%nchat");
    }
    public static void callRegister(){
        System.out.printf("\nCall Register%n\t1. Missed calls%n\t2. Received calls%n\t3. Dialled numbers%n\t4. Erase recent call lists%n" +
                "\t5. Show call duration%n\t6. Show call costs%n\t7. Call cost settings%n\t8.Prepaid credit%n");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                showCallDuration();
                break;
            case 6:
                showCallCosts();
                break;
            case 7:
                callCostSettings();
                break;
            case 8:
                System.out.println("Prepaid credit");
                break;
            default:
                mainMenu();
        }
    }
    public static void showCallDuration(){
        System.out.printf("\nCall Register > Show call duration%n\t\t1. Last call duration%n\t\t2. All call's cost%n\t\t3. Received calls' duration%n" +
                "\t\t4. Dialled calls' duration%n\t\t5. Clear timers%n");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All calls' duration");
                break;
            case 3:
                System.out.println("Received calls' duration");
                break;
            case 4:
                System.out.println("Dialled calls' duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;
            default:
                callRegister();
        }
    }
    public static void showCallCosts(){
        System.out.printf("\nCall register > Show call costs%n\t\t1. Last call cost%n\t\t2. All calls' cost%n\t\t3. Clear counters");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls' cost");
                break;
            case 3:
                System.out.println("Clear counters");
                break;
            default:
                callRegister();
        }
    }
    public static void callCostSettings(){
        System.out.printf("\tCall register > Call cost settings%n\t\t1. Call cost limit%n\t\t2. Show cost in%n");
        getUserInput();
        switch(number){
            case 1:
                System.out.println("Call cost limit");
                break;
            case 2:
                System.out.println("Show cost in");
                break;
            default:
                callRegister();
        }
    }
    public static void tones(){
        System.out.printf("Tones%n\t1. Ringing tone%n\t2. Ringing volume%n\t3. Incoming call alert%n\t4. Composer%n" +
                "\t5. Message alert tone%n\t6. Keypad tones%n\t7. Warning and game tones%n\t8. Vibrating alert%n\t9. Screen saver%n");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and game tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
            default:
                mainMenu();
        }
    }
    public static void settings(){
        System.out.printf("Settings%n\t1. Call settings%n\t2. Phone settings%n\t3. Security settings%n\t4. Restore factory settings%n");
        getUserInput();
        switch (number){
            case 1:
                callSettings();
                break;
            case 2:
                phoneSettings();
                break;
            case 3:
                securitySettings();
                break;
            case 4:
                System.out.println("Restore factory settings");
                break;
            default:
                mainMenu();
        }
    }
    public static void callSettings(){
        System.out.printf("\nSettings > Call settings%n\t\t1. Automatic redial%n\t\t2. Speed dialling%n\t\t3. Call waiting options" +
                "%n\t\t4. Own number sending%n\t\t5. Phone line in use%n\t\t6. Automatic answer");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialling");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own number sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;
            default:
                settings();
        }
    }
    public static void phoneSettings(){
        System.out.printf("\nSetings > Phone settings%n\t\t1. Language%n\t\t2. Cell info display%n\t\t3. Welcome note%n" +
                "\t\t4. Network selection%n\t\t5. Lights%n\t\t6. Confirm SIM service actions%n");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service settings");
                break;
            default:
                settings();
        }
    }
    public static void securitySettings(){
        System.out.printf("Settings > Security settings%n\t\t1. PIN code request%n\t\t2. Call barring service%n" +
                "\t\t3. Fixed calling%n\t\t4. Closed user group%n\t\t5. Phone security%n\t\t6. Change access codes");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("PIN code request");
                break;
            case 2:
                System.out.println("Call barring service");
                break;
            case 3:
                System.out.println("Fixed dialling");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println("Phone security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;
            default:
                settings();
        }
    }
    public static void callDivert(){
        System.out.println("Call divert");
    }
    public static void games(){
        System.out.println("Games");
    }
    public static void calculator(){
        System.out.println("\nCalculator");
    }
    public static void reminders(){
        System.out.println("\nReminder");
    }
    public static void clock(){
        System.out.printf("\nClock%n\t1. Alarm clock%n\t2. Clock settings%n" +
                "\t3. Date settings%n\t4. Stopwatch%n\t5. Countdown timer%n\t6.Auto update of date and time%n");
        getUserInput();
        switch (number){
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date settings");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            default:
                mainMenu();
        }
    }
    public static void profiles(){
        System.out.println("Profiles");
    }
    public static void simServices(){
        System.out.println("SIM servies");
    }
}
