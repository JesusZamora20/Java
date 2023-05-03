package org.example;

import org.example.Dice.Dice;
import org.example.Dice.Player;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loses_when_number_low() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.Roll()).thenReturn(2);

        Player player = new Player(dice, 3);

        assertFalse(player.Play());
    }

    @Test
    public void wins_when_number_big() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.Roll()).thenReturn(4);

        Player player = new Player(dice, 3);

        assertTrue(player.Play());
    }
}