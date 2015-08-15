package cdoremus.stategeo.server.data;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String>{

	public User findByUsername(String username);
}