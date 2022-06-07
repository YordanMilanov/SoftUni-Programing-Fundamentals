import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
            Map<String, Integer> MineResource = new LinkedHashMap<>();

        while(!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!MineResource.containsKey(resource)) {
                MineResource.put(resource, quantity);
            } else {
                MineResource.put(resource, MineResource.get(resource) + quantity);
            }
            input = scanner.nextLine();
        }

        MineResource.forEach((key, value) -> System.out.printf("%s -> %d%n",key, value));
    }
}
