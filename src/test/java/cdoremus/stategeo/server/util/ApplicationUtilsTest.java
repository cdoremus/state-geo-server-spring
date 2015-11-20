package cdoremus.stategeo.server.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApplicationUtilsTest {

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
	public void testGetPasswordHash_OK() {
		String password = "foo";
		byte[] hash1 = ApplicationUtils.createPasswordHash(password);
		byte[] hash2 = ApplicationUtils.createPasswordHash(password);
		
		assertEquals(new String(hash1), new String(hash2));
	}

	@Test
	public void testGetPasswordHash_BadAlgorithm_ReturnsNull() {
		String password = "foo";
		assertNull(ApplicationUtils.createPasswordHash(password, "cdewgewq"));
		
	}
}
