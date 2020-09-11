/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author daltonream
 */
public class WorkoutRecommendations {
    private String workoutType = null;
    private int reccomendedDuration = 0;

    /**
     * @return the workoutType
     */
    public String getWorkoutType() {
        return workoutType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    /**
     * @return the reccomendedDuration
     */
    public int getReccomendedDuration() {
        return reccomendedDuration;
    }

    /**
     * @param reccomendedDuration the reccomendedDuration to set
     */
    public void setReccomendedDuration(int reccomendedDuration) {
        this.reccomendedDuration = reccomendedDuration;
    }
}
