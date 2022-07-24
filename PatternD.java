public class PatternD {
    public static void main(String[] args){
        int counter = 6;

        while (counter >= 1){
            int number = 1;
            int counter2 = 6;
            int counter3 = 1;
            while (counter2 > counter){
                System.out.print("  ");
                counter2--;
            }
            while (counter3 <=  counter){
                System.out.printf("%d ", number);
                number++;
                counter3++;
            }
            System.out.println();
            counter--;
        }
    }
}
