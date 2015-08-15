package cdoremus.stategeo.server.data;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user_quizzes")
public class UserQuiz implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	String id;
	String username;
	int correctAnswerCount;
	int totalAnswerCount;

	public UserQuiz() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCorrectAnswerCount() {
		return correctAnswerCount;
	}

	public void setCorrectAnswerCount(int correctAnswerCount) {
		this.correctAnswerCount = correctAnswerCount;
	}

	public int getTotalAnswerCount() {
		return totalAnswerCount;
	}

	public void setTotalAnswerCount(int totalAnswerCount) {
		this.totalAnswerCount = totalAnswerCount;
	}
	
}
