import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hello.hackathon.GreetingController;

public class GreetingTest {

	@Autowired
	GreetingController greetingController;

	@Before
	public void init() {
		System.out.println("Test is running successfully.");
	}

	@Test
	public void testMakeBooking() {
		greetingController.hello();

	}

}
