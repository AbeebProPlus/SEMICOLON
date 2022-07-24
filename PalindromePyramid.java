public class PalindromePyramid {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5){
            int counter2 = 1;
            int number = 1;
            int space = 1;
            while (space <= 5 - counter){
                System.out.print(" ");
                space++;
            }
            while (counter2 <= counter) {
                System.out.print(number);
                number++;
                counter2++;
            }
            while (number >= 1){
                System.out.print(number--);
            }
            System.out.println();

            counter++;
        }

    }
}
