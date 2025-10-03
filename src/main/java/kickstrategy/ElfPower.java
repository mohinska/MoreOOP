package kickstrategy;

import lotr.Character;

public class ElfPower implements KickStrategy {

    @Override
    public void kick(Character kicker, Character victim) {
        if (kicker.getPower() > victim.getPower()) {
            victim.setHp(0);
        }
        else {
            kicker.setPower(kicker.getPower() - 1);
        }
    }

}