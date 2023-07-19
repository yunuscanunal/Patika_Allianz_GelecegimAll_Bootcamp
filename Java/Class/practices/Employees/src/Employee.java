import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    String employeeName;
    double employeeGrossWage;
    int workHours;
    int hiredYear;

    public Employee(String employeeName, double employeeGrossWage, int workHours, int hiredYear) {
        this.employeeName = employeeName;
        this.employeeGrossWage = employeeGrossWage;
        this.workHours = workHours;
        this.hiredYear = hiredYear;
    }

    public double getTaxFromEmployee() {
        if (this.employeeGrossWage < 1000) {
            return 0;
        } else {
            return this.employeeGrossWage * 0.03;
        }
    }

    public double calculateBonus() {
        double bonusWage;
        if (this.workHours > 40) {
            return bonusWage = (this.workHours - 40) * 30;
        }else {
            return 0.0;
        }
    }

    public double getEmployeeRaiseWage() {
        int currentYear = 2021;
        int workingYear = currentYear - this.hiredYear;
        double raisePercentage;
        if (workingYear < 10) {
            raisePercentage = 0.05;
        } else if (workingYear > 9 && workingYear < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }
        return this.employeeGrossWage * raisePercentage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + employeeName + '\'' +
                ", Wage=" + employeeGrossWage +
                ", workHours=" + workHours +
                ", hiredYear=" + hiredYear +
                ", Taxes=" + getTaxFromEmployee() +
                ", Bonus=" + calculateBonus() +
                ", Wage Raises=" + getEmployeeRaiseWage() +
                ", Wage with Tax and Bonus=" + (employeeGrossWage - getTaxFromEmployee() +calculateBonus()) +
                ", Total Wage=" + (employeeGrossWage + getEmployeeRaiseWage()) +
                '}';
    }
}
