package by.itstep.goutor.finaloopproject.model.entity;

public class Hydra extends Boss {
    private int headCount;

    public Hydra() {
    }

    public Hydra(String name, int levelToVin, int headCount) {
        super(name, levelToVin);
        this.headCount = headCount;
    }

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }

    @Override
    public String toString() {
        return super.toString() + " headCount = " + headCount +
                '}';
    }
}
