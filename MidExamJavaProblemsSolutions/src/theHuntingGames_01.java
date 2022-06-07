import java.util.Scanner;

public class theHuntingGames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDayForOnePlayerNeeded = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePlayerNeeded = Double.parseDouble(scanner.nextLine());

        double totalWater = waterPerDayForOnePlayerNeeded * days * players;
        double totalFood = foodPerDayForOnePlayerNeeded * days * players;

        for (int i = 1; i <= days; i++) {
            double lostEnergy = Double.parseDouble(scanner.nextLine());
            energy -= lostEnergy;
            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                return;
            }

            if (i % 2 == 0) { //water needed
                energy *= 1.05;
                totalWater -= 0.3*totalWater;
            }

            if (i % 3 == 0) { //food needed
                energy *= 1.1;
                totalFood -= totalFood / players;
            }

            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                return;
            }
        }

        if (energy > 0) {
        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
    }
}
