package week3.day2;

public class Calculator {

	 void add(int a,int b)
	{
		System.out.println(a+b);
	}

	 void add(int c,int d,int e)
	 {
		 System.out.println(c+d+e);
	 }
	 void multiply (int a,int b)
	 {
		 System.out.println(a*b);
	 }
	void multiply (int c,double d)
	{
		System.out.println(c*d);
	}
	void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
		void subtract(double c, double d)
		{
			System.out.println(d-c);
		}
		void divide (int a,int b)
		{
			System.out.println(b/a);
		}
		void divide(double c,double d)
		{
			System.out.println(d/c);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal=new Calculator();
		cal.add(4,8);
		cal.add(2,4);
		cal.multiply(5,10);
		cal.multiply(10,20);
		cal.divide(4,8);
		cal.divide(2,4);
		cal.subtract(10,20);
		cal.subtract(30,40);
	}

}
