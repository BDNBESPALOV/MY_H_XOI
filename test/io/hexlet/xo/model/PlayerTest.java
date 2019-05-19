package io.hexlet.xo.model;

import org.junit.Test;

import static groovy.util.GroovyTestCase.assertEquals;
import static org.junit.Assert.*;

public class PlayerTest {



    @Test
    public void testGetName() throws Exception{
        final String inputValue="pig";
        final String expectedValue= inputValue;
        final Player player=new Player("pig",null);
        final String actualValue=player.getName();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void getFigure() {
        final Figure inputValue=Figure.X;
        final Figure expectedValue= inputValue;
        final Player player=new Player(null,inputValue);
        final Figure actualValue=player.getFigure();
        assertEquals(expectedValue,actualValue);
    }
}