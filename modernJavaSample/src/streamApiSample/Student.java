package streamApiSample;

public class Student {
	String name = "";
	int score = 0;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score セットする score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	public String toString() {
		return name +":" + score;
	}

}
