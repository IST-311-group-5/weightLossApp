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
public class MealRecommendations {
    private int recommedndedCalroicIntake = 0;
    private static  ArrayList<String> meals;
    

    /**
     * @return the calroicIntake
     */
    public int getRecommedndedCalroicIntake() {
        return recommedndedCalroicIntake;
    }

    /**
     * @param calroicIntake the calroicIntake to set
     */
    public void setRecommedndedCalroicIntake(int calroicIntake) {
        this.recommedndedCalroicIntake = calroicIntake;
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
