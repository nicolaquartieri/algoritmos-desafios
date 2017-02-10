package ar.com.algoritmos.algoritmos_desafios;

import ar.com.algoritmos.bowling.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

    private Game game;

    @Before
    public void setup() {
        // Arrange
        game = new Game();
    }

    @Test
    public void testLooserGame() {
        // Act
        for (int i = 0 ; i < 20 ; i++) {
            game.roll(0);
        }

        // Assert
        Assert.assertEquals(0, game.score());
    }

    @Test
    public void testOneRollFrameTest() {
        // Act
        for (int i = 0 ; i < 20 ; i++) {
            game.roll(1);
        }

        // Assert
        Assert.assertEquals(20, game.score());
    }

    @Test
    public void testTwoDifferentCasesTet() {
        // Act
        game.roll(4);
        game.roll(2);
        for (int i = 0 ; i < 18 ; i++) {
            game.roll(1);
        }

        // Assert
        Assert.assertEquals(24, game.score());
    }

    @Test
    public void testOneSpareTest() {
        // Act
        game.roll(4);
        game.roll(6);
        game.roll(1);
        for (int i = 0 ; i < 18 ; i++) {
            game.roll(0);
        }

        // Assert
        Assert.assertEquals(12, game.score());
    }

    @Test
    public void testOneStrikeTest() {
        game.roll(10);
        game.roll(6);
        game.roll(1);
        for (int i = 0 ; i < 18 ; i++) {
            game.roll(0);
        }

        // Assert
        Assert.assertEquals(24, game.score());
    }
}
