import java.util.Arrays;

public class SevenSegment {
    private static int[][] binaryArray = new int[5][4];
    public static void main(String[] args) {
        sevenSegment("11011111");
        display();
    }
    public static void handleSegmentA(){
        Arrays.fill(binaryArray[0], 1);
    }
    public static void handleSegmentB(){
        binaryArray[0][3] = 1;
        binaryArray[1][3] = 1;
        binaryArray[2][3] = 1;
    }
    public static void handleSegmentC(){
        binaryArray[2][3] = 1;
        binaryArray[3][3] = 1;
        binaryArray[4][3] = 1;
    }
    public static void handleSegmentD(){
        Arrays.fill(binaryArray[4], 1);
    }
    public static void handleSegmentE(){
        binaryArray[2][0] = 1;
        binaryArray[3][0] = 1;
        binaryArray[4][0] = 1;
    }
    public static void handleSegmentF(){
        binaryArray[0][0] = 1;
        binaryArray[1][0] = 1;
        binaryArray[2][0] = 1;
    }
    public static void handleSegmentG(){
        Arrays.fill(binaryArray[2], 1);
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
    public static void sevenSegment(String sevenSegment){
        char[] array = sevenSegment.toCharArray();
        if (array[array.length - 1] == '0') {
            System.out.println("");
            return;
        }
        if (array.length != 8){
            System.out.println("Characters can not be less than or greater than 8");
            return;
        }
        for (char c : array) {
            if (!(c == '1' || c == '0')) {
                System.out.println("All inputs must be zero or one!");
                return;
            }
        }
        for (int chr = 0; chr < sevenSegment.length(); chr++) {
            if (sevenSegment.charAt(chr) == '1') {
                switch (chr) {
                    case 0 -> handleSegmentA();
                    case 1 -> handleSegmentB();
                    case 2 -> handleSegmentC();
                    case 3 -> handleSegmentD();
                    case 4 -> handleSegmentE();
                    case 5 -> handleSegmentF();
                    case 6 -> handleSegmentG();
                }
            }
        }
    }
}
