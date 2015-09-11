package cdoremus.stategeo.server.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cdoremus.stategeo.server.data.AdjacentState;
import cdoremus.stategeo.server.data.AdjacentStateRepository;
import cdoremus.stategeo.server.data.State;
import cdoremus.stategeo.server.data.StateRepository;
import cdoremus.stategeo.server.data.User;
import cdoremus.stategeo.server.data.UserQuiz;
import cdoremus.stategeo.server.data.UserQuizRepository;
import cdoremus.stategeo.server.data.UserRepository;

@RestController
public class StateGeoService {

	private static final String USER_PATH = "/user";
	private static final String ADJACENT_STATES_PATH = "/adjacentStates";
	private static final String STATES_PATH = "/states";
	private static final String USER_QUIZ_PATH = "/userQuiz";
	
	@Inject
	private UserRepository userRepository;
	@Inject
	private AdjacentStateRepository adjacentStateRepository; 
	@Inject
	private StateRepository stateRepository; 
	@Inject
	private UserQuizRepository userQuizRepository;
	

	@RequestMapping(value=ADJACENT_STATES_PATH, method=RequestMethod.GET)
	public List<AdjacentState> findAdjacentStates() {
		
		List<AdjacentState> states = adjacentStateRepository.findAllByOrderByName();		
		
		return states;
	}
	
	@RequestMapping(value=STATES_PATH, method=RequestMethod.GET)
	public List<State> findAllStates() {
		
		List<State> states = stateRepository.findAllByOrderByName();		
		
		return states;
	}

	@RequestMapping(value=USER_PATH + "/{username}", method=RequestMethod.POST)
	public User findUserByUsername(@PathVariable String username) {
		
		User user = userRepository.findByUsername(username);
		
		System.out.println("User request: " + user);
		
		return user;
	}
	
	
	@RequestMapping(value=USER_QUIZ_PATH, method=RequestMethod.POST)
	public UserQuiz saveUserQuiz(@RequestBody UserQuiz userQuiz) {
		
		UserQuiz newUserQuiz = userQuizRepository.save(userQuiz);
		
		return newUserQuiz;
	}
	
}
