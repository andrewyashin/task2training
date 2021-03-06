package ua.training.controller;

import ua.training.model.Model;
import ua.training.view.View;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andrew_yashin on 4/13/17.
 */
public class Controller {
    private Model model;
    private View view;
    private int randNumber;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processNumber(int min, int max){
        if(max < min){
            randNumber = rand(max, min);
        } else {
            randNumber = rand(min, max);
        }
        play();
    }

    public void processNumber(){
        randNumber = rand();
        play();
    }

    public void play(){
        int inputNumber = -1;

        while (inputNumber != randNumber){
            view.printlnRange(model.getStartNumber(), model.getEndNumber());


            view.print(View.INPUT_NUMBER);
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNext()){
                try {
                    inputNumber = scanner.nextInt();
                } catch (InputMismatchException e){
                    view.println(View.TYPE_MISMATCH);
                }
            }

            if (inputNumber < randNumber) {
                view.println(View.SEARCHING_NUMBER_GREATER);
                model.checkNumberForStart(inputNumber);

            } else if (inputNumber > randNumber){
                view.println(View.SEARCHING_NUMBER_LOWER);
                model.checkNumberForEnd(inputNumber);
            }
        }

        view.printResult(inputNumber);
    }


    public int rand(int min, int max){
        model.setStartNumber(min);
        model.setEndNumber(max);
        return model.generateUserNumber();
    }

    public int rand(){
        return model.generateUserNumber();
    }
}
