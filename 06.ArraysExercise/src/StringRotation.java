import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int Rotations = 0; Rotations < countRotations; Rotations++) {

            String firstElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = firstElement;
        }

        for (String element : array) {

            System.out.print(element + " ");
        }


    }
}
