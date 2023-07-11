package designpattern.factory;


public class FactoryDemo {

	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
		if(circle != null) {
			circle.draw();
		}else {
			System.out.println("THis shape cannot be drawn");
		}
	
	
	//requests non existent shape
			Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
			if(triangle != null) {
				triangle.draw();
			}else {
				System.out.println("This shape can not be drawn");
			}
			
			//this is your normal way to create an object of a class
			Line line = new Line();
			line.draw();
	}
}
