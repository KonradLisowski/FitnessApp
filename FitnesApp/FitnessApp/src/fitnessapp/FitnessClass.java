/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapp;


/**
 *
 * @author Vkonr
 */
public class FitnessClass extends FitnessDays{
    private String classType, trainerName;
    
    
    
    public FitnessClass(String classType,String trainerName, String day,String time,String duration,String caloriesBurned) {
        super(day, time, duration, caloriesBurned);
        this.classType = classType;
        this.classType = trainerName;
    }    
    
    public FitnessClass(){
        super();
        classType = new String();
        trainerName = new String();
    }
    
    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
    
    @Override
    public String getDetails(){
        return "Class Type "+classType+" Trainer "+trainerName+" day "+day+" time "+time+" duration "+duration+" Calories burned "+caloriesBurned;
        
    }    
        
    
}
