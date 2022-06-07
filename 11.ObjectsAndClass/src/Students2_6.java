import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();


        while (!input.equals("end")) {

            String[] data = input.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String town = data[3];

            Student found = findByFirstAndLastName (students, firstName, lastName);

            if (found != null) {
                students.remove(found);
            }

            Student student = new Student(firstName, lastName, age, town);
            students.add(student);


            input = scanner.nextLine();

        }

        String filterTown = scanner.nextLine();

        for (Student student : students) {
            if (student.getTown().equals(filterTown)) {
                System.out.printf("%s %s is %d years old %n", student.getFirstName(), student.getLastName(), student.getAge(), student.getTown());
            }
        }
    }

    private static Student findByFirstAndLastName(List<Student> students, String firstName, String lastName) {

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

    }

}
