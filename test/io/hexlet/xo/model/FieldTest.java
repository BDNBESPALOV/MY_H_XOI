package io.hexlet.xo.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void getSize() {
        final Field field=new Field();
        assertEquals(3,field.getSize());
    }

    @Test
    public void setFigure() {
        final Field field=new Field();
        final Point point=new Point(1,1);
        final Figure inputFigure= Figure.X;
        field.setFigure(point,inputFigure);
        final Figure actualFigure=field.getFigure(point);

        assertEquals(inputFigure,actualFigure);
    }
}