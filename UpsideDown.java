public class UpsideDown {
    public static void main(String[] args){
        int counter = 10;

        while (counter >= 1){
            int counter2 = 1;
            while (counter2 <= counter){
                System.out.print("*");
                counter2++;
            }
            System.out.println();
            counter--;
        }
    }
}
