package by.itstep.goutor.finaloopproject.model.entity;

public class Dragon extends Boss {
    private int fireDamage;
    private int fireRange;

    public Dragon() {
    }

    public Dragon(String name, int levelToVin, int fireDamage, int fireRange) {
        super(name, levelToVin);
        this.fireDamage = fireDamage;
        this.fireRange = fireRange;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public int getFireRange() {
        return fireRange;
    }

    public void setFireRange(int fireRange) {
        this.fireRange = fireRange;
    }

    @Override
    public String toString() {
        return super.toString() + " fireDamage = " + fireDamage +
                ", fireRange = " + fireRange +
                '}';
    }
}
