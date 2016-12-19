package chances.traing.jdk8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStart {
	static List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

	public void oldRemove(String name) {
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String aName = (String) iterator.next();
			if (aName.equals(name)) {
				iterator.remove();
			}
		}
	}

	public void remove(String name) {
		names.removeIf(s -> s.equals(name));
	}

	public void filter(String key) {
		names.stream().filter(s -> s.contains(key)).findAny().orElse(null);
	}

	public void toMap() {
		List<Person> persons = getPersons();
		Map<String, Person> personMap = persons.stream()
				.collect(Collectors.toMap(Person::getName, Function.identity()));

	}

	public void group() {
		List<Person> persons = getPersons();
		Map<Integer, List<Person>> groups = persons.stream().collect(Collectors.groupingBy(Person::getAge));

	}

	public void partitioning() {
		List<Person> persons = getPersons();
		persons.stream().collect(Collectors.partitioningBy(p -> p.getAge() < 18));
	}
	
	public void start() {
		names.parallelStream().filter(w -> w.length() > 4).count();
	}

	public void file() {
		Path path = Paths.get("text.txt");
		try (Stream<String> lines = Files.lines(path)) {
			lines.map(String::toLowerCase);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void limit() {
		names.parallelStream().skip(1).limit(2);
	}

	public void collect() {
		names.stream().collect(Collectors.joining(","));
	}



	public List<Person> getPersons() {
		Path path = Paths.get("person.txt");
		ArrayList<Person> arrs = new ArrayList<Person>();
		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(s -> {
				String[] values = s.split(",");
				arrs.add(new Person(values[0], Integer.parseInt(values[1])));
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrs;
	}

}
