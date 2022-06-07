import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. read the input
        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        //2. create while loop
        while (!input.equals("end")) {
            // 3. split the input data to Strings and ints with the info.
            String[] data = input.split(" ");

            //4. separated info about the student in a separate variables.
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String town = data[3];

            //7. add the student parameters to the student class.Student(class) student(name) = new (Student <- this is the constructor)
            // (parameters in the brackets after the constructor).
            Student student = new Student(firstName, lastName, age, town);

            //8. add the current student to the list of students, where we collect only
            students.add(student);

            //9. read the next student info
            input = scanner.nextLine();
            //10. loop is repeating
        }

        //11. we need to print the people from the same town as the given. We read the filterTown from the console.
        String filterTown = scanner.nextLine();

        //12. we check if the town of each student is the same with the given town
        for (Student student : students) { // (for each Student<-class student<- name : in the list -> students, we repeat the loop)
            if (student.getTown().equals(filterTown)) {
                System.out.printf("%s %s is %d years old %n",student.getFirstName(), student.getLastName(), student.getAge(), student.getTown());
            }
        }
    }

    //5. create class with the student parameters in it.
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public String getTown() {
            return town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        //6. create a constructor to add the parameters of each student to the class student.
        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }
}
