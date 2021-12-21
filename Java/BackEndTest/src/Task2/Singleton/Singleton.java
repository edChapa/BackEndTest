package Task2.Singleton;

public class Singleton {
	private static Singleton instance;
	String message;
	
	private Singleton() {
		this.message = "This is a singleton class!";
	}
	
	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();	
		return instance; 
	}
}