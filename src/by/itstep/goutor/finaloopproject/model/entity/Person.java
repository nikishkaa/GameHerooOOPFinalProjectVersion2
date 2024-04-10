package by.itstep.goutor.finaloopproject.model.entity;

public class Person {
    private String name;
    private boolean alive;
    private int health;
    private int level;
    private int force;
    private int specialDamage;

    public Person() {
        alive = true;
        health = 100;
        name = "No name";
    }

    public Person(String name, boolean alive, int health, int level, int force, int specialDamage) {
        this.name = name;
        this.alive = alive;
        this.health = health;
        this.level = level;
        this.force = force;
        this.specialDamage = specialDamage;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public int getForce() {
        return force;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getSpecialDamage() {
        return specialDamage;
    }

    public void setSpecialDamage(int specialDamage) {
        this.specialDamage = specialDamage;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name + '\'' +
                ", alive = " + alive +
                ", health = " + health +
                ", level = " + level +
                ", force = " + force +
                ", special damage = " + specialDamage;
    }
}
