import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sound.system.cd.player.Try;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= sound.system.cd.player.TryConfig.class)
public class AspectTest {
	
	@Autowired
	Try t;

	@Test
	public void test() throws Exception {
		t.Display();
		t.Display(5);
		t.Display("hello");
		t.Display(6, "hey");
		t.Display(7.6);
	}

}
