package io.hexlet.xo.model;

import java.awt.*;
import io.hexlet.xo.model.exception.*;

public class Field {
    private static final int FIELD_SIZE=3;
    private static final int MIN_COORDINATE=0;
    private static final int MAX_COORDINATE=FIELD_SIZE;
    private final Figure[][] field=new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidPointException{
        if(!checkPoint(point)){

            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException,
            PointAlreadyOccupiedException
    {
        if(!checkPoint(point)){
            throw new InvalidPointException();
        }
        if(field[point.x][point.y] !=null){
            throw new PointAlreadyOccupiedException();
        }
        field[point.x][point.y]=figure;
    }

    public boolean checkPoint(Point point){


        return checkCoordinate(point.x) && checkCoordinate(point.y);

    }
    public boolean checkCoordinate(int coordinate){
        return coordinate>=MIN_COORDINATE && coordinate<MAX_COORDINATE;
    }

}
