package io.hexlet.xo.view;

import io.hexlet.xo.controller.CurrentMoveController;
import io.hexlet.xo.controller.MoveController;
import io.hexlet.xo.controller.WinnerController;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.exception.InvalidPointException;
import io.hexlet.xo.model.exception.PointAlreadyOccupiedException;

import java.awt.*;
import java.util.Scanner;

public class ConsoleView {
    private final CurrentMoveController currentMoveController=new CurrentMoveController();
    private final WinnerController winnerController=new WinnerController();
    private final MoveController moveController=new MoveController();
    //private Game ;

    public void show(final Game game){
        System.out.format("Game name %s \n",game.getName());
        final Field field=new Field(3);
        for (int i=0;i<field.getSize();i++){
            printLine(field, i);

        }

    }
    public boolean move(final Game name){
        final Field field=name.getField();
        final Figure curentMoveF=currentMoveController.moveController(field);
        if(curentMoveF==null){
            final Figure winer=winnerController.getWinner(field);
if(winer==null){
    System.out.println("No winner ...");
return false;
}else {
    System.out.format("Winner %s",winer);
    return false;
}
        }
        System.out.format("Please enter move point for %s\n",curentMoveF);
        final Point point=askPoint();
        try {
            moveController.applyFigure(point,field,curentMoveF);
        } catch (PointAlreadyOccupiedException e) {

        } catch (InvalidPointException e) {

        }
return true;
    }

    private Point askPoint(){
        return new Point(askCoordinate("X")-1,askCoordinate("Y")-1);
    }
    private int askCoordinate(final String coordinateName){
        System.out.format("Please input %s",coordinateName);
        final Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }

    private void printLine(final Field field, int y)  {

        if(y==1||y==2){printSeparator();}
        for (int i=0;i<field.getSize();i++){
            Figure figure=null;
            try {
               figure=field.getFigure(new Point(i,y));

            } catch (InvalidPointException e) {
                e.printStackTrace();
            }
            System.out.print(figure!=null ? figure : " ");

            System.out.print(" | ");


        }
        System.out.println();
    }
    private void printSeparator(){
        System.out.println("~~~~~~~~~~");
    }


}
