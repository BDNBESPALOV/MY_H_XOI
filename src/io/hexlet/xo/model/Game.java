package io.hexlet.xo.model;

public class Game {

    private final Player[] players;
    private final Field field;
    private final String name;

    Game(final Player[] players, final Field field,final String name){
        this.players=players;
        this.field=field;
        this.name=name;

    }

    public Player[] getPlayer(){return players;}
    public Field getField(){return field;}
    public String getName(){return name;}
}