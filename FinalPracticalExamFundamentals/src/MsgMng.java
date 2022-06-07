import java.util.*;
import java.util.stream.Collectors;

public class MsgMng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        String line = scanner.nextLine();
        List<String> data = Arrays.stream(line.split("=")).collect(Collectors.toList());

        Map<String, Person> records = new LinkedHashMap<>();
        while (!line.equals("Statistics")) {

            switch (data.get(0)) {

                case "Add":
                    String name = data.get(1);
                    int sent = Integer.parseInt(data.get(2));
                    int received = Integer.parseInt(data.get(3));
                    int total = sent + received;
                    if (!records.containsKey(name)) {
                        Person person = new Person(name, sent, received, total);
                        records.putIfAbsent(data.get(1), person);
                    }
                    break;
                case "Message":
                    String sender = data.get(1);
                    String receiver = data.get(2);

                    if (records.containsKey(sender) && records.containsKey(receiver)) {
                        int sentIncreased = records.get(sender).getSent() + 1;
                        int senderTotal = sentIncreased + records.get(sender).getReceived();
                        int receivedIncreased = records.get(receiver).getReceived() + 1;
                        int receiverTotal = receivedIncreased + records.get(receiver).getReceived();

                        if (senderTotal >= capacity) {
                            System.out.println(records.get(sender).getName() + " reached the capacity!");
                            records.remove(sender);
                            records.get(receiver).setReceived(receivedIncreased);
                            records.get(receiver).setTotal(receiverTotal);
                            break;
                        } else {
                            records.get(sender).setSent(sentIncreased);
                            records.get(sender).setTotal(senderTotal);
                        }

                        if (receiverTotal >= capacity) {
                            System.out.println(records.get(receiver).getName() + " reached the capacity!");
                            records.remove(receiver);
                            break;
                        } else {
                            records.get(receiver).setReceived(receivedIncreased);
                            records.get(receiver).setTotal(receiverTotal);
                        }
                    }
                    break;
                case "Empty":
                    String userToDelete = data.get(1);

                    if (userToDelete.equals("All")) {
                        records.clear();

                    } else if (records.containsKey(userToDelete)) {
                        records.remove(userToDelete);
                    }
                    break;
            }
            data.clear();
            line = scanner.nextLine();
            data = Arrays.stream(line.split("=")).collect(Collectors.toList());
        }
        System.out.println("Users count: " + records.size());
        for (Map.Entry<String, Person> entry : records.entrySet()) {
            String name = entry.getValue().getName();
            int total = entry.getValue().getTotal();
            System.out.printf("%s - %d%n", name, total);
        }
    }

    static class Person {
        String name;
        int sent;
        int received;
        int total;

        public Person(String name, int sent, int received, int total) {
            this.name = name;
            this.sent = sent;
            this.received = received;
            this.total = total;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSent() {
            return sent;
        }

        public void setSent(int sent) {
            this.sent = sent;
        }

        public int getReceived() {
            return received;
        }

        public void setReceived(int received) {
            this.received = received;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

}
