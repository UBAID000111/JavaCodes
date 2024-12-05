package abstraction;

	abstract class Shape{
		abstract void draw();//Abstract Method
	}
	
	class Circle extends Shape{
		void draw() {
		System.out.println("Drawing Circle");
	}
	}
	
	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new Circle();
		shape.draw();
		
	}

}
