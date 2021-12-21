package Task2.Factory;

public class VehicleFactory {
	public Vehicle InstantiateVehicle(String type) {
		Vehicle vehicle;
		switch(type) {
		case "CAR":
			vehicle = new Car();
			break;
		case "PLANE":
			vehicle = new Plane();
			break;
		case "BOAT":
			vehicle = new Boat();
			break;
		default:
			vehicle = null;
		}
		return vehicle;
	}
}