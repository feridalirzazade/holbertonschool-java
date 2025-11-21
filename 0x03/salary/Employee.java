public class Employee {
    double fixedSalary;

    public double getFixedSalary(){
        return fixedSalary;
    }

    Employee(double fixedSalary){
        this.fixedSalary = fixedSalary;
    }

    public double calculateBonus(Department department){
        if (department.reachedTarget()) return (fixedSalary / 10);
        return 0;
    }

    public double calculateTotalSalary(Department department){
        return (fixedSalary + calculateBonus(department));
    }
}