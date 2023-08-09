public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Wadha", "Manager", 30000, 4, "Bachelor Degree");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Ali", "Teacher", 10000 ,5, "Diploma");

        System.out.println("Full Time Employee Details:\n" + fullTimeEmployee + "\n");
        System.out.println("Part Time Employee Details:\n" + partTimeEmployee);
    }
}
