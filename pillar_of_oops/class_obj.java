package pillar_of_oops;

public class class_obj {
  int width, height;
  int getArea() {
	  return width * height;
  }
  public static void main(String[] args) {
	  class_obj obj = new class_obj();
	  obj.width = 10;
	  obj.height = 20;
	  int area = obj.getArea();
	  System.out.println("Area of the hosue =" +area);
  }
}
