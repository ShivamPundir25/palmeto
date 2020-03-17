package overload;

public class FunctionOverload {
	
	public void areA(int a) {
		int area= a*a;
		System.out.println("The area of square is : " + area);
	}
	public void areA(int a, int b) {
		
	int area= a*b;
	System.out.println("The area of rectangle is : " + area);
	}
	
	public void areA(int a, int b,int c) {
		
		int area= a+b+c;
		System.out.println("Perimeter of triangle is : " + area);
		}
	public void areA(int a, int b,int c,int d) {
		
		int area= a+b+c+d;
		System.out.println("The perimeter of quadrilateral is : " + area);
		}
	

}
