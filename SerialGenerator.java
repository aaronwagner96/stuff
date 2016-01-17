package stuff;

import java.util.Random;

/**
 * Easy to use serial-key generator. <br>
 * Creates keys like '58JD-95HA-5DN8-OSS7-2F0K'.
 * 
 * @author Aaron Wagner <br>
 *         created 2016/01
 * 
 */

public class SerialGenerator {

	String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
			"x", "y", "z" };
	StringBuilder key_builder;
	String key;
	Random random = new Random();

	public SerialGenerator() {

		createSerial();
		System.out.println(key);
	}

	private void createSerial() {
		int index;
		key_builder = new StringBuilder();
		while (key_builder.length() <= 24) {
			index = random.nextInt(2);

			switch (index) {
			case 0: // digit
				key_builder.append(random.nextInt(10));
				break;
			case 1: // character
				key_builder.append(alphabet[random.nextInt(26)].toUpperCase());
				break;
			}
		}
		key = key_builder.toString();
		key = key.substring(0, 4) + "-" + key.substring(5, 9) + "-"
				+ key.substring(11, 15) + "-" + key.substring(16, 20) + "-"
				+ key.substring(21);
	}
}
