package lotr;

import java.util.Random;
import kickstrategy.NobelPower;

public class King extends Character {

    public King() {
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5, new NobelPower());
    }

}