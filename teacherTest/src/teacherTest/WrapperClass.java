package teacherTest;

public class WrapperClass {
			public static void main(String[] args) {
				byte b=1;
				short s=234;
				int i=56789;
				long l=1234567890L;
				float f=2.0f;
				double d =3.14;
				boolean aa=true;
				char c='a';  //레퍼 클래스 지원 안한다 char형
				
				
				
				
				
				Byte wrappedByte=b;
				Short wrappedShort=s;
				Integer wrappedInt=i;
				Long wrappedLong=l;
				Float wrappedFloat=f;
				Double wrappedDouble=d;
				System.out.println(wrappedByte.byteValue());
				System.out.println(wrappedShort.shortValue());
				System.out.println(wrappedInt.intValue());
				System.out.println(wrappedLong.longValue());
				System.out.println(wrappedDouble.doubleValue());
			}
}
