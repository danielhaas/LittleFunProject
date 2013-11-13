package fungame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PlayGameTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		PlayGame pg = new PlayGame();
		
		pg.compete("Lizard", "Spock");
		
		int myResult =0;
		
		assertEquals(0, myResult);
		
		
		fail("Not yet implemented");
	}

	
	
}
