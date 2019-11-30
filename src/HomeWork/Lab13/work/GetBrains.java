package HomeWork.Lab13.work;

public class GetBrains extends Company{
    private Employee employee;

    public GetBrains setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    @Override
    public int averageSalary() {
        return 14999;
    }

    @Override
    public int maxSalary() {
        return 15000;
    }

    @Override
    public int minSalary() {
        return 0;
    }
}
