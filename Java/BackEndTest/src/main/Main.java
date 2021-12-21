package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import Task1.Async;
import Task2.Factory.VehicleFactory;
import Task2.Singleton.Singleton;
import Task4.VehicleFactoryTest;

public class Main {

	public static void main(String[] args) {
		// Task 1
		Async.downloadFromURL("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/640px-PNG_transparency_demonstration_1.png", "Test.png");
		
		//Task 2
		VehicleFactory vf = new VehicleFactory();
		vf.InstantiateVehicle("CAR");
		vf.InstantiateVehicle("PLANE");
		vf.InstantiateVehicle("BOAT");
		
		Singleton singleInstance = Singleton.getInstance();
		
		//Task 4
		Result result = JUnitCore.runClasses(VehicleFactoryTest.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   }	
}