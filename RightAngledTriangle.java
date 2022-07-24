public class RightAngledTriangle {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10){
            int counter2 = 1;
            while (counter2 <= counter){
                System.out.print("*");
                counter2++;
            }
            System.out.println();
            counter++;
        }
    }
}
