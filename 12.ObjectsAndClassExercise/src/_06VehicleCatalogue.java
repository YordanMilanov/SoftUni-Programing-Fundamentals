import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Vehicle> VehicleList = new ArrayList<>();

        //first part of the task
        while (!line.equals("End")) {
            String [] data = line.split(" ");
            Vehicle vehicle = new Vehicle(data[0],data[1],data[2],Integer.parseInt(data[3]));
            VehicleList.add(vehicle);
            line = scanner.nextLine();
        }

        //second part of the task
        line = scanner.nextLine();
        while(!line.equals("Close the Catalogue")) {
            String model = line;

            line = scanner.nextLine();
            VehicleList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));
        }
        //third part of the task

        //we create a list only of cars
         List<Vehicle> cars = VehicleList.stream()
                .filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = VehicleList
                .stream()
                .filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        double carsAverageHP = averageHP(cars);
        double trucksAverageHP = averageHP(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHP);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksAverageHP);
    }

    static double averageHP (List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        } else {
            double v = vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
            return v;
        }
    }


    static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format(
                    "Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %d",
                    getType().toUpperCase().charAt(0) + getType().substring(1), this.model, this.color, this.horsePower);
            // getType().toUpperCase().charAt(0) + getType().substring(1) <- we make the first letter Upper and from the first with small
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }
    }
}
