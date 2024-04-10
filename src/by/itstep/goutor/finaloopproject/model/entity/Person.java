package by.itstep.goutor.finaloopproject.model.entity;

public class Person {
    private String name;
    private boolean alive;
    private int health;
    private int level;
    private int force;

    public Person() {
        alive = true;
        health = 100;
        name = "No name";
    }

    public Person(String name, boolean alive, int health, int level, int force) {
        this.name = name;
        this.alive = alive;
        this.health = health;
        this.level = level;
        this.force = force;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                ", health=" + health +
                ", level=" + level +
                ", force=" + force +
                '}';
    }
}
