import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String [] array1 = firstLine.split(" ");
        String [] array2 = secondLine.split(" ");

        for (String elementInFirst : array1) {

            for (String elementInSecond : array2) {
                if (elementInFirst.equals(elementInSecond)) {
                    System.out.print(elementInSecond + " ");
                }
            }
        }
    }
}
