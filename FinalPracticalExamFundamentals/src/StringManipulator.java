import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String commands = scanner.nextLine();
            List<String>data = Arrays.stream(commands.split(" ")).collect(Collectors.toList());
        while (!data.get(0).equals("End")) {
            switch (data.get(0)) {
                case "Translate":
                    line = line.replace(data.get(1), data.get(2));
                    System.out.println(line);
                    break;
                case "Includes":
                   if (line.contains(data.get(1))) {
                       System.out.println("True");
                   } else {
                       System.out.println("False");
                   }
                    break;
                case "Start":
                    if (line.contains(data.get(1)) && line.indexOf(data.get(1)) == 0) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    line = line.toLowerCase(Locale.ROOT);
                    System.out.println(line);
                    break;
                case "FindIndex":
                    if (String.valueOf(data.get(1)).equalsIgnoreCase(String.valueOf(line.charAt(line.lastIndexOf(String.valueOf(data.get(1))))))) {
                    System.out.println(line.lastIndexOf(data.get(1)));
                    break;
                }
                case "Remove":
                    int startIndex = Integer.parseInt(data.get(1));
                    int count = Integer.parseInt(data.get(2));
                    line = line.replace(line.substring(startIndex, startIndex + count), "");
                    System.out.println(line);
                    break;
            }
            data.clear();
            commands = scanner.nextLine();
            data = Arrays.stream(commands.split(" ")).collect(Collectors.toList());
        }
    }
}
