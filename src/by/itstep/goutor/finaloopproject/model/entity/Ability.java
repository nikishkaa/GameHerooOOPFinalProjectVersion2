package by.itstep.goutor.finaloopproject.model.entity;

public enum Ability{
    FLYING(0),
    STRENGTH(10),
    FIRE(15),
    TELEPORTATION(0);

    private final int specialDamageModifier;

    Ability(int specialDamageModifier) {
        this.specialDamageModifier = specialDamageModifier;
    }

    public int getSpecialDamageModifier() {
        return specialDamageModifier;
    }


}
