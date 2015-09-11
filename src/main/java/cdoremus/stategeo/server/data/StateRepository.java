package cdoremus.stategeo.server.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StateRepository extends MongoRepository<State, String> {

	public List<State> findAllByOrderByName();
}
