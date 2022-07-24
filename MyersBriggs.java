import java.util.Scanner;

public class MyersBriggs {
    private static Scanner input = new Scanner(System.in);
    private static int countA1 = 0;
    private static int countB1 = 0;
    private static int countA2 = 0;
    private static int countB2 = 0;
    private static int countA3 = 0;
    private static int countB3 = 0;
    private static int countA4 = 0;
    private static int countB4 = 0;


    public static void main(String[] args) {
        System.out.println("MYERS-BRIGGS Questionnaire");
        firstQuestions();
        System.out.println("======================================================================");
        secondQuestions();
        System.out.println("======================================================================");
        thirdQuestions();
        System.out.println("======================================================================");
        fourthQuestions();
        resultSheet();
        System.out.println("================================================================================");
    }
    public static void firstQuestions(){
        System.out.println("Select option A or B");
        System.out.print("A - expend energy, enjoy groups");
        System.out.print("   |   ");
        System.out.println("B - conserve energy, enjoy one-on-one");
        String choice = input.next();
        getOptions(choice);

        System.out.print("A - more outgoing, think out loud");
        System.out.print("   |   ");
        System.out.println("B - more reserved, think to yourself");
        String choice2 = input.next();
        getOptions(choice2);

        System.out.print("A - seek many tasks, public activities, interaction with others");
        System.out.print("   |   ");
        System.out.println("B - seek private, solitary activities with quiet to concentrate");
        String choice3 = input.next();
        getOptions(choice3);

        System.out.print("A - external, communicative, express yourself");
        System.out.print("   |   ");
        System.out.println("B - internal, reticent, keep to yourself");
        String choice4 = input.next();
        getOptions(choice4);

        System.out.print("A - active, initiate");
        System.out.print("   |   ");
        System.out.println("B - reflective, delibrate");
        String choice5 = input.next();
        getOptions(choice5);
    }
    public static void getOptions(String choice){
        switch (choice) {
            case "A", "a" -> countA1++;
            default -> countB1++;
        }
    }
    public static String getFirstResult(){
        String firstResult = "";
        if (countA1 > countB1)
            firstResult = "E";
        else
            firstResult = "I";
        return firstResult;
    }
    public static void secondQuestions(){
        System.out.println("Select option A or B");
        System.out.print("A - interpret literally");
        System.out.print("   |   ");
        System.out.println("B - look for meaning and possibilities");
        String choice = input.next();
        getOptions2(choice);

        System.out.print("A - practical, realistic, experiential");
        System.out.print("   |   ");
        System.out.println("B - imaginative, innovative, theoretical");
        String choice2 = input.next();
        getOptions2(choice2);

        System.out.print("A - standard, usual, conventional");
        System.out.print("   |   ");
        System.out.println("B - different, novel, unique");
        String choice3 = input.next();
        getOptions2(choice3);

        System.out.print("A - focus on here and now");
        System.out.print("   |   ");
        System.out.println("B - look to the future, global perspective, big picture");
        String choice4 = input.next();
        getOptions2(choice4);

        System.out.print("A - facts, things, \"what is\"");
        System.out.print("   |   ");
        System.out.println("B - ideas, dreams, \"what could be\", philosophical");
        String choice5 = input.next();
        getOptions2(choice5);
    }
    public static void getOptions2(String choice){
        switch (choice) {
            case "A", "a" -> countA2++;
            default -> countB2++;
        }
    }
    public static String getSecondResult(){
        String secondResult = "";
        if (countA2 > countB2)
            secondResult = "S";
        else
            secondResult = "N";
        return secondResult;
    }
    public static void thirdQuestions(){
        System.out.println("Select option A or B");
        System.out.print("A - logical, thinking, questioning");
        System.out.print("   |   ");
        System.out.println("B - empathetic, feeling, accomodating");
        String choice = input.next();
        getOptions3(choice);

        System.out.print("A - candid, straight forward, frank");
        System.out.print("   |   ");
        System.out.println("B - tactful, kind, encouraging");
        String choice2 = input.next();
        getOptions3(choice2);

        System.out.print("A - firm, tend to criticize, hold the line");
        System.out.print("   |   ");
        System.out.println("B - gentle, tend to appreciate, concillate");
        String choice3 = input.next();
        getOptions3(choice3);

        System.out.print("A - tough-minded, just");
        System.out.print("   |   ");
        System.out.println("B - tender-hearted, merciful");
        String choice4 = input.next();
        getOptions3(choice4);

        System.out.print("A - matter of fact, issue-oriented");
        System.out.print("   |   ");
        System.out.println("B - sensitive, people-oriented, compassionate");
        String choice5 = input.next();
        getOptions3(choice5);
    }
    public static void getOptions3(String choice) {
        switch (choice) {
            case "A", "a" -> countA3++;
            default -> countB3++;
        }
    }
    public static String getThirdResult(){
        String thirdResult = "";
        if (countA3 > countB3)
            thirdResult = "T";
        else
            thirdResult = "F";
        return thirdResult;
    }
    public static void fourthQuestions(){
        System.out.println("Select option A or B");
        System.out.print("A - organized, orderly");
        System.out.print("   |   ");
        System.out.println("B - flexible, adaptable");
        String choice = input.next();
        getOptions4(choice);

        System.out.print("A - plan, schedule");
        System.out.print("   |   ");
        System.out.println("B - unplanned, spontenous");
        String choice2 = input.next();
        getOptions4(choice2);

        System.out.print("A - regulated, structured");
        System.out.print("   |   ");
        System.out.println("B - easygoing, \"live\", and \"let live\"");
        String choice3 = input.next();
        getOptions4(choice3);

        System.out.print("A - preparation, plan ahead");
        System.out.print("   |   ");
        System.out.println("B - go with flow, adapt as you go");
        String choice4 = input.next();
        getOptions4(choice4);

        System.out.print("A - control, govern");
        System.out.print("   |   ");
        System.out.println("B - latitude, freedom");
        String choice5 = input.next();
        getOptions4(choice5);

    }
    public static void getOptions4(String choice) {
        switch (choice) {
            case "A", "a" -> countA4++;
            default -> countB4++;
        }
    }
    public static String getFourthResult(){
        String fourthResult = "";
        if (countA4 > countB4)
            fourthResult = "J";
        else
            fourthResult = "P";
        return fourthResult;
    }
    public static void resultSheet(){
        System.out.println();
        System.out.println("                 RESULT TABLE");
        System.out.println("=============================================");
        System.out.printf("%s%10s%10s%10s%n", "A  B", "A  B", "A  B", "A  B");
        System.out.println("=============================================");
        System.out.printf("%d%3d%7d%3d%7d%3d%7d%3d%n", countA1, countB1, countA2, countB2, countA3, countB3, countA4, countB4);
        System.out.printf("%s%10s%10s%10s%n", "E  I", "S  N", "T  F", "J  P");
        System.out.println("=============================================");
        System.out.printf("%3s%9s%10s%10s%n", getFirstResult(), getSecondResult(), getThirdResult(), getFourthResult());
        System.out.println("=============================================");
        String result = getFirstResult() + getSecondResult() + getThirdResult() + getFourthResult();
        switch (result) {
            case "INFP" -> {
                System.out.println("\t\t\tINFP: Mediator");
                System.out.println("You are Poetic, kind, and altrusic, always eager to help a good cause");
            }
            case "INTJ" -> {
                System.out.println("\t\t\tINTJ: Architect");
                System.out.println("You are Imaginative and a strategic thinker, with a plan for everything");
            }
            case "INTP" -> {
                System.out.println("\t\t\tINTP: Logician");
                System.out.println("You are an innovative inventor with an unquenchable thirst for knowledge");
            }
            case "ENTJ" -> {
                System.out.println("\t\t\tENTJ: Commander");
                System.out.println("You are a bold, imaginative and strong-willes leader, always finding a way or making one");
            }
            case "ENTP" -> {
                System.out.println("\t\t\tENTP: Debater");
                System.out.println("You are a smart and a curious thinker who cannot resist an intellectual challenge");
            }
            case "INFJ" -> {
                System.out.println("\t\t\tINFJ: Advocate");
                System.out.println("You are quiet and mystical, yet very inspiring and tireless idealists");
            }
            case "ENFJ" -> {
                System.out.println("\t\t\tENFJ: Protagonist");
                System.out.println("You're a charismatic and inspiring leader, able to mesmerize his listeners");
            }
            case "ENFP" -> {
                System.out.println("\t\t\tENFP: Campaigner");
                System.out.println("You're enthusiastic, creative and sociable free spirit, who can always find a reason to smile ");
            }
            case "ISTJ" -> {
                System.out.println("\t\t\tISTJ: Logistician");
                System.out.println("You are a practical and fact-minded individual, whose reliability cannot be doubted");
            }
            case "ISFJ" -> {
                System.out.println("\t\t\tISFJ: Defender");
                System.out.println("You're a very dedicated and warm protector, always ready to defend your loved ones");
            }
            case "ESTJ" -> {
                System.out.println("\t\t\tESTJ: Executive");
                System.out.println("You're an excellent administrator, unsurpassed at managing things or people");
            }
            case "ESFJ" -> {
                System.out.println("\t\t\tESFJ: Consul");
                System.out.println("You're a extraordinarily caring, social and popular, always eager to help");
            }
            case "ISTP" -> {
                System.out.println("\t\t\tISTP: Virtuoso");
                System.out.println("You're a bold and practical experimenter, master of all tools");
            }
            case "ISFP" -> {
                System.out.println("\t\t\tISFP: Adventurer");
                System.out.println("You're a flexible charming artist, always ready to explore somehing new");
            }
            case "ESTP" -> {
                System.out.println("\t\t\tESTP: Entrepreneur");
                System.out.println("You're a smart, energetic and very perceptive");
            }
            case "ESFP" -> {
                System.out.println("\t\t\tESFP: Entertainer");
                System.out.println("You're spontaneous, energetic and enthusiastic, life is never boring around you");
            }
        }
    }
}
