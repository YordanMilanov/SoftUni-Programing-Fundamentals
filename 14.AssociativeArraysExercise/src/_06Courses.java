import java.util.*;
import java.util.stream.Collectors;

public class _06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();


        while(!line.equals("end")) {
            String [] data = line.split(" : ");
            String course = data[0];
            String student = data[1];


            courses.putIfAbsent(course, Collections.singletonList(student));
           List<String> copy = new ArrayList<>(courses.get(course));
           if(!copy.contains(student)) {
               copy.add(student);
           }
           courses.put(course, copy);

            line = scanner.nextLine();
        }

        courses.forEach((key, value) -> {
            System.out.println(key + ": " + value.size());
            for (int i = 0; i < value.size(); i++) {
                System.out.println("-- " + value.get(i));
            }
        });
    }
}
