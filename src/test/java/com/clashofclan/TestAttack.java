package test.java.com.clashofclan;

import main.java.com.clashofclan.exception.BarbarianKilledException;
import main.java.com.clashofclan.model.Barbarian;
import main.java.com.clashofclan.model.Cannon;
import main.java.com.clashofclan.service.Game;
import org.junit.Test;


public class TestAttack {

    @Test(expected = BarbarianKilledException.class)
    public void shouldDefenceWinWithOneBarbarianAndOneCannon(){

        final Cannon cannon = new Cannon(10, 390);
        final Barbarian barbarian = new Barbarian(8, 45);

        new Game().armyAttackOnVillage(cannon, barbarian);

    }
}
