package WrapperClasss;

public class WrapperClasses {

	public static void main(String[] args) {
		
		byte b1= 56;
		Byte b2 = Byte.valueOf(b1);
		System.out.println(b2);
		byte b5 = b2.byteValue();
		System.out.println(b5);
		
		
		boolean b3 = true;
		Boolean b4 = Boolean.valueOf(b3);
		System.out.println(b4);
		boolean b6 = b4.booleanValue();
		System.out.println(b6);
		
		
		int i = 44;
		Integer i2 = Integer.valueOf(i);
		System.out.println(i2);
		int i3 = i2.intValue();
		System.out.println(i3);
		
		char c1 = 'T';
		Character c2 = Character.valueOf(c1);
		System.out.println(c2);
		char c3 = c2.charValue();
		System.out.println(c3);
		
		long l = 123456;
		Long l2 = Long.valueOf(l);
		System.out.println(l2);
		long l3 = l2.longValue();
		System.out.println(l3);
		
		short s1 = 3;
		Short s2 = Short.valueOf(s1);
		System.out.println(s2);
		short s3 = s2.shortValue();
		System.out.println(s3);
		
		float f = 56.7f;
		Float f2 = Float.valueOf(f);
		System.out.println(f2);
		float f3 = f2.floatValue();
		System.out.println(f3);
		
		double d = 567.8;
		Double d2 = Double.valueOf(d);
		System.out.println(d2);
		double d3 = d2.doubleValue();
		System.out.println(d3);
		
		
		
	}
}
