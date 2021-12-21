package Task2.Factory;

public class Plane implements Vehicle {

	@Override
	public String doSomething() {
		System.out.println("This is a plane object");
		return "This is a plane object";
	}
}
