package main.java.com.clashofclan.service;

import main.java.com.clashofclan.model.Barbarian;
import main.java.com.clashofclan.model.Cannon;

public class Game {

    public void armyAttackOnVillage(Cannon cannon,
                                    Barbarian barbarian) {

        final int cannonDamagePerHit = cannon.getDamagePerHit();
        final int barbarianDamagePerHit = barbarian.getDamagePerHit();
        while (true) {

            barbarian.hitByEnemy(cannonDamagePerHit);
            cannon.hitByEnemy(barbarianDamagePerHit);

        }
    }
}
