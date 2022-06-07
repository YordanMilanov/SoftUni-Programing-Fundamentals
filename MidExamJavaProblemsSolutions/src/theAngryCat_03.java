import java.util.Arrays;
import java.util.Scanner;

public class theAngryCat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Numbers = Arrays
                        .stream(scanner.nextLine().split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String quality = scanner.nextLine();
        int leftSideCheap = 0;
        int leftSideExpensive = 0;
        int rightSideCheap = 0;
        int rightSideExpensive = 0;

        for (int i = 0; i < entryPoint; i++) {
            if (quality.equals("cheap")) {
                if (Numbers[i] < Numbers[entryPoint]) {
                    leftSideCheap += Numbers[i];
                }
            } else if (quality.equals("expensive")) {
                if (Numbers[i] >= Numbers[entryPoint]) {
                    leftSideExpensive += Numbers[i];
                }
            }
        }

        for (int i = entryPoint + 1; i < Numbers.length; i++) {
            if (quality.equals("cheap")) {
                if (Numbers[i] < Numbers[entryPoint]) {
                    rightSideCheap += Numbers[i];
                }
            } else if (quality.equals("expensive")) {
                if (Numbers[i] >= Numbers[entryPoint]) {
                    rightSideExpensive += Numbers[i];
                }
            }
        }

        if (quality.equals("cheap")) {
            if (rightSideCheap > leftSideCheap) {
                System.out.println("Right - " + rightSideCheap);
            } else {
                System.out.println("Left - " + leftSideCheap);
            }
        } else if (quality.equals("expensive")) {
            if (rightSideExpensive > leftSideExpensive) {
                System.out.println("Right - " + rightSideExpensive);
            } else {
                System.out.println("Left - " + leftSideExpensive);
            }
        }
    }
}
