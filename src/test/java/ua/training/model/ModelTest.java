package ua.training.model;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew_yashin on 4/13/17.
 */
public class ModelTest {
    private Model model;

    @Before
    public void initModel(){
        model = new Model();
    }

    @Test
    public void getDefaultStartNumberTest(){
        assertEquals(0,model.getStartNumber());
    }

    @Test
    public void getDefaultEndNumberTest(){
        assertEquals(100, model.getEndNumber());
    }

    @Test
    public void getAnyStartNumberTest(){
        model.setStartNumber(10);
        assertEquals(10, model.getStartNumber());
    }

    @Test
    public void getAnyEndNumberTest(){
        model.setStartNumber(10);
        assertEquals(10, model.getStartNumber());
    }


}