package Demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"} )
public class TestNGGroupsDemo {
	
	@Test(groups = {"sanity"} )
	public void test1() {
		System.out.println("This is Test1");
	}
	
	@Test(groups = {"sanity","smoke"} )
	public void test2() {
		System.out.println("This is Test2");
	}
	
	@Test(groups = {"sanity","regression"} )
	public void test3() {
		System.out.println("This is Test3");
	}
	
	@Test(groups = {"windows.regression2"} )
	public void test4() {
		System.out.println("This is Test4");
	}
	@Test(groups = {"linux.regression2"} )
	public void test5() {
		System.out.println("This is Test5");
	}


}
