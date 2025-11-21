public class Department {
    double targetValue;
    double achievedTargetValue;

    public double getTargetValue(){
        return targetValue;
    }

    public double getAchievedTargetValue() {
        return achievedTargetValue;
    }

    Department(double targetValue, double achievedTargetValue){
        this.targetValue = targetValue;
        this.achievedTargetValue  = achievedTargetValue;
    }

    public boolean reachedTarget(){
        if (achievedTargetValue >= targetValue) return true;
        return false;
    }

}