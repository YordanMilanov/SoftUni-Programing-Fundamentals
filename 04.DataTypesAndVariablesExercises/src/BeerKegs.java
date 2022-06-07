import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
            double BiggestVolume = 0;
            String BiggestKeg = "";

        for (int i = 0; i < n; i++) {

            String currentKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > BiggestVolume) {
                BiggestVolume = volume;
                BiggestKeg = currentKeg;
            }
        }
        System.out.printf("%s", BiggestKeg);
    }
}
