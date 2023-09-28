/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapp;

import java.io.Serializable;

public class FitnessDays implements Serializable{

    protected String day,time,duration,caloriesBurned;
    
    public FitnessDays(String day, String time, String duration, String caloriesBurned) {
        this.day = day;
        this.time = time;
        this.time = time;
        this.time = time;
    }
    
    public FitnessDays(){
        day="";
        time="";
        duration="";
        caloriesBurned="";
        
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(String caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public String getDetails(){
        return " day "+day+" time "+time+" duration "+duration+" Calories burned "+caloriesBurned;
        
    }
    
}
