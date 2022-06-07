import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousTreat_08_notWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("3:1")) {
            String [] data = line.split("\\s+");
            String command = data[0];

            switch (data[0]) {
                case "merge":
                    List<String>result = new ArrayList<>();
                    int start = Math.max(0, Integer.parseInt(data[1]));
                    int end = Math.min(Integer.parseInt(data[2]), strings.size() - 1);

                    // add everything before merge to result list
                    if (start > 0 && start < strings.size()) {
                    result.addAll(strings.subList(0, start));
                    }
                    //merge elements from start to end index
                    if (start < strings.size()) {
                        List<String> mergedElements = strings.subList(start, end + 1);
                        String merged = "";
                        for (String mergedElement : mergedElements) {
                            merged += mergedElement;
                        }
                        result.add(merged);
                    }

                    // add the remaining to the result
                    if (end + 1 <= strings.size()) {
                    result.addAll(strings.subList(end + 1,strings.size()));
                    }

                    if(!result.isEmpty()){
                        strings = result;
                    }
                    break;

                case"divide":
                    result = new ArrayList<>();
                    int index = Integer.parseInt(data[1]);
                    int parts = Integer.parseInt(data[2]);
                    String element = strings.get(index);


                    if (element.length() % parts == 0) {
                        int symbols = element.length() / parts;
                        for (int i = 0; i < parts; i++) {
                            // substring (start Index, end Index). add first elements to the result.
                            result.add(element.substring(i, symbols));
                            // substring (start Index). remove first elements from the string.
                            element = element.substring(symbols);
                        }
                        strings.remove(index);
                        strings.addAll(index, result);
                    } else {
                        int symbols = element.length() / parts;
                        for (int i = 0; i < parts; i++) {
                            if (i == parts) {
                                result.add(element);
                            } else {
                            // substring (start Index, end Index). add first elements to the result.
                            result.add(element.substring(i, symbols));
                            // substring (start Index). remove first elements from the string.
                            element = element.substring(symbols);
                            }
                        }
                        strings.remove(index);
                        strings.addAll(index, result);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        strings.forEach(s-> System.out.println(s + " "));
    }
}
