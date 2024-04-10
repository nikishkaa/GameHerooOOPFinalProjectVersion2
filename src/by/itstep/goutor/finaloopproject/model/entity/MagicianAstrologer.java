package by.itstep.goutor.finaloopproject.model.entity;

public class MagicianAstrologer extends Person {

    private int magicDamage;

    public MagicianAstrologer() {
    }

    public MagicianAstrologer(String name, boolean alive, int health, int level, int force, int magicDamage) {
        super(name, alive, health, level, force, magicDamage);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
