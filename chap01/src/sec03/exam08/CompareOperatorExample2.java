package sec03.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		System.out.println("Compare double type");
		int v2 = 1;
		double v3= 1.0;
		System.out.println(v2==v3);
		
		System.out.println("\nCompare float type");
		double v4=0.1;
		float v5=0.1f;
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);
		
		System.out.println("\nCompare String type");
		String strVar1="유경미";
		String strVar2="유경미";
		System.out.println(strVar1.equals(strVar2));
		System.out.println(!strVar1.equals(strVar2));
	}

}
