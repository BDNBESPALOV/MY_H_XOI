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
             if(check(field,new Point(i,0), new IPointChqanger(){
                 @Override
                 public Point next(Point p){
return new Point(p.x+1,p.y);
                 }
             }) ){
                 return field.getFigure(new Point(i,0));
             }
         }
            for(int i=0;i<3;i++){
                if(check(field,new Point(i,0), new IPointChqanger(){
                    @Override
                    public Point next(Point p){
                        return new Point(p.x,p.y+1);
                    }
                }) ){
                    return field.getFigure(new Point(i,0));
                }
            }

            if(check(field,new Point(0,0), new IPointChqanger(){
                @Override
                public Point next(Point p){
                    return new Point(p.x+1,p.y+1);
                }
            }) ){
                return field.getFigure(new Point(0,0));
            }

            if(check(field,new Point(1,1), new IPointChqanger(){
                @Override
                public Point next(Point p){
                    return new Point(p.x+1,p.y+1);
                }
            }) ){
                return field.getFigure(new Point(0,0));
            }


        }catch(InvalidPointException e){}
        return null;
    }


    public boolean check(Field field,Point currentyPoint,IPointChqanger pointChqanger){

final Figure currenty;
final Figure nextFigure;
final Point nextPoint=pointChqanger.next(currentyPoint);

        final Point p1=start;
        final Point p2=pointChqanger.next(p1);
        final Point p3=pointChqanger.next(p2);
     try{



         }

     } catch(InvalidPointException e){}

        return false;
    }

    public interface IPointChqanger{
        public Point next(Point point);
    }

}
