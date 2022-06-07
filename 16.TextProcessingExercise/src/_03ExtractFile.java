import java.util.Scanner;

public class _03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();

        String filtered = filePath.substring(filePath.lastIndexOf("\\") + 1);
        String [] data = filtered.split("\\.");
        System.out.printf("File name: %s%nFile extension: %s", data[0], data[1]);
    }
}
