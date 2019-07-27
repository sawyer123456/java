import java.io.FileReader;
import java.io.IOException;

public class throwss {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;

		reader = new FileReader("D:");
		System.out.println(reader.read());
		reader.close();

	}
}
