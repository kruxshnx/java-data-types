public class Main {
    public static void main(String[] args){
        CustomerRentalProfile customerProfile = new CustomerRentalProfile(
            "Govinda Krishna Arjangi", "9876543210");
        customerProfile.bookVehicle(new Sedan("DL01AB1234"), 3);
        customerProfile.bookVehicle(new TwoWheeler("DL02CD5678"), 3);
        System.out.println("\nFinal Invoice for " + customerProfile.getCustomerProfile() + 
                            ": " + customerProfile.generateInvoice());
    }
}
abstract class Vehicle {
    protected String vehicleCategory;
    protected String registrationNumber;
    
    public Vehicle(String category, String regNo) {
        this.vehicleCategory = category;
        this.registrationNumber = regNo;
    }
    
    public abstract String getRentalDetails(int rentalDays);
    public String getVehicleSpecification() {
        return registrationNumber + " (" + vehicleCategory + ")";
    }
}
class Sedan extends Vehicle {
    
    public Sedan(String regNo) {
        super("Sedan", regNo);
    }
    @Override
    public String getRentalDetails(int rentalDays) {
        return "Sedan booked for " + rentalDays + " days.";
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(String regNo) {
        super("TwoWheeler", regNo);
    }
    @Override
    public String getRentalDetails(int rentalDays) {
        return "Two-Wheeler booked for " + rentalDays + " days.";
    }
}

class CustomerRentalProfile {
    private String customerFullName;
    private String customerContactNumber;
    private Vehicle[] bookedVehicles;
    private int totalBookings;
    
    public CustomerRentalProfile(String name, String contact) {
        this.customerFullName = name;
        this.customerContactNumber = contact;
        this.bookedVehicles = new Vehicle[5];
        this.totalBookings = 0;
    }
    public void bookVehicle(Vehicle selectedVehicle, int rentalDurationDays) {
        if (totalBookings < bookedVehicles.length) {
            bookedVehicles[totalBookings++] = selectedVehicle;
            System.out.println(customerFullName + " booked " +
                                selectedVehicle.getVehicleSpecification() + " for " +
                                rentalDurationDays + " days.");
        } else {
            System.out.println("Booking limit reached.");
        }
    }
    public String generateInvoice() {
        return "Total vehicles rented: " + totalBookings;
    }
    public String getCustomerProfile() {
        return customerFullName + " (" + customerContactNumber + ")";
    }
}