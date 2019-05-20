package io.hexlet.xo;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Game;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.view.ConsoleView;

public class XOCL {
    public static void main(String... args){

        String name1="player1";
        String name2="player2";
        Player player1=new Player(name1, Figure.X);
        Player player2=new Player(name2,Figure.O);
        Player[] p=new Player[2];
        p[0]=player1;
        p[1]=player2;
        Game game=new Game(p,new Field(3),"XO_MY");
        ConsoleView consoleView=new ConsoleView();
        consoleView.show(game);
        while(consoleView.move(game)){
            consoleView.show(game);
        }

    }
}
