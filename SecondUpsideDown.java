public class SecondUpsideDown {
    public static void main(String[] args){
        int counter = 10;

        while (counter >= 1){
            int counter2 = 10;
            int counter3 = 1;
            while (counter2 > counter){
                System.out.print(" ");
                counter2--;
            }
            while (counter3 <= counter){
                System.out.print("*");
                counter3++;
            }
            System.out.println();
            counter--;
        }
    }
}
