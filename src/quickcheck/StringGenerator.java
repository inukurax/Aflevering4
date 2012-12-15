package quickcheck;

public class StringGenerator extends Generator<String>{
	
	private static final int DEFAULT_MAX_STR_SIZE = 5;
	
	private int size;
	
	public StringGenerator() {
		this(DEFAULT_MAX_STR_SIZE );
	}

	public StringGenerator(int strSize) {
		this.size = strSize;
	}
	
	/**
	 * Converts a integer to a String of a character
	 * @param num a integer between 1 and 26
	 * @return the corresponding letter A -> Z
	 */
	private String intToStrCharacter(final int num) {
		char s = (char)('a' + (num - 1));
		return  Character.toString(s);         
	}
	
	private int randomInt(final int min, final int max)  {
		return random.nextInt(max) + min;
	}
	
	private String randomString(int length) {
		String result = "";
		for (int i = 1; i <= length;i++) {
			String str = intToStrCharacter(randomInt(1,26));
			result = result + str;
		}
		return result;
		
	}

	@Override
	public String next() {
		return randomString(this.size);
	}

}
