package entity;

import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingFloor {
    private final Map<Integer, List<ParkingSpot>> spots;
    private final int floorNumber;

    public ParkingFloor (int floorNumber) {
        this.floorNumber = floorNumber;
        this.spots = new ConcurrentHashMap<>();
    }

    public void addSpot(ParkingSpot spot) {
        spots.putIfAbsent(floorNumber, new ArrayList<>());
        List<ParkingSpot> parkingSpots = spots.get(floorNumber);
        parkingSpots.add(spot);
    }

    public synchronized Optional<ParkingSpot> findAvailableSpot(Vehicle vehicle) {
        return spots.values().stream().flatMap(List::stream).filter(spot -> !spot.isAvailable() && spot.canParkVehicle(vehicle)).findFirst();
    }

    public synchronized List<ParkingSpot> getSpots(int floorNumber) {
        return spots.get(floorNumber);
    }
}
