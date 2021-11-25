package br.com.fabio;
import org.di.framework.Injector;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
    	long startTime = System.currentTimeMillis();
		Injector.startApplication(UserAccountApplication.class);
		Injector.getService(UserAccountClientComponent.class).displayUserAccount();
		long endime = System.currentTimeMillis();
    }
}
