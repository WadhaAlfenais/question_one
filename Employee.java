public class Employee {
    protected String name;
    protected String position;
    protected double basicSalary;
    protected int experience;
    protected String educationalLevel;

    public Employee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.educationalLevel = educationalLevel;
    }

    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * 0.05 * experience);
        
        if (educationalLevel.equalsIgnoreCase("Bachelor Degree")) {
            salary += 500;
        } else if (educationalLevel.equalsIgnoreCase("Diploma")) {
            salary += 250;
        }
        
        return salary;
    }

    public double calculateBonus() {
        return 0; // Default bonus for Employee
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPosition: " + position + "\nSalary: " + calculateSalary();
    }
}
