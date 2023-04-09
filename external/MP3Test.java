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

import sound.system.cd.player.MP3;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=sound.system.cd.player.MP3Config.class)
public class MP3Test {

  @Autowired
  private ApplicationContext context;
  @Autowired
  MP3 my;
  
  @Test
  public void shouldNotBeNull() {
    my.display();
  }
  
}
