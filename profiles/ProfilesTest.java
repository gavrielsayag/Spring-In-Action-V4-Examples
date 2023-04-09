import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sound.system.cd.player.WhoAmI;

import org.junit.Test;

public class ProfilesTest {

	@RunWith(SpringJUnit4ClassRunner.class)
	  @ContextConfiguration(classes=sound.system.cd.player.WhoAmIConfig.class)
	  @ActiveProfiles("dev")
	  public static class DevTest {
	    @Autowired
	    private WhoAmI who;
	    
	    @Test
	    public void dev() {
	      assertNotNull(who); 
	      assertTrue(who.getWhoAmI().equals("I am dev"));
	    }
	  }

	@RunWith(SpringJUnit4ClassRunner.class)
	  @ContextConfiguration(classes=sound.system.cd.player.WhoAmIConfig.class)
	  @ActiveProfiles("prod")
	  public static class ProdTest {
	    @Autowired
	    private WhoAmI who;
	    
	    @Test
	    public void prod() {
	      assertNotNull(who); 
	      assertTrue(who.getWhoAmI().equals("I am prod"));
	    }
	  }
	
	@RunWith(SpringJUnit4ClassRunner.class)
	  @ContextConfiguration(classes=sound.system.cd.player.WhoAmIConfig.class)
	  public static class NoProfileTest {
	    @Autowired
	    private WhoAmI who;
	    
	    @Test
	    public void unknown() {
	      System.out.println(who.getWhoAmI());
	    }
	  }

}


