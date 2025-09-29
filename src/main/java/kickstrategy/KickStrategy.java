package kickstrategy;

import characters.Character;

public interface KickStrategy {
    public void kick(Character kicker, Character victim);
}
