package vehicle;

public class Vehicle {
    String licensePlateNo;
    VehicleType vehicleType;

    public Vehicle(String licensePlateNo, VehicleType vehicleType) {
        this.licensePlateNo = licensePlateNo;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlateNo() {
        return licensePlateNo;
    }

}
