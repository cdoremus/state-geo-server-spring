package cdoremus.stategeo.server.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdjacentStateRepository extends MongoRepository<AdjacentState, String> {

	public List<AdjacentState> findAllByOrderByNameAsc();
}
