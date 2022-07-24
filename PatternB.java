public class PatternB {
    public static void main(String[] args) {
        int counter = 6;

        while (counter >= 1){
            int counter2 = 1;
            int number = 1;
            while (counter2 <= counter){
                System.out.printf("%d ", number);;
                number++;
                counter2++;
            }
            System.out.println();
            counter--;
        }
    }
}
