import java.util.Scanner;

public class PartOfAscII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int code = start; code <= stop ; code++) {
            System.out.print((char)code + " ");
        }
    }
}
