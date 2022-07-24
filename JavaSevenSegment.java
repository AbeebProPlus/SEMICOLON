import java.util.Arrays;

public class JavaSevenSegment {
    private static int[][] binaryArray = new int[5][4];

    public static void main(String[] args) {
        input("11011011");
        display();
    }

    public static void segmentA() {
        Arrays.fill(binaryArray[0], 1);
    }

    public static void segmentB() {
        binaryArray[0][3] = 1;
        binaryArray[1][3] = 1;
        binaryArray[2][3] = 1;
    }

    public static void segmentC() {
        binaryArray[2][3] = 1;
        binaryArray[3][3] = 1;
        binaryArray[4][3] = 1;
    }

    public static void segmentD() {
        Arrays.fill(binaryArray[4], 1);
    }

    public static void segmentE() {
        binaryArray[2][0] = 1;
        binaryArray[3][0] = 1;
        binaryArray[4][0] = 1;
    }

    public static void segmentF() {
        binaryArray[0][0] = 1;
        binaryArray[1][0] = 1;
        binaryArray[2][0] = 1;
    }

    public static void segmentG() {
        Arrays.fill(binaryArray[2], 1);
    }

    public static void input(String sevenSegment) {
        char[] array = sevenSegment.toCharArray();
        if (array.length != 8){
            System.out.println("Characters must be eight");
            return;
        }
        for (int i = 0; i < array.length; i++){
            if (!(array[i] == '1' || array[i] == '0')){
                System.out.println("Characters must be 1s and 0s");
                return;
            }
        }
        if (array[array.length - 1] == '0'){
            System.out.println(" ");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '1'){
            switch (i) {
                case 0 -> segmentA();
                case 1 -> segmentB();
                case 2 -> segmentC();
                case 3 -> segmentD();
                case 4 -> segmentE();
                case 5 -> segmentF();
                case 6 -> segmentG();
            }
        }
        }
    }
    public static void display(){
        for (int i = 0; i < binaryArray.length; i++){
            for (int j = 0; j < binaryArray[i].length; j++){
                if (binaryArray[i][j] == 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}