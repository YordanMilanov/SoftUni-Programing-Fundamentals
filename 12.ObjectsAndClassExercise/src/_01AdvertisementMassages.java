import java.util.Random;
import java.util.Scanner;

public class _01AdvertisementMassages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Massage massage = new Massage();
        massage.printMassages(n);

    }





    static class Massage {

        String [] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String [] events = {"Now I feel good.","I have succeeded with this product.", "Makes miracles.",
        "I am happy of the results!" ,"I cannot believe but now I feel awesome."
                ,"Try it  yourself, I am very satisfied.","I feel great!"};
        String [] names = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();

        void printMassages (int massages) {
            random.nextInt(this.phrases.length);

            for (int i = 0; i < massages; i++) {

            System.out.printf("%s %s %s - %s%n", this.phrases[random.nextInt(this.phrases.length)],
                    this.events[random.nextInt(this.events.length)],
                    this.names[random.nextInt(this.names.length)],
                    this.cities[random.nextInt(this.cities.length)]);
            }
        }
    }
}

