package io.hexlet.xo.controller;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class CurrentMoveConrollerTest {

    @Test
    public void testMoveController() throws InvalidPointException {
        CurrentMoveController currentMoveConroller =new CurrentMoveController();
        Field field=new Field(3);
        field.setFigure(new Point(0,0), Figure.X);
        field.setFigure(new Point(0,1), Figure.O);
        field.setFigure(new Point(0,2), Figure.X);
        assertEquals(Figure.O,currentMoveConroller.moveController(field));


    }
}