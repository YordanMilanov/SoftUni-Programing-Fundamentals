import java.util.Scanner;

public class spaceTravel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|+");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {
            String[] inputCommand = input[i].split(" ");
            if (inputCommand[0].equals("Titan")) {
                System.out.println("You have reached Titan, all passengers are safe.");
                return;
            }
            int inputNumber = Integer.parseInt(inputCommand[1]);
            switch (inputCommand[0]) {
                case "Travel":
                    if (inputNumber <= fuel) {
                        fuel -= inputNumber;
                        System.out.printf("The spaceship travelled %d light-years.\n", inputNumber);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Enemy":
                    if (ammunition >= inputNumber) {
                        ammunition -= inputNumber;
                        System.out.printf("An enemy with %d armour is defeated.\n", inputNumber);
                    } else if (ammunition < inputNumber && fuel >= inputNumber * 2) {
                        fuel -= inputNumber * 2;
                        System.out.printf("An enemy with %d armour is outmaneuvered.\n", inputNumber);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Repair":
                    ammunition += inputNumber * 2;
                    fuel += inputNumber;
                    System.out.printf("Ammunitions added: %d.\n", inputNumber * 2);
                    System.out.printf("Fuel added: %d.\n", inputNumber);
                    break;
            }
        }
    }
}

