import entity.ParkingFloor;
import entity.ParkingSpot;
import vehicle.Car;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new ParkingSpot("A", VehicleType.CAR));
        floor1.addSpot(new ParkingSpot("B", VehicleType.CAR));
        floor1.addSpot(new ParkingSpot("C", VehicleType.CAR));

        ParkingFloor floor2 = new ParkingFloor(2);
        floor2.addSpot(new ParkingSpot("A", VehicleType.BIKE));
        floor2.addSpot(new ParkingSpot("B", VehicleType.BIKE));

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        Vehicle car1 = new Car("C-100");
        Vehicle car2 = new Car("C-200");
        Vehicle car3 = new Car("C-300");

        Vehicle bike1 = new Car("B-100");
        Vehicle bike2 = new Car("B-200");

        System.out.println(parkingLot.parkVehicle(car1));
        System.out.println(parkingLot.parkVehicle(car2));
        System.out.println(parkingLot.parkVehicle(car3));

        System.out.println(parkingLot.parkVehicle(bike1));
        System.out.println(parkingLot.parkVehicle(bike2));

        System.out.println(parkingLot.unParkVehicle(car1));
        System.out.println(parkingLot.unParkVehicle(bike1));

    }
}
