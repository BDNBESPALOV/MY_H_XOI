package io.hexlet.xo.model;

import io.hexlet.xo.model.exception.InvalidPointException;
import io.hexlet.xo.model.exception.PointAlreadyOccupiedException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void testGetSize() {
        final Field field=new Field();
        assertEquals(3,field.getSize());
    }

    @Test
    public void testSetFigure() {
        final Field field=new Field();
        final Point point=new Point(1,1);
        final Figure inputFigure= Figure.X;
        try{
            field.setFigure(point,inputFigure);
            final Figure actualFigure=field.getFigure(point);
            assertEquals(inputFigure,actualFigure);
        }catch (PointAlreadyOccupiedException e){}
        catch (InvalidPointException e){}



    }
    @Test
    public void testGetFigureIsNotSet() {
        final Field field=new Field();
        final Point point=new Point(1,1);

        try{

            final Figure actualFigure=field.getFigure(point);
             assertNull(actualFigure);
        }
        catch (InvalidPointException e){}
    }
    @Test
    public void testGetFigureXThenZero() {
        final Field field=new Field();
        final Point point=new Point(0,-1);

        try{

            field.getFigure(point);
            fail();
        }
        catch (InvalidPointException e){

        }
    }
    @Test
    public void testGetFigureXThenSize() {
        final Field field=new Field();
        final Point point=new Point(field.getSize()+1,0);

        try{
            field.getFigure(point);
            fail();
        }
        catch (InvalidPointException e){

        }
    }
    public void testGetFigureYThenSize() {
        final Field field=new Field();
        final Point point=new Point(0,-1);

        try{

            field.getFigure(point);
            fail();
        }
        catch (InvalidPointException e){

        }
    }
}