import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 5;
        int num2 = 10;
        check(num1,num2);
        num1 = num1;
        num2 = num2;
        System.out.println(num1 + " " + num2);
    }

    public static void check (int num1, int num2) {
        num1 += 2;
        num2 += 5;
    }
}
