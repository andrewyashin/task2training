package ua.training.view;

public class View {
    public static final String INPUT_NUMBER = " Input number = ";
    public static final String INPUT_MIN = " - Input min number = ";
    public static final String INPUT_MAX = " - Input max number = ";
    public static final String WRONG_NUMBER = " - Wrong number! Try again!";
    public static final String RANGE = " -- Your number in range :";
    public static final String TYPE_MISMATCH = " !! PLEASE, INPUT CORRECT DATA !!";
    public static final String SEARCHING_NUMBER_GREATER = " -- Searching number is GREATER than input";
    public static final String SEARCHING_NUMBER_LOWER = " -- Searching number is LOWER than input";
    public static final String SEARCHING_NUMBER_IS = " You are winner. Searching number is ";

    public void print(String message){
        System.out.print(message);
    }

    public void println(String message){
        System.out.println(message);
    }

    public void printlnRange(int min, int max) {
        System.out.println(RANGE
                + "[ " + min
                + ".." + max
                + " ]");
    }

    public void printResult(int number){
        System.out.println(SEARCHING_NUMBER_IS + number);
    }
}
