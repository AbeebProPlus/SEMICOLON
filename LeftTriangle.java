public class LeftTriangle {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10){
            int counter2 = 1;
            int counter3 = 1;
            while (counter2 <= (10 - counter)){
                System.out.print(" ");
                counter2++;
            }
            while (counter3 <= counter){
                System.out.print("*");
                counter3++;
            }
            System.out.println();
            counter++;
        }
    }
}
