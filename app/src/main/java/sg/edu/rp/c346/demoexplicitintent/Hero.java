package sg.edu.rp.c346.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 15017103 on 4/5/2017.
 */

public class Hero implements Serializable{
    private String name;
    private int strength;
    private int technicalProwess;

    public Hero(String name, int strength, int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }
}
