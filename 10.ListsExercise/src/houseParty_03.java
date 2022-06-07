import java.util.*;
import java.util.stream.Collectors;

public class houseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String [] data = line.split("\\s+");
            String name = data[0];
            if (!line.contains("not")) {
                if(guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guests.add(name);
                }
            } else {
                if(guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        guests.forEach(System.out::println);
    }
}
