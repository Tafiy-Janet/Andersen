package lesson_3;

public class EmployeeArray {
    private static final int LENGTH = 5;
    private static final int MIN_AGE = 40;
    private static final Employee[] person = new Employee[LENGTH];


    public static void main(String args[]) {
        fillInEmployeeList();
        printEmployeeAge40Plus();
    }

    public static void fillInEmployeeList() {
        person[0] = new Employee("Fomenko Eugen", "Layer", "kuz.eugen@mail.com", "+999999999", 3000, 46);
        person[1] = new Employee("Solenko Stepan", "Physicist", "sol.step@mail.com", "+555555555", 4000, 41);
        person[2] = new Employee("Kept Simon", "Engineer", "kept.si@mail.com", "+333333333", 4500, 39);
        person[3] = new Employee("Moby Lory", "Musician", "kuz.eugen@mail.com", "+444444444", 5000, 55);
        person[4] = new Employee("Ihnatyko Volodymyr", "Driver", "ihnat@mail.com", "+6666666666", 3500, 28);
    }

    public static void printEmployeeAge40Plus() {
        for (Employee employee : person) {
            if (employee.getAge() > MIN_AGE) {
                System.out.println(employee);
            }
        }
    }

}
