/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapp;

public class GymWorkout extends FitnessDays {
    private String repsNumber;
    
    public GymWorkout(String repsNumber, String day,String time,String duration,String caloriesBurned) {
        super(day, time, duration, caloriesBurned);
        this.repsNumber = repsNumber;
    }
    public GymWorkout(){
        super();
        repsNumber = "";
    }

    public String getRepsNumber() {
        return repsNumber;
    }

    public void setRepsNumber(String RepsNumber) {
        this.repsNumber = RepsNumber;
    }
    
    @Override
    public String getDetails(){
        return " Reps Number "+repsNumber+" day "+day+" time "+time+" duration "+duration+" Calories burned "+caloriesBurned;
        
    }    
    
}
