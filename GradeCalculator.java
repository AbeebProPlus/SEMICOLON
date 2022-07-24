import java.util.Scanner;
import java.util.Arrays;
public class GradeCalculator {
    private static int[][] gradesArray;
    private static int subjects;
    private static Scanner input;
    private static int[] totals;
    private static double[] averages;
    private static int numberOfStudents;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("How many students do you have?: ");
        numberOfStudents = input.nextInt();
        System.out.print("How many subjects does each student do?: ");
        subjects = input.nextInt();
        gradesArray = new int[numberOfStudents][subjects];
        getInputs();
        processGrades();
        subjectSummary();
        classSummary();
    }

    public static void processGrades() {
        boundary();
        System.out.print("STUDENT    ");
        for (int row = 0; row < subjects; row++) {
            System.out.printf("     SUB%d", row + 1);
        }
        System.out.print("   TOT    AVE    POS");
        boundary();
        outputGrades();
        boundary();
        boundary();
    }

    public static void boundary() {
        System.out.println();
        for (int counter = 0; counter < 100; counter++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void getInputs() {

        for (int row = 0; row < gradesArray.length; row++) {
            //System.out.print("Enter student's name: ");
            //input.nextLine();
            for (int column = 0; column < gradesArray[row].length; column++) {
                System.out.printf("Enter the grade of subject%d: ", column + 1);
                int grades = input.nextInt();
                gradesArray[row][column] = grades;
            }
            System.out.println();
        }
    }

    public static void outputGrades() {
        totals = new int[numberOfStudents];
        averages = new double[numberOfStudents];
        for (int row = 0; row < gradesArray.length; row++) {
            int total = 0;
            double average = 0.0;

            System.out.printf("Student %d", row + 1);
            int pos = 0;
            for (int column = 0; column < gradesArray[row].length; column++) {
                total += gradesArray[row][column];
                totals[row] = total;
                average = (double) total / gradesArray.length;
                averages[row] = average;
                pos = getPosition(average);
                System.out.printf("%9d", gradesArray[row][column]);
            }
            System.out.printf("%8d", total);
            System.out.printf("%8.2f", average);
            System.out.printf("%8d", pos);
            System.out.println();
        }
    }
    public static int getPosition(double average){
        Arrays.sort(averages);
        int index = Arrays.binarySearch(averages, average);
        return (index + 1);
    }

    public static void subjectSummary() {
        System.out.println("SUBJECT SUMMARY");
        System.out.printf("Subject %d%n", 1);
        System.out.printf("Highest scoring student is: Student %d scoring %d%n", getHighestScorerIndex(gradesArray),
                getHighestScore(gradesArray));
        System.out.printf("Lowest scoring student is: Student %d scoring %d%n", getLowestScorerIndex(gradesArray),
                getLowestScore(gradesArray));
        System.out.printf("Total score is: %d%n", getSubjectTotalScore(gradesArray));
        System.out.printf("Average score is: %.2f%n", getSubjectAverageScore(gradesArray));
        System.out.printf("Number of passes: %d%n", getPasses(gradesArray));
        System.out.printf("Number of fails: %d%n", getFails(gradesArray));
        System.out.printf("The overall highest score is scored by student %d in subject %d scoring %d%n", highestScoreStudentIndex(gradesArray),
                highestScoreSubjectIndex(gradesArray), highestScore(gradesArray));
        System.out.printf("The overall lowest score is scored by student %d in subject %d scoring %d", lowestScoreStudentIndex(gradesArray),
                lowestScoreSubjectIndex(gradesArray), lowestScore(gradesArray));
        boundary();
    }
    public static void classSummary(){
        System.out.println("CLASS SUMMARY");
        System.out.println("============================================================");
        System.out.printf("Best graduating student is student %d scoring %d%n", bestGraduatingStudentIndex(),
                bestGraduatingStudentScore());
        System.out.println("============================================================");;
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst graduating student is student %d scoring %d%n", worstGraduatingStudentIndex(),
                worstGraduatingStudentScore());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("===========================================================");
        System.out.printf("Class total score is: %d%n", getTotalScore());
        System.out.printf("Class average score is %f%n", getTotalScoreAverage());
        System.out.println("===========================================================");
    }

    public static int bestGraduatingStudentScore(){
        int bestScore = totals[0];
        for (int score = 0; score < totals.length; score++){
            if (totals[score] > bestScore)
                bestScore = totals[score];
        }
        return bestScore;
    }
    public static int bestGraduatingStudentIndex(){
        int index = Arrays.binarySearch(totals, bestGraduatingStudentScore());
        return (index + 1);
    }
    public static int worstGraduatingStudentScore(){
        int worstScore = totals[0];
        for (int score = 0; score < totals.length; score++){
            if (worstScore > totals[score])
                worstScore = totals[score];
        }
        return worstScore;
    }
    public static int worstGraduatingStudentIndex(){
        int index = Arrays.binarySearch(totals, worstGraduatingStudentScore());
        return (index + 1);
    }
    public static int getTotalScore(){
      int totalScore = 0;
      for (int score = 0; score < totals.length; score++)
          totalScore += totals[score];
      return totalScore;
    }
    public static double getTotalScoreAverage(){
        return ((double) getTotalScore() / totals.length);
    }
    public static int getHighestScore(int[][] array) {
        int highest = array[0][0];
        for (int row = 0; row < array.length; row++) {
            if (array[row][0] > highest) {
                highest = array[row][0];
            }
        }
        return highest;
    }

    public static int getHighestScorerIndex(int[][] array) {
        int highest = array[0][0];
        int index = 0;
        for (int row = 0; row < array.length; row++) {
            if (array[row][0] > highest) {
                index = row + 1;
            }
        }
        return index;
    }

    public static int getLowestScore(int[][] array) {
        int lowest = array[0][0];
        for (int row = 0; row < array.length; row++) {
            if (array[row][0] < lowest) {
                lowest = array[row][0];
            }
        }
        return lowest;
    }

    public static int getLowestScorerIndex(int[][] array) {
        int lowest = array[0][0];
        int index = 0;
        for (int row = 0; row < array.length; row++) {
            if (array[row][0] < lowest) {
                index = row + 1;
            }
        }
        return index;
    }

    public static int getSubjectTotalScore(int[][] array) {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            total += array[row][0];
        }
        return total;
    }

    public static double getSubjectAverageScore(int[][] array) {
        return ((double) getSubjectTotalScore(array) / array.length);
    }

    public static int getPasses(int[][] array) {
        int passes = 0;
        for (int row = 0; row < array.length; row++) {
            if (array[row][0] >= 50)
                passes += 1;
        }
        return passes;
    }

    public static int getFails(int[][] array) {
        int fails = 0;
        for (int row = 0; row < array.length; row++) {
            if (array[row][0] < 50)
                fails += 1;
        }
        return fails;
    }

    public static int highestScore(int[][] array) {
        int highestScore = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > highestScore) {
                    highestScore = array[row][column];
                }
            }
        }
        return highestScore;
    }

    public static int highestScoreStudentIndex(int[][] array) {
        int index = 0;
        int highestScore = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > highestScore) {
                    highestScore = array[row][column];
                    index = row;
                }
            }
        }
        return (index + 1);
    }

    public static int highestScoreSubjectIndex(int[][] array) {
        int index = 0;
        int highestScore = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > highestScore) {
                    highestScore = array[row][column];
                    index = column;
                }
            }
        }
        return (index + 1);
    }
    public static int lowestScore(int[][] array) {
        int lowestScore = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] < lowestScore) {
                    lowestScore = array[row][column];
                }
            }
        }
        return lowestScore;
    }
    public static int lowestScoreStudentIndex(int[][] array) {
        int lowestScore = array[0][0];
        int index2 = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (lowestScore > array[row][column]) {
                    lowestScore = array[row][column];
                    index2 = row;
                }
            }
        }
        return (index2 + 1);
    }
    public static int lowestScoreSubjectIndex(int[][] array) {
        int lowestScore = array[0][0];
        int index3 = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (lowestScore > array[row][column]) {
                    lowestScore = array[row][column];
                    index3 = column;
                }
            }
        }
        return (index3 + 1);
    }
}

