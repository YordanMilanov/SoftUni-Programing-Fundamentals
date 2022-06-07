import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class _03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // we create a winner boolean
        boolean hasWinner = false;
        // creating a map of the items and their quantity with string and integer
        Map<String, Integer> items = new LinkedHashMap<>();

        //we add this values ass 0, because we want when we print it this three one to be the first and
        //LinkedHashMap orders by addition that is why we first add them, then we put their values
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);
        //we create an empty string for the winner
        String winner = "";

        while(!hasWinner) {
            // we read the info from the console with Array
            String [] data = scanner.nextLine().split("\\s+");

            // we iterate for each couple quantity + material that is why we increment i by 2
            for (int i = 0; i < data.length - 1; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String resource = data[i + 1].toLowerCase();

                //putIfAbsent adds only if the key is not existing that is why we first add the key with quantity 0
                items.putIfAbsent(resource, 0);
                //and then we add the quantity to the key by using items.get(resource) + quantity
                items.put(resource, items.get(resource) + quantity);

                //the we check if any of the materials is enough for legendary item and if it is we remove 250 of the
                //wining materials so we can see the remaining of the winning materials
                if (resource.equals("shards") || resource.equals("motes") || resource.equals("fragments")) {
                    if (items.get(resource) >= 250) {
                        items.put(resource, items.get(resource) - 250);
                        winner = resource;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }

        //finaly we print the winning item
        switch (winner) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
        // and the other items are printed too
        items.forEach((k, v) -> System.out.printf("%s: %d%n",k ,v));
    }
}
