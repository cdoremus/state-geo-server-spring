package cdoremus.stategeo.server.data;

import static org.junit.Assert.*;

import java.util.Arrays;

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
public class UserRepositoryTest {

	@Inject
	private UserRepository repository; 

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
	public void testFindByUsername_Found() {
		User user = repository.findByUsername("craig");
		assertNotNull(user);
		assertEquals("Craig", user.getDisplayName());
		String[] roles = user.getRoles();
		Arrays.sort(roles);
		assertEquals("admin", roles[0]);
		assertEquals("user", roles[1]);
		assertEquals(2, roles.length);
	}

	@Test
	public void testFindByUsername_NotFound() {
		User user = repository.findByUsername("gdfsdfa");
		assertNull(user);
	}
}
