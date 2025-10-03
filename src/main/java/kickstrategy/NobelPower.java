package kickstrategy;

import java.util.Random;

import lotr.Character;

public class NobelPower implements KickStrategy {

    @Override
    public void kick(Character kicker, Character victim) {
        victim.setHp(victim.getHp() - new Random().nextInt(kicker.getHp() + 1));
    }

}