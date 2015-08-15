package cdoremus.stategeo.server.data;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="adjacent_states")
public class AdjacentState implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String[] adjacent;
	
	public AdjacentState(){
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAdjacent() {
		return adjacent;
	}

	public void setAdjacent(String[] adjacent) {
		this.adjacent = adjacent;
	}
	
}
