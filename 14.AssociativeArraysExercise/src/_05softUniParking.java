import java.util.*;
import java.util.stream.Collectors;

public class _05softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registrations = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            List<String> data = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .collect(Collectors.toList());
            String command = data.get(0);
            String name = data.get(1);
            String license = "";
            if (data.size() == 3) {
            license = data.get(2);
            }

            if (command.equals("register")) {
                if (registrations.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n",license);
                } else {
                    registrations.put(name, license);
                    System.out.printf("%s registered %s successfully%n",name , license);
                }
            } else if (command.equals("unregister")) {
                if (registrations.containsKey(name)) {
                    System.out.printf("%s unregistered successfully%n", name);
                    registrations.remove(name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }
    }
}
