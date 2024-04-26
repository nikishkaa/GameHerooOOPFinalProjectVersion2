package by.itstep.goutor.finaloopproject.model.entity;

public class Boss {
    private String name;
    private int StatToVin;

    public Boss() {
    }

    public Boss(String name, int StatToVin) {
        this.name = name;
        this.StatToVin = StatToVin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatToVinToVin() {
        return StatToVin;
    }

    public void setStatToVinToVin(int levelToVin) {
        this.StatToVin = levelToVin;
    }


    @Override
    public String toString() {
        return "Boss{" +
                "name = " + name + '\'' +
                ", levelToVin = " + StatToVin;
    }
}
