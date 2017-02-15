package Singleton;



public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	// Private constructor 
	private StaticBlockSingleton(){}

	// static block initialization for exception handling 
	static{
		try{
			instance = new StaticBlockSingleton();
		} catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}
