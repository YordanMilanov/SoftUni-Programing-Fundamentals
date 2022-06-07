import java.util.*;

public class _07StudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> StudentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            StudentsGrades.putIfAbsent(name, new ArrayList<>());
            StudentsGrades.get(name).add(grade);
        }

        StudentsGrades
                .entrySet()
                // start stream
                .stream()
                // filter for each string in StudentsGrades
                .filter(s -> s.getValue()
                        //Stream for each grade of the student because s.getValue() returns us a list
                        .stream()
                        //map to double because mapToDouble gives us .average() option, and the we use .orElse(0.0)
                        // for each of the grades
                        .mapToDouble(x -> x)
                        //we take the average of the grades
                        .average()
                        //if there is no grade (the average = null), we use .orElse to give it 0.0 if it is null so it doesn't broke.
                        .orElse(0.0) >= 4.5)
                //now we make foreach cycle for every of the filtered average grade (which are more than 4.5/passed the filter)
                .forEach(entry -> {
                  double averageGrade = entry.getValue()
                          //entry.getValue returns list
                            .stream()
                          //stream the list/forloop - stream
                            .mapToDouble(x -> x)
                          //map to double to open the average
                            .average()
                          //get the average
                            .orElse(0.0);
                  //give it 0.0 to escape the null
                    System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
                    //print it
                });
    }
}
