package entity;

import vehicle.Vehicle;

import java.util.UUID;

public class ParkingTicket {
    public String getTicketId() {
        return ticketId;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    private final String ticketId;
    private ParkingSpot parkingSpot;
    private final Vehicle vehicle;

    public ParkingTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        ticketId = UUID.randomUUID().toString();
    }


}
