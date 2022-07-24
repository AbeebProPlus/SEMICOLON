public class PatternC {
    public static void main(String[] args){
        int counter = 1;
        int contr = 6;
        int column = 6;
        while (counter <= column){
            int counter2 = 1;
            int counter3 = 1;
            while (counter2 <= (column - counter)){
                System.out.print("  ");
                counter2++;
            }
            while (counter3 <= counter){
                System.out.printf(" %d", 7 - contr);
                counter3++;
                contr++;
            }
            System.out.println();
            contr = column - counter;
            counter++;
        }
    }
}
