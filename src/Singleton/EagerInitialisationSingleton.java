package Singleton;

public class EagerInitialisationSingleton {
	
	private static final EagerInitialisationSingleton instance = new EagerInitialisationSingleton();
	
	// private constructor to avoid client applications to use 
	private EagerInitialisationSingleton(){}
	
	// public static method to access from the outside world
	public static EagerInitialisationSingleton getInstance(){
		return instance;
	}

}
