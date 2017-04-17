package ua.training.model;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model;

    @Test
    public void getDefaultStartNumberTest(){
        model = new Model();
        assertEquals(0,model.getStartNumber());
    }

    @Test
    public void getDefaultEndNumberTest(){
        model = new Model();
        assertEquals(100, model.getEndNumber());
    }

    @Test
    public void getAnyStartNumberTest(){
        model = new Model();
        model.setStartNumber(10);
        assertEquals(10, model.getStartNumber());
    }

    @Test
    public void getAnyEndNumberTest(){
        model = new Model();
        model.setStartNumber(10);
        assertEquals(10, model.getStartNumber());
    }

    @Test
    public void checkNumberGreaterThanStartNumberTest(){
        model = new Model();
        model.setStartNumber(10);
        model.checkNumberForStart(23);

        int expected = 23;
        int actual = model.getStartNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void checkNumberLowerThanStartNumberTest(){
        model = new Model();
        model.setStartNumber(10);
        model.checkNumberForStart(-45);

        int expected = 10;
        int actual = model.getStartNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void checkNumberGreaterThanEndNumberTest(){
        model = new Model();
        model.setEndNumber(10);
        model.checkNumberForEnd(23);

        int expected = 10;
        int actual = model.getEndNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void checkNumberLowerThanEndNumberTest(){
        model = new Model();
        model.setEndNumber(10);
        model.checkNumberForStart(5);

        int expected = 5;
        int actual = model.getStartNumber();

        assertEquals(expected, actual);
    }


}