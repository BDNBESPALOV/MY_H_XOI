package io.hexlet.xo.model;

import java.awt.*;
import io.hexlet.xo.model.exception.*;

public class Field {
    private final int FIELD_SIZE;
    private  int MIN_COORDINATE=0;

    private final Figure[][] field;
    public Field(int i){
        FIELD_SIZE=i;
        field=new Figure[FIELD_SIZE][FIELD_SIZE];
    }

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException{
        if(!checkPoint(point)){

            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException

    {
        if(!checkPoint(point)){
            throw new InvalidPointException();
        }

        field[point.x][point.y]=figure;
    }

    public boolean checkPoint(Point point){


        return checkCoordinate(point.x,field.length) && checkCoordinate(point.y,field.length);

    }
    public boolean checkCoordinate(int coordinate, final int maxCoordinate){
     return    coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    }

}
