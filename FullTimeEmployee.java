public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        super(name, position, basicSalary, experience, educationalLevel);
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.03;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + calculateBonus();
    }
}
