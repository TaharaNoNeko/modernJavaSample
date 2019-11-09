package streamApiSample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class listSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");

		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);

		Map<String, String> map = new HashMap<>();
		map.put("1", "Murata");
		map.put("2", "Okada");
		map.put("3", "Tanimoto");

		Stream<Entry<String, String>> stream1 = map.entrySet().stream();
		stream1.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

}
