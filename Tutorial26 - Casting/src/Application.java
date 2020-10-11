public class Application {

	public static void main(String[] args) {
		int intValue = 888;
		short shortValue = 55;
		byte byteValue = 20;
		long longValue = 23355;
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)129;
		
		System.out.println(byteValue);
	}

}
