package streamApiSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ken", 100));
		students.add(new Student("Shin", 60));
		students.add(new Student("Takuya", 80));

		System.out.println(students);
		students.stream().filter(s -> s.getScore() >= 70).forEach(s -> System.out.println(s.getName()));
		Collections.sort(students, (student1, student2) -> Integer.compare(student1.getScore(), student2.getScore()));
		System.out.println(students);
	}

}
