public class ForPalindrome {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++){
            for (int space = 1; space <= 5 - counter; space++){
                System.out.print(" ");
            }
            int number = 1;
            for (int counter2 = 1; counter2 <= counter; counter2++){
                System.out.print(number);
                number++;
            }
            for (; number >= 1; number--){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
