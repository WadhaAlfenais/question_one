public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        super(name, position, basicSalary, experience, educationalLevel);
    }

    @Override
    public double calculateBonus() {
        return basicSalary * 0.015;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + calculateBonus();
    }
}
