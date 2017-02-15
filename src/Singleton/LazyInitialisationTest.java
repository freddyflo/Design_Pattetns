package Singleton;

public class LazyInitialisationTest {

	public static void main(String[] args) {
		LazyInitialisation lazyInitialisation = LazyInitialisation.getInstance();
		LazyInitialisation lazyInitialisation2 = LazyInitialisation.getInstance();

		System.out.println("lazyInitialisation: " + lazyInitialisation.hashCode());
		System.out.println("lazyInitialisation2: " + lazyInitialisation2.hashCode());
	}

}
