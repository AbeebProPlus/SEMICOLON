import java.util.ArrayList;
import java.util.Scanner;

public class SalesStore {
    private static Scanner input = new Scanner(System.in);
    private static String customerName;
    private static ArrayList<String> itemsBought = new ArrayList<>();
    private static ArrayList<Integer> piecesBought = new ArrayList<>();
    private static ArrayList<Double> pricesPerUnit = new ArrayList<>();
    private static String cashierName;
    private static double discount;
    private static double amountPaid;
    private static double total;
    private static double finalPrice;

    public static void main(String[] args) {
        setCustomerName();
        getTransactionDetails();
        transactionSlip();
        collectMoneyForItemsBought();
        receipt();
    }
    public static void setCustomerName(){
        String name = "";
        System.out.println("What is the customer's name");
        name = input.nextLine();
        if (name != ""){
            customerName = name;
        }else{
            System.out.println("Customer name cannot be empty");
            setCustomerName();
        }
    }
    public static String getCustomerName(){
        return customerName;
    }
    public static void itemsBought(){
        System.out.println("What did the customer buy?");
        String itemBought = input.nextLine();
        if (itemBought != "") {
            itemsBought.add(itemBought);
        }else{
            System.out.println("Item bought cannot be empty");
            itemsBought();
        }
    }
    public static void piecesBought(){
        System.out.println("How many pieces?");
        int pieces = input.nextInt();
        if (pieces > 0)
            piecesBought.add(pieces);
        else{
            System.out.println("Pieces cannot be less than 0 or less");
            piecesBought();
        }
    }
    public static void setPricesPerUnit(){
        System.out.println("How much per unit?");
        double pricePerUnit = input.nextDouble();
        if (pricePerUnit > 0)
            pricesPerUnit.add(pricePerUnit);
        else{
            System.out.println("Price cannot be 0 or less");
            setPricesPerUnit();
        }
    }
    public static void collectMoneyForItemsBought(){
        double money = 0.0;
        System.out.println("How much did the customer give to you? ");
        money = input.nextDouble();
        if (money > 0){
            amountPaid = money;
        }else{
            System.out.println("You can't collect negative amount");
            collectMoneyForItemsBought();
        }
    }
    public static double getPaidAmount(){
        return amountPaid;
    }
    public static void getTransactionDetails(){
        itemsBought();
        piecesBought();
        setPricesPerUnit();
        input.nextLine();
        System.out.println("Add more items? yes or no?");
        String reply = input.nextLine();
        switch (reply) {
            case "yes", "YES", "Yes" -> getTransactionDetails();
            default -> {
                setCashierName();
                setDiscount();
            }
        }
    }

    public static void setCashierName(){
        String cashierDetail = "";
        System.out.println("What is your name?");
        cashierDetail = input.nextLine();
        if (cashierDetail != ""){
            cashierName = cashierDetail;
        }else{
            System.out.println("Cashier name cannot be empty");
            setCashierName();
        }
    }
    public static String getCashierName(){
        return cashierName;
    }
    public static void setDiscount(){
        System.out.println("How much discount will he get?");
        discount = input.nextDouble();
    }
    public static double getDiscount(){
        return (discount / 100);
    }
    public static void slipDetails(){
        System.out.printf("SEMICOLON STORES%nMAIN BRANCH%nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS%nTEL: 012345678%n");
        System.out.printf("Date: 20-May-22 5:22:49 pm%nCashier: %s%nCustomer Name: %s%n", getCashierName(), getCustomerName());
        System.out.println("====================================================================");
        System.out.print("                   ");
        System.out.printf("%s%10s%10s%15s%n","ITEM","QTY","PRICE","TOTAL(NGN)");
        System.out.println("--------------------------------------------------------------------");
    }
    public static void transactionSlip(){
        slipDetails();
        for (int item = 0; item < itemsBought.size(); item++) {
            System.out.printf("%22s%11d%11.2f%11.2f%n", itemsBought.get(item),
                    piecesBought.get(item),pricesPerUnit.get(item), (piecesBought.get(item) * pricesPerUnit.get(item)));
        }
        System.out.println("---------------------------------------------------------------------");

        for (int item = 0; item < itemsBought.size(); item++) {
            total += (piecesBought.get(item) * pricesPerUnit.get(item));
        }
        System.out.printf("%50s: %10.2f%n%50s: %10.2f%n%50s: %10.2f%n", "SUB TOTAL", total, "DISCOUNT", total * getDiscount(),
                "VAT @ TOTAL", total * 0.175);
        System.out.println("==========================================================================");
        finalPrice =  total - (total * getDiscount()) + (total * 0.175);
        System.out.printf("%50s: %10.2f%n", "Bill Total", finalPrice);
        System.out.println("==========================================================================");
        System.out.printf("                 THIS IS NOT A RECEIPT KINDLY PAY %.2f%n", finalPrice);
        System.out.println("==========================================================================");
    }
    public static void receipt(){
        slipDetails();
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%50s: %10.2f%n%50s: %10.2f%n%50s: %10.2f%n", "SUB TOTAL", total, "DISCOUNT", total * getDiscount(),
                "VAT @ TOTAL", total * 0.175);
        System.out.println("==========================================================================");
        System.out.printf("%50s: %10.2f%n", "Bill Total", finalPrice);
        System.out.printf("%51s: %9.2f%n", "Amount paid", getPaidAmount());
        double balance = getPaidAmount() - finalPrice;
        System.out.printf("%47s: %11.2f%n", "Balance", balance);
        System.out.println("==========================================================================");
        System.out.println("                   THANK YOU FOR YOUR PATRONAGE");
        System.out.println("==========================================================================");
    }
}
