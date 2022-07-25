package pillar_of_oops;


public class polymorphism {
	public void area() {
	 System.out.println(" find area");
	}
	public void area(int r) {
		System.out.println("area of circle =" + 3.14*r*r);
	}
	public void area(double b, double h) {
		System.out.println(" Area of traingle =" +0.5 * b * h);
	}
	public void area(int l , int b) {
		System.out.println("Area of rectangle=" + l*b);
	}
	
	public static void main(String[] args) {
		polymorphism myshape = new polymorphism();
		
		myshape.area();
		myshape.area(5);
		myshape.area(6.0,1.2);
		myshape.area(6,2);
		
		
	}
}
