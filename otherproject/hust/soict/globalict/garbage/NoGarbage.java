
import java.nio.file.*;
import java.io.IOException;


public class NoGarbage {

	public static void main(String[] args) {
		String filename = "longtextfile.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		try {
		inputBytes = Files.readAllBytes(Paths.get(filename));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b: inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		

	}

}