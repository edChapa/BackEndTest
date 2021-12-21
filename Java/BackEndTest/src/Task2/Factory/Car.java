package Task2.Factory;

public class Car implements Vehicle {

	@Override
	public String doSomething() {
		System.out.println("This a car object");
		return "This a car object";
	}
}
