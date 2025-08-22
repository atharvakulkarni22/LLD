package entity;

import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingSpot {
    private final String spotId;
    private boolean isOccupied;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(String spotId, VehicleType vehicleType) {
        this.spotId = spotId;
        this.isOccupied = false;
        this.vehicleType = vehicleType;
        parkedVehicle = null;
    }

    public String getSpotId() {
        return spotId;
    }

    public synchronized boolean isAvailable() {
        return isOccupied;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        isOccupied = true;
        parkedVehicle = vehicle;
    }

    public void unParkVehicle() {
        parkedVehicle = null;
        isOccupied = false;
    }

    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == vehicleType;
    }


}
