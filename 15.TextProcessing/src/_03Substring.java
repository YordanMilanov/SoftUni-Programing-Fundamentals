import java.util.Scanner;

public class _03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filter = scanner.nextLine();
        String line = scanner.nextLine();

        int index = line.indexOf(filter);

        while (index != -1) {
            String firstPart = line.substring(0, index);
            String lastPart = line.substring(index + filter.length(), line.length());
            line = firstPart + lastPart;

            index = line.indexOf(filter);
        }

        System.out.println(line);
    }
}
