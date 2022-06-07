import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class coursePlaning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] data = input.split(":");

            switch (data[0]) {
                case "Add":
                    if (!courses.contains(data[1])) {
                        courses.add(data[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    if (index >= courses.size()) {
                        courses.add(data[1]);
                    }
                    if (!courses.contains(data[1])) {
                        courses.add(index, data[1]);
                    }
                    break;
                case "Remove":
                    if (courses.contains(data[1])) {
                        courses.remove(data[1]);
                        if (courses.contains(data[1] + "-Exercise")) {
                            courses.remove(data[1] + "-Exercise");
                        }
                    }
                    break;
                case "Swap":
                    if (courses.contains(data[1]) && courses.contains(data[2])) {
                        int indexOfFirstClass = courses.indexOf(data[1]);
                        int indexOfSecondClass = courses.indexOf(data[2]);
                        String firstClass = courses.get(indexOfFirstClass);
                        String secondClass = courses.get(indexOfSecondClass);


                        courses.set(indexOfFirstClass, secondClass);
                        courses.set(indexOfSecondClass, firstClass);

                        if (courses.contains(data[1] + "-Exercise")) {
                            indexOfFirstClass = courses.indexOf(data[1]);
                            String firstClassExercise = courses.get(indexOfFirstClass) + "-Exercise";
                            courses.remove(firstClassExercise);
                            if (indexOfFirstClass >= courses.size()) {
                                courses.add(firstClassExercise);
                            } else {
                                courses.add(indexOfFirstClass + 1, firstClassExercise);
                            }
                        }
                        if (courses.contains(data[2] + "-Exercise")) {
                            indexOfSecondClass = courses.indexOf(data[2]);
                            String secondClassExercise = courses.get(indexOfSecondClass) + "-Exercise";
                            courses.remove(secondClassExercise);
                            if (indexOfSecondClass >= courses.size()) {
                                courses.add(secondClassExercise);
                            } else {
                                courses.add(indexOfSecondClass + 1, secondClassExercise);
                            }
                        }



                    }
                    break;
                case "Exercise":
                    if (courses.contains(data[1]) && !courses.contains(data[1] + "-Exercise")) {
                        int indexOfClass = courses.indexOf(data[1]);
                        String exerciseClass = courses.get(indexOfClass) + "-Exercise";
                        if (indexOfClass >= courses.size()) {
                            courses.add(exerciseClass);
                        }
                        courses.add(indexOfClass + 1, exerciseClass);
                    } else {
                        courses.add(data[1]);
                        courses.add(data[1] + "-Exercise");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(i+1 + "." + courses.get(i));
        }
    }
}
