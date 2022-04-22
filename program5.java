package javaprogram;

public class program5 {
	static int num=10;
	static void function(int num1)
	{
		int num2=30;
		System.out.println("calling static variable number ="+num);
		System.out.println("calling methods variable number ="+num1);
		System.out.println("calling blocks variable number ="+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function(20);

	}

}
