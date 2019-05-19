package io.hexlet.xo.controller;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class WinnerControllerTest {

    @Test
    public void TestGetWinner() throws InvalidPointException {




        for (int i=0;i<3;i++){
            Field field=new Field(3);
            field.setFigure(new Point(i,0), Figure.X);
            field.setFigure(new Point(i,1), Figure.X);
            field.setFigure(new Point(i,2), Figure.X);
            WinnerController winnerController =new WinnerController();
            assertEquals(Figure.X,winnerController.getWinner(field));
        }
        WinnerController winnerController =new WinnerController();
        for (int i=0;i<3;i++){
            Field field=new Field(3);
            field.setFigure(new Point(i,0), Figure.X);
            field.setFigure(new Point(i,1), Figure.X);
            field.setFigure(new Point(i,2), Figure.O);

            assertNull(winnerController.getWinner(field));
        }


    }
}