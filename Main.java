public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", "Manager", 50000, 5, "Bachelor Degree");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", "Clerk", 25000, 2, "Diploma");

        System.out.println("Full Time Employee Details:\n" + fullTimeEmployee + "\n");
        System.out.println("Part Time Employee Details:\n" + partTimeEmployee);
    }
}
