package chances.traing.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	static List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

	public Comparator<String> first() {
		Comparator<String> comp = (f, s) -> Integer.compare(f.length(), s.length());
		return comp;
	}

	public void second() {
		Collections.sort(names, first());
	}

	
	public  void runThread(String name) {
		Runnable aRunnable = () -> {
			System.out.print(name);
		};
		Thread aThread = new Thread(aRunnable);
		aThread.start();
	}

	public void sort() {

		String[] arrs = names.toArray(new String[names.size()]);
		Arrays.sort(arrs, String::compareToIgnoreCase);
	}

}
