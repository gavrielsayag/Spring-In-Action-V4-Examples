import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sound.system.cd.player.CDPlayer;
import sound.system.cd.player.CDPlayerComponentScanConfig;
import sound.system.cd.player.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:main_config.xml")
public class CDPlayerXMLConfigTest {
	
	@Autowired
	private CDPlayer player;
	@Autowired
	private CompactDisc cd;
	@Autowired
	private CDPlayer player2;
	@Autowired
	private CompactDisc cd2;

	@Test
	public void equals() 
	{
		assertTrue(player == player2);
		assertTrue(cd == cd2);
		assertTrue(cd == player.GetDisc());
	}
	
	@Test
	public void cdShouldNotBeNull() 
	{
		assertNotNull(cd);
	}
	
	@Test
	public void TestPlay()
	{
		assertNotNull(player);
		assertNotNull(player.GetDisc());
		player.Play();	
	}

}
