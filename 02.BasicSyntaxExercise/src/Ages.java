import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input <= 2) {
            System.out.println("baby");
        } else if (input <= 13) {
            System.out.println("child");
        } else if (input <= 19) {
            System.out.println("teenager");
        } else if (input <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
