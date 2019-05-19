package io.hexlet.xo.controller;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.exception.InvalidPointException;
import org.omg.PortableServer.POA;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field){
        try {
         for(int i=0;i<3;i++){
             if(check(field,new Point(i,0), point -> new Point(point.x,point.y+1))){

                 return field.getFigure(new Point(i,0));
             }
         }
            for(int i=0;i<3;i++){
                if(check(field,new Point(0,i), point -> new Point(point.x+1,point.y))){

                    return field.getFigure(new Point(0,i));
                }
            }

            if(check(field,new Point(0,0), point -> new Point(point.x+1,point.y+1))){

                return field.getFigure(new Point(0,0));
            }

            if(check(field,new Point(0,2), point -> new Point(point.x+1,point.y-1))){

                return field.getFigure(new Point(1,1));
            }


        }catch(InvalidPointException e){}
        return null;
    }


    public boolean check(Field field,Point currentyPoint,IPointChqanger pointChqanger){

final Figure currentyFigure ;
 final Figure nextFigure ;
final Point nextPoint=pointChqanger.next(currentyPoint);
     try{
      currentyFigure=field.getFigure(currentyPoint);
         if(currentyFigure == null){
             return false;}
      nextFigure=field.getFigure(nextPoint);
         } catch(InvalidPointException e){ return true;}

if(currentyFigure != nextFigure){return  false;}

        return check(field,nextPoint,pointChqanger);
    }

    public interface IPointChqanger{
         Point next(final Point point);
    }

}
