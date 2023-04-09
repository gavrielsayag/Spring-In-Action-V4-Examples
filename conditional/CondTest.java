import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=sound.system.cd.player.CondConfig.class)
public class CondTest {

  @Autowired
  private ApplicationContext context;
  
  @BeforeClass
  public static void SetEnv()
  {
	  System.setProperty("gavriel", "im here"); //if we are doing this - we will pass the test, if not, we will fail 
  }
  @Test
  public void shouldNotBeNull() {
    assertTrue(context.containsBean("HelloHello"));
  }
  
}
