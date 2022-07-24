
public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 9;
        while (rows <= columns) {
            int space = 1;
            int stars = 5;
            while (space <= (columns - rows)) {
                System.out.print(" ");
                space++;
            }
            while (stars <= (rows * 2) - 5) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            rows++;
        }

        for (int row = 1; row <= 5; row++) {
            for (int spaces = 1;  spaces <= (5 - row); spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= ((2 * row) - 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
