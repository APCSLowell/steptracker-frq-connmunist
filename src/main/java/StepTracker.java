import java.util.ArrayList;
public class StepTracker
{
  private int mininimum, total, tDays, aDays;
 
 public StepTracker(){
 minimum = goal;
 total = 0;
 tDays = 0;
 aDays = 0;
 }

 public int addDailySteps(int steps){
 total += steps;
  if(steps >= minimum)
    aDays++;
 }
 
 public int activeDays(){
  return aDays;
 }
 public double averageSteps(){
 if(tDays == 0)
  return 0.0;
  return (double)totalSteps/totalDays;
 }
 
} 
