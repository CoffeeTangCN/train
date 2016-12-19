package chances.traing.jdk7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.BitSet;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Feature {
	
	
	public void tryResource() throws FileNotFoundException, IOException {
		try (OutputStream out = new FileOutputStream("person.txt")) {

		}

	}

	public void mutilExeption() {
		try (OutputStream out = new FileOutputStream("test.txt")) {
			URL aUrl = new URL("www.chances.com.cn");
		} catch (MalformedURLException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void path() {
		Path myPath = Paths.get("d:/devtools/text.txt");
		File aFile = myPath.toFile();
		aFile.toPath();
	}

	public void file() {
		Path myPath = Paths.get("d:/devtools/text.txt");
		try {
			Files.readAllLines(myPath);

			byte[] bytes = Files.readAllBytes(myPath);
			
			Files.createTempFile(null,".txt");
		} catch (IOException e) {
			Logger.getGlobal().log(Level.WARNING, e.getMessage(), e);;
		}

	}

	
	
	public void processBuilder(){
		ProcessBuilder builder = new ProcessBuilder("notepad.exe", "person.txt");
		builder.redirectError(Paths.get("error.log").toFile());
		builder.redirectOutput(Paths.get("out.log").toFile());
		Process process;
		try {
			process = builder.start();
			process.waitFor();
		} catch (IOException  |InterruptedException e)  {
			Logger.getGlobal().log(Level.WARNING, e.getMessage(), e);;
		}
	
}
	
	public void object(){
			Objects.isNull(null);
			Objects.hash("coffee");
			Objects.equals("coffee", "coffee");
	}
	
	public void bitset(){
		byte[]  mybytes= new byte[]{0,1,0,1};
		byte[]  yourbytes= new byte[]{1,0,1,0};
		BitSet myBitSet  = BitSet.valueOf(mybytes);
		BitSet yourBitSet  = BitSet.valueOf(yourbytes);

		 myBitSet.or(yourBitSet);
		 System.out.println(myBitSet);
	
	}
}
