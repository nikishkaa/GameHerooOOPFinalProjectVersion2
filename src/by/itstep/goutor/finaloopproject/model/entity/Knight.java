package by.itstep.goutor.finaloopproject.model.entity;

public class Knight extends Person {
    private int knightDamage;

    public Knight() {
    }

    public Knight(String name, boolean alive, int health, int level, int force, int knightDamage) {
        super(name, alive, health, level, force, knightDamage);
    }


    @Override
    public String toString() {
        return super.toString();
    }

}
