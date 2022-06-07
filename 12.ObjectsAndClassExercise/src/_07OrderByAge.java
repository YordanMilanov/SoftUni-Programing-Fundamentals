import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> peopleList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, ID, age);
            peopleList.add(person);

            input = scanner.nextLine();
        }

        peopleList
                .stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));
    }


    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
        }

        public int getAge() {
            return age;
        }
    }
}

