package lesson_3;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("\n Full name: "
                + fullName + "\n Position: "
                + position + "\n Email: "
                + email + "\n Phone Number: "
                + phoneNumber + "\n Salary ($): "
                + salary + "\n Age (full years): "
                + age + "\n");
    }

}



