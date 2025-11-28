import java.util.Locale;

public class Program1223 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.GERMANY);

        Department engineeringDepartment = new Department(1000, 1100);
        Department documentationDepartment = new Department(1000, 800);

        Employeeddd engineeringEmployee1 = new Employeeddd(2300);
        Employeeddd engineeringEmployee2 = new Employeeddd(3650);
        Manager engineeringManager = new Manager(5800);

        Employeeddd documentationEmployee1 = new Employeeddd(2500);
        Employeeddd documentationEmployee2 = new Employeeddd(3000);
        Manager documentationManager = new Manager(4980);

        System.out.printf("Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
                engineeringEmployee1.getFixedSalary(),
                engineeringEmployee1.calculateTotalSalary(engineeringDepartment),
                engineeringEmployee1.calculateBonus(engineeringDepartment));

        System.out.printf("Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
                engineeringEmployee2.getFixedSalary(),
                engineeringEmployee2.calculateTotalSalary(engineeringDepartment),
                engineeringEmployee2.calculateBonus(engineeringDepartment));

        System.out.printf("Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
                engineeringManager.getFixedSalary(),
                engineeringManager.calculateTotalSalary(engineeringDepartment),
                engineeringManager.calculateBonus(engineeringDepartment));

        System.out.printf("Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
                documentationEmployee1.getFixedSalary(),
                documentationEmployee1.calculateTotalSalary(documentationDepartment),
                documentationEmployee1.calculateBonus(documentationDepartment));

        System.out.printf("Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
                documentationEmployee2.getFixedSalary(),
                documentationEmployee2.calculateTotalSalary(documentationDepartment),
                documentationEmployee2.calculateBonus(documentationDepartment));

        System.out.printf("Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
                documentationManager.getFixedSalary(),
                documentationManager.calculateTotalSalary(documentationDepartment),
                documentationManager.calculateBonus(documentationDepartment));
    }
}