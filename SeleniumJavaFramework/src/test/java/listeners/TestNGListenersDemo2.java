package listeners;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo2 {
    
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside Test 6");
	}
	
}
