package Tutorial2;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Pune1 {
	@Before
	public void setUp()
	{
		System.out.println("Before Hooks");
	}

	@After
	public void tearDown()
	{
		System.out.println("After Hooks");
		System.out.println("======================================");
	}
	
	@BeforeStep
	public void beforestep()
	{
		System.out.println("Before Step");
	}
	
	@AfterStep 
	public void afterstep()
	{
		System.out.println("After Step ");
		System.out.println("---------------------------------");
	}
}
