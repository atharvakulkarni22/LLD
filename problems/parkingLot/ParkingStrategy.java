import entity.ParkingFloor;
import entity.ParkingSpot;
import vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class ParkingStrategy {
    public Optional<ParkingSpot> findSpot(Vehicle vehicle, List<ParkingFloor> floorList) {
        for (ParkingFloor floor : floorList) {
            Optional<ParkingSpot> spot = floor.findAvailableSpot(vehicle);
            if (spot.isPresent()) {
                return spot;
            }
        }
        return Optional.empty();
    }
}
