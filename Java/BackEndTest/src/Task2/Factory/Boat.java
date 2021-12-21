package Task2.Factory;

public class Boat implements Vehicle {

	@Override
	public String doSomething() {
		System.out.println("This is a boat object");
		return "This is a boat object";
	}
}
