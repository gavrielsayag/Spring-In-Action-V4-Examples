import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sound.system.cd.player.Try;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=sound.system.cd.player.TryConfig.class)
public class PrototypeTest {
	
	@Autowired
	Try t1;
	@Autowired
	Try t2;
	@Autowired
	Try t3;
	@Autowired
	Try t4;
	@Autowired
	Try t5;
	

	@Test
	public void test() {
		assertTrue(5 == Try.ctr);
	}

}
