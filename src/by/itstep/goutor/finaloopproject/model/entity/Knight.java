package by.itstep.goutor.finaloopproject.model.entity;

public class Knight extends Person {
    private int knightDamage;

    public Knight() {
    }

    public Knight(String name, boolean alive, int health, int level, int force, int knightDamage) {
        super(name, alive, health, level, force);
        this.knightDamage = knightDamage;
    }

    public int getKnightDamage() {
        return knightDamage;
    }

    public void setKnightDamage(int knightDamage) {
        this.knightDamage = knightDamage;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "knightDamage=" + knightDamage +
                '}';
    }

}
