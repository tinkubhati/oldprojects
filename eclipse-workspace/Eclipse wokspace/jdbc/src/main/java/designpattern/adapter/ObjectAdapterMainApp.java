package designpattern.adapter;

import designpattern.adapter.thirdparty.GShape;
import designpattern.adapter.thirdparty.Triangle;

public class ObjectAdapterMainApp {

	public static void main(String[] args) {
		System.out.println("Creating drawing of shapes...");
		Drawing drawing = new Drawing();
		drawing.addShape(new Rectangle());
		drawing.addShape(new Circle());
		
		drawing.addShape(new ShapeObjectAdapter(new Triangle()));
		drawing.addShape(new ShapeObjectAdapter(new GShape()));
		
		System.out.println("Drawing ....");
		drawing.draw();
		System.out.println("Resizing");
		drawing.resize();
	}

}