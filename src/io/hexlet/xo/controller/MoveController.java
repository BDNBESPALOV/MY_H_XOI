package io.hexlet.xo.controller;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.*;

import java.awt.*;

public class MoveController {
    public void applyFigure(final Point point, Field field, final Figure figure) throws PointAlreadyOccupiedException, InvalidPointException {

        if(field.getFigure(point)!=null){
            throw new PointAlreadyOccupiedException();
        }
field.setFigure(point,figure);


    }
}
