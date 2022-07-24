public class PatternA {
    public static void main(String[] args){
        int counter = 1;

        while (counter <= 6){
            int counter2 = 1;
            int number = 1;
            while (counter2 <= counter){
                System.out.printf("%d ", number);
                counter2++;
                number++;
            }
            System.out.println();
            counter++;
        }
    }
}
