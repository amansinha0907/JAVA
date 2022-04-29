package AMAN;

class outer
{
	void display() {
	System.out.println("hello i am outer class ");
	}
	
//	class inner
//	{
//		void display1() {
//		System.out.println("hello i am inner class");
//	}
//	}
	static class inner
	{
		void display1() {
		System.out.println("hello i am inner class");
	}
	}
	
}

public class nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//   outer obj = new outer();
//   outer.inner kk = obj.new inner();
		outer.inner kk = new outer.inner();
		   kk.display1();
//   obj.display();
		
	}

}
