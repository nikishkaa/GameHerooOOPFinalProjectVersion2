package by.itstep.goutor.finaloopproject.util;

import java.util.Random;


public class RndInit {
    public static Random random;

    static {
        random = new Random();
    }

    public static int getMaxBossStat() {
        return random.nextInt(51) + 50;
    }
}
