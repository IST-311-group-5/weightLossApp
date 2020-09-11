/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author daltonream
 */
public class Goal {
    private int caloricIntake = 0;
    private int duration = 0; 
    private static  ArrayList<String> meals;

    /**
     * @return the caloricIntake
     */
    public int getCaloricIntake() {
        return caloricIntake;
    }

    /**
     * @param caloricIntake the caloricIntake to set
     */
    public void setCaloricIntake(int caloricIntake) {
        this.caloricIntake = caloricIntake;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the meals
     */
    public static ArrayList<String> getMeals() {
        return meals;
    }

    /**
     * @param aMeals the meals to set
     */
    public static void setMeals(ArrayList<String> aMeals) {
        meals = aMeals;
    }
    
}
