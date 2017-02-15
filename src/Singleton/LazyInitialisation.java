package Singleton;


/**
 * Lazy Initialization is good for single threaded environment 
 * @author freddyflo
 *
 */
public class LazyInitialisation {
	
	private static LazyInitialisation instance;
	
	private LazyInitialisation(){}
	
	public static LazyInitialisation getInstance(){
		if( instance == null ){
			instance = new LazyInitialisation();
		}
		return instance;
	}
}
