
public class NumberPyramid {
    public static void main(String[] args){
        int number = 1;
        int row = 5;
        int column = 9;

        while (row <= column){
            int space = 1;
            int item = 5;
            while (space <= (column - row)){
                System.out.print(" ");
                space++;
            }
            while (item <= ((2 * row) - 5)){
                System.out.print(number);
                item++;
            }
            System.out.println();
            number++;
            row++;
        }
        int numbers = 1;
        for (int rows = 1; rows <= 5; rows++, numbers++){
            for (int spaces = 1; spaces <= (5 - rows); spaces++){
                System.out.print(" ");
            }
            for (int items = 1; items <= ((2 * rows) - 1); items++){
                System.out.print(numbers);
            }
            System.out.println();
        }

    }

}
