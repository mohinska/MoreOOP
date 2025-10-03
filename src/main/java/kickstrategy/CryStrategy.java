package kickstrategy;

import lotr.Character;

public class CryStrategy implements KickStrategy {

    @Override
    public void kick(Character kicker, Character victim) {
        System.out.println("😭😭😭");
    }

}