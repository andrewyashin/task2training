package ua.training.model;

import java.util.Random;

public class Model {
    public static final int RAND_MIN = 0;
    public static final int RAND_MAX = 100;
    private static final Random rand;

    static {
        rand = new Random();
    }

    private int startNumber;
    private int endNumber;
    private int userNumber;

    public Model(){
        startNumber = RAND_MIN;
        endNumber = RAND_MAX;
    }

    public int generateUserNumber(){
        userNumber = startNumber + rand.nextInt(endNumber - startNumber);
        return userNumber;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public int getEndNumber() {
        return endNumber;
    }


    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public void setEndNumber(int endNumber) {
        this.endNumber = endNumber;
    }

//    public int getUserNumber() {
//        return userNumber;
//    }
}
