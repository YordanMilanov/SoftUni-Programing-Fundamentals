import java.util.Scanner;

public class Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double LightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double AllSabres = students * 1.1;

        double bill = (Math.ceil(AllSabres) * LightSabersPrice + students * robePrice + students * beltPrice);

        bill -= Math.floor(students / 6) * beltPrice;

        double LeftNeeded = Math.abs(money - bill);

        if ( money >= bill) {
            System.out.printf("The money is enough - it would cost %.2flv.", bill);
        } else {
        System.out.printf("George Lucas will need %.2flv more.", LeftNeeded);
        }
    }
}
