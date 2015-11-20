package cdoremus.stategeo.server.data;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cdoremus.stategeo.server.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=TestConfig.class)
@Transactional
@TransactionConfiguration(defaultRollback = true)
@WebAppConfiguration
public class StateRepositoryTest {

	@Inject
	private StateRepository repository; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindAllByOrderByName() {
		List<State> stateList= repository.findAllByOrderByName();
		
		assertEquals(50, stateList.size());
		//assure that Alabama is the first state
		assertEquals("Alabama".toLowerCase(), stateList.get(0).getName().toLowerCase());
		//assure that Wyoming is the last state
		assertEquals("Wyoming".toLowerCase(), stateList.get(49).getName().toLowerCase());
	}

}
