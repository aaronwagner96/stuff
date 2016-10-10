package stuff;

import java.util.UUID;

/**
 * Easy to use serial-key generator. <br>
 * Creates keys like '58JD-95HA-5DN8-OSS7-2F0K'.
 * 
 * @author Aaron Wagner <br>
 *         created 2016/01
 * 
 */

public class SerialGenerator {
	String key;

	public SerialGenerator() {

		createSerial();
		System.out.println(key);
	}

	private void createSerial() {
		key = UUID.randomUUID().toString();
	}
}
