package by.itstep.goutor.finaloopproject.model.entity;

public class MagicianAstrologer extends Person{

    private int magicDamage;

    public MagicianAstrologer() {
    }

    public MagicianAstrologer(String name, boolean alive, int health, int level, int force, int magicDamage) {
        super(name, alive, health, level, force);
        this.magicDamage = magicDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    @Override
    public String toString() {
        return "MagicianAstrologer{" +
                "magicDamage=" + magicDamage +
                '}';
    }
}
