import lotr.Character;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight starts between " + c1.getClass().getSimpleName() +
                " and " + c2.getClass().getSimpleName() + "!");

        while (c1.isAlive() && c2.isAlive()) {
            // c1 kicks c2
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " kicks " +
                    c2.getClass().getSimpleName() + ". " +
                    c2.getClass().getSimpleName() + " has " + c2.getHp() + " HP left.");

            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " has fallen. " +
                        c1.getClass().getSimpleName() + " wins!");
                break;
            }

            // c2 kicks c1
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " kicks " +
                    c1.getClass().getSimpleName() + ". " +
                    c1.getClass().getSimpleName() + " has " + c1.getHp() + " HP left.");

            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has fallen. " +
                        c2.getClass().getSimpleName() + " wins!");
                break;
            }
        }
    }
}