package chances.traing.jdk7;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FeatureTest {
	Feature aFeature = new Feature();
	@Test
	public void testTryResource() throws FileNotFoundException, IOException {
		aFeature.tryResource();
	}

	@Test
	public void testMutilExeption() {
		aFeature.mutilExeption();

	}

	@Test
	public void testPath() {
		aFeature.path();
	}

	@Test
	public void testFile() {
		aFeature.file();
	}

	@Test
	public void testProcessBuilder() {
		aFeature.processBuilder();
	}

	@Test
	public void testObject() {
		aFeature.object();
	}

	@Test
	public void testBitset() {
		aFeature.bitset();
	}

}
