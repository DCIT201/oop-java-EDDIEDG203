/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Add vehicles
        agency.addVehicle(new Car("C1", "Toyota Camry Se", 50.0, true));
        agency.addVehicle(new Car("C2", "Mercedes Benz c300", 45.0, false));
        agency.addVehicle(new Motocycle("m1", "Ducati", 44));
        agency.addVehicle(new Truck("t1", "Dodge Ram TrX", 94));

        // View vehicles
        agency.viewVehicles();

        // Rent a vehicle
        Customer customer1 = new Customer("Eddie", 25);
        Customer customer2 = new Customer("Lawrence" , 83);
        Customer customer3 = new Customer("Gladys" , 32);

        agency.rentVehicle("C1", customer1, 5);
        agency.rentVehicle("m1", customer2, 2);
        agency.rentVehicle("t1", customer3, 3);


        // View transactions
        agency.viewTransactions();

        // Return a vehicle
        agency.returnRentedVehicle("T1");

        // View transactions again
        agency.viewTransactions();
    }
}
