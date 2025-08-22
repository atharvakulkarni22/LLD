import entity.ParkingFloor;
import entity.ParkingSpot;
import entity.ParkingTicket;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private List<ParkingFloor> floors = new ArrayList<>();
    private static ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;
    private Map<String, ParkingTicket> tickets;

    private ParkingLot() {
        parkingStrategy = new ParkingStrategy();
        tickets = new ConcurrentHashMap<>();
    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public String parkVehicle(Vehicle vehicle) {
        Optional<ParkingSpot> availableSpot = parkingStrategy.findSpot(vehicle, floors);
        if (availableSpot.isPresent()) {
            ParkingSpot spot = availableSpot.get();
            spot.parkVehicle(vehicle);
            ParkingTicket ticket = new ParkingTicket(spot, vehicle);
            tickets.put(vehicle.getLicensePlateNo(), ticket);
            return "Vehicle" + vehicle.getLicensePlateNo() + "is Parked at spot - " + spot.getSpotId();
        } else {
            return "Parking is full";
        }
    }

    public String unParkVehicle(Vehicle vehicle) {
        ParkingTicket ticket = tickets.remove(vehicle.getLicensePlateNo());
        if (ticket == null) {
            return "Ticket not found";
        }
        ParkingSpot spot = ticket.getParkingSpot();
        spot.unParkVehicle();
        return "Vehicle " + vehicle.getLicensePlateNo() + "unparked";
    }

}
