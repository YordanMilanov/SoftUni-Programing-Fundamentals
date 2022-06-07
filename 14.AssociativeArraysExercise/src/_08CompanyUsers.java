import java.util.*;

public class _08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        while(!input.equals("End")) {
            String [] data = input.split(" -> ");
            String company = data[0];
            String ID = data[1];

            companyEmployees.putIfAbsent(company, new ArrayList<>());

            if (!companyEmployees.get(company).contains(ID)) {
                companyEmployees.get(company).add(ID);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet()) {
            System.out.printf("%s%n",entry.getKey());
            entry.getValue().forEach((s -> System.out.printf("-- %s%n", s)));
        }
    }
}
