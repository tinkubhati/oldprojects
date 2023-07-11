package designpattern.factory;

public abstract class ShapeFactory {
	
	public static Shape getShape(ShapeType type) {
		Shape shape = null;
		switch(type) {
		case LINE:
				shape = new Line();
				break;
		case CIRCLE:
			shape = new Circle();
			break;
			
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		
		return shape;
	}

}