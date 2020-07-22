package com.bit2020.chapter03.paint;

public class MainApp {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(200);
		
		Point point2 = new Point(50, 50);
		draw(point1);
		draw(point2);
		
		point1.show(false);
		System.out.println("============================");
		
		//업캐스팅
		Point point3 = new ColorPoint();
		point3.setX(30);
		point3.setY(100);
		
		//다운캐스팅 명시적으로 해줘야함
		((ColorPoint)point3).setColor("red");
		
		draw(point3);
		
		Point point4 = new ColorPoint(10, 20, "yellow");
		draw(point4);
		System.out.println("============================");
		
		Rect rect = new Rect();
		draw(rect);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Circle circle = new Circle();
		draw(circle);
		
		System.out.println("============================");
		draw(new GraphicText("Hello"));

	}
	
	public static void draw(Drawable drawable) {
		
		drawable.draw();
	}
	
	/*public static void drawPoint(Point pt) {
		pt.show();
	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}*/
	
}