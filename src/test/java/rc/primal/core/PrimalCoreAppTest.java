package rc.primal.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimalCoreAppTest {
	@Test
	public void test_getMessage_ShouldReturnRunningMessage() {
		assertEquals("Primal Core is running", PrimalCoreApp.getMessage());
	}
}
