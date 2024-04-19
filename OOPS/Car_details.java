package OOPS;
import java.util.*;
public class Car_details {
    public static void main(String[] args) {
        CarDetailsDisplay obj = new CarDetailsDisplay();
        obj.getInfo();
        obj.setInfo();

        // Close the Scanner to avoid resource leaks
        obj.sc.close();
    }
}

class Car_info {
    int carId;
    String carName;
    double carPrice;
    Scanner sc = new Scanner(System.in);

    void getInfo() {
        System.out.println("Enter a Car Id:");
        carId = sc.nextInt();

        // Consume the newline character left by nextInt()
        sc.nextLine();

        System.out.println("Enter a Car name and Price: ");
        carName = sc.nextLine();
        carPrice = sc.nextDouble();
    }
}

class CarDetailsDisplay extends Car_info {
    void setInfo() {
        System.out.println("******Details of Car******");
        System.out.println("Car Id is: " + carId);
        System.out.println("Car Name is: " + carName);
        System.out.println("Car Price: " + carPrice);
    }
}

