package Task4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Task2.Factory.VehicleFactory;

public class VehicleFactoryTest {
	
	VehicleFactory vf = new VehicleFactory();

	@Test
	void testInstantiateVehicleCar() {
		assertEquals("This a car object", vf.InstantiateVehicle("CAR").doSomething());
	}
	@Test
	void testInstantiateVehiclePlane() {
		assertEquals("This is a plane object", vf.InstantiateVehicle("PLANE").doSomething());
	}
	@Test
	void testInstantiateVehicleBoat() {
		assertEquals("This is a boat object", vf.InstantiateVehicle("BOAT").doSomething());
	}
}
