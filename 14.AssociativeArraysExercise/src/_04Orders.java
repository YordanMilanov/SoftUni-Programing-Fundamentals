import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read input
        String line = scanner.nextLine();
        //created map with String(key - name of the product) and Class Product with parameters(name,price,Quantity)
        Map<String, Product> products = new LinkedHashMap<>();
        while(!line.equals("buy")) {
            String [] data = line.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            //we check if the products Map contains the product
            if (products.containsKey(name)) {
                // we set new price of the product
                products.get(name).setPrice(price);
                // we add the given quantity to the quantity of the product wich it already has
                products.get(name).setQuantity(products.get(name).getQuantity() + quantity);
            } else {
                // if the product does not exist in the map we add it with its name price and quantity
                products.put(name, new Product(name, price, quantity));
            }
            line = scanner.nextLine();
        }
        //in the end we printout everything
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n",k, v.getPrice() * v.getQuantity()));
    }

    static class Product {
        String name;
        double price;
        double quantity;

        public Product(String name, double price, double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }
    }
}
