package chances.traing.jdk8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDemo {
	public void readline(){
		try(Stream<String> lines = Files.lines(Paths.get("person.txt"))){
			lines.forEach(s->System.out.print(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void list(){
		try(Stream<Path> paths = Files.list(Paths.get("."))){
			paths.forEach(s->System.out.print(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void walk(){
		try(Stream<Path> paths = Files.walk(Paths.get("."))){
			paths.forEach(s->System.out.print(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
