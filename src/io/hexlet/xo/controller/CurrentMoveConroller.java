package io.hexlet.xo.controller;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.InvalidPointException;

import java.awt.*;

public class CurrentMoveConroller {
    public Figure moveController(final Field field) throws InvalidPointException {
        int countFigure=0;

        for(int y=0;y<field.getSize();y++){
        for(int i=0;i<field.getSize();i++){
if(field.getFigure(new Point(y,i)) != null){
    countFigure++;
}
        }}
        if(countFigure == field.getSize()*field.getSize()){
            return null;
        }

        if(countFigure%2==0){
            return  Figure.X;
        }

return Figure.O;

    }
}
