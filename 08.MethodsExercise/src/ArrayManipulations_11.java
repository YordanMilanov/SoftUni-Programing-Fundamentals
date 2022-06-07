import java.util.Scanner;

public class ArrayManipulations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mainArray = scanner.nextLine().split(" ");
        int[] inputNumbers = new int[mainArray.length];
        for (int i = 0; i < mainArray.length; i++) {
            inputNumbers[i] = Integer.parseInt(mainArray[i]);
        }

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {
            //exchange method
            if (input[0].equals("exchange")) {
                PrintExchangedReversedArray(inputNumbers, input);
            }
            //max even/odd
            else if (input[0].equals("max")) {
                if (input[1].equals("even")) {
                    printMaxEvenIndex(inputNumbers);
                } else if (input[1].equals("odd")) {
                    printMaxOddIndex(inputNumbers);
                }
            }
            //min even/odd
            else if (input[0].equals("min")) {
                if (input[1].equals("even")) {
                    printMinEvenIndex(inputNumbers);
                } else if (input[1].equals("odd")) {
                    printMinOddIndex(inputNumbers);
                }
            }
            //first even/odd
            else if (input[0].equals("first")) {
                if (input[2].equals("even"))
                    printFirstCountEven(inputNumbers, input);
            }
            input = scanner.nextLine().split(" ");
        }
    }

    public static void PrintExchangedReversedArray(int[] inputNumbers, String[] input) {
        int exchangedIndex = Integer.parseInt(input[1]); //exchangedIndex

        if (exchangedIndex > inputNumbers.length) {
            System.out.println("Invalid index");
        }

        int[] editedArray = new int[inputNumbers.length];
        int startIndex = Integer.parseInt(input[1]);
        if (startIndex > inputNumbers.length) {
            System.out.println("Invalid Index");
            return;
        }

        for (int i = exchangedIndex; i < inputNumbers.length; i++) {
            editedArray[startIndex] = inputNumbers[i - 1];
            startIndex += 1;
        }

        for (int i = 0; i < exchangedIndex; i++) {
            editedArray[i] = inputNumbers[inputNumbers.length - i - 1];
        }
    }

    public static void printMaxEvenIndex(int[] inputNumbers) {


        int max = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 0) {
                if (inputNumbers[i] >= max) {
                    max = inputNumbers[i];
                    maxIndex = i;
                }
            }
        }
        if (maxIndex == Integer.MIN_VALUE) {
            System.out.println("No matches");
            return;
        }
        System.out.println(maxIndex);
    }

    public static void printMaxOddIndex(int[] inputNumbers) {
        int max = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 1) {
                if (inputNumbers[i] >= max) {
                    max = inputNumbers[i];
                    maxIndex = i;
                }
            }
        }
        if (maxIndex == Integer.MIN_VALUE) {
            System.out.println("No matches");
            return;
        }
        System.out.println(maxIndex);
    }

    public static void printMinEvenIndex(int[] inputNumbers) {


        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 0) {
                if (inputNumbers[i] <= min) {
                    min = inputNumbers[i];
                    minIndex = i;
                }
            }
        }
        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No matches");
            return;
        }
        System.out.println(minIndex);
    }

    public static void printMinOddIndex(int[] inputNumbers) {


        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 1) {
                if (inputNumbers[i] <= min) {
                    min = inputNumbers[i];
                    minIndex = i;
                }
            }
        }

        if (minIndex == Integer.MAX_VALUE) {
            System.out.println("No matches");
            return;
        }
        System.out.println(minIndex);
    }

    public static void printFirstCountEven(int[] inputNumbers, String[] input) {
        int count = Integer.parseInt(input[1]);
        if (count > inputNumbers.length) {
            System.out.println("Invalid count");
        }
        int counter = 0;
        int[] onlyEvenArray = new int[inputNumbers.length];
        // for loop to exchange all with - 1 and count the evens
        for (int i = 0; i < inputNumbers.length; i++) {
            if (inputNumbers[i] % 2 == 0) {
                onlyEvenArray[i] = inputNumbers[i];
                counter++;
            } else {
                onlyEvenArray[i] = -1;
            }
        }
        int[] countedEvenArray = new int[counter];
        int localCounter = 0;
        for (int j = 0; j < inputNumbers.length; j++) {
            if (inputNumbers[j] % 2 == 0 && localCounter < counter) {
                countedEvenArray[localCounter] = inputNumbers[j];
                localCounter++;
            }
        }

        System.out.println(countedEvenArray.toString());
    }


}