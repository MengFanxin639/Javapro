package myclasspro.AbstractDemo;

public class TestMain {

	public static void main(String[] args) {
		AbsShape circle = new Circle(3);
		System.out.println(circle);
		
		AbsShape rectangle = new Rectangle(3, 3);
		System.out.println(rectangle);
		
		
	}

}
