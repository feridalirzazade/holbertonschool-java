public class Manager extends Employeeddd {
    Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department){
        if (department.reachedTarget()) return (fixedSalary / 5) + ((department.achievedTargetValue - department.targetValue) / 100);
        return 0;
    }
}