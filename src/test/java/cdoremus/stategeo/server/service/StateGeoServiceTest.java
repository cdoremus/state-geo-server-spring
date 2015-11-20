package cdoremus.stategeo.server.service;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import cdoremus.stategeo.server.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=TestConfig.class)
@Transactional
@TransactionConfiguration(defaultRollback = true)
@WebAppConfiguration
public class StateGeoServiceTest {

	@Inject
	private WebApplicationContext context;
	private MockMvc mockMvc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@After
	public void tearDown() throws Exception {
		mockMvc = null;
	}

	@Test
	public void testFindAdjacentStates() throws Exception{
		mockMvc.perform(get(StateGeoService.ADJACENT_STATES_PATH))
			.andExpect(status().isOk());			
	}

	@Test
	public void testFindAllStates() throws Exception {
		mockMvc.perform(get(StateGeoService.ADJACENT_STATES_PATH))
		.andExpect(status().isOk());			
	}

}
