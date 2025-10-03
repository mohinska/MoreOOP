package lotr;

import kickstrategy.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {

    @Getter
    private int hp;
    @Getter @Setter
    private int power;
    private KickStrategy kickStrategy;

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

}
