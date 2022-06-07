import java.util.*;
import java.util.stream.Collectors;

public class MassageManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();
        List<String> data = Arrays.stream(line.split(" ")).collect(Collectors.toList());

        Map<String, List<Integer>> records = new LinkedHashMap<>();
        while(!line.equals("Statistics")) {

            switch (data.get(0)) {

                case "Add":
                    String name = data.get(1);
                    int sent = Integer.parseInt(data.get(2));
                    int received = Integer.parseInt(data.get(3));
                    records.putIfAbsent(data.get(1),new ArrayList<>());
                    records.get(name).add(sent);
                    records.get(name).add(received);
                    records.get(name).add(received + sent);
                    break;
                case"Massage":
                    String sender = data.get(1);
                    String receiver = data.get(2);

                    if (records.containsKey(sender) && records.containsKey(receiver)) {
                        int sendersMassages = records.get(sender).get(1);
                        records.put(sender, records.get(sender));//produlji);
                    }
                    break;
            }




            data.clear();
            line = scanner.nextLine();
            data = Arrays.stream(line.split(" ")).collect(Collectors.toList());
        }
    }
}
