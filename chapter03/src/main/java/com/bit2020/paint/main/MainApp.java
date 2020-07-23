package com.bit2020.paint.main;

import com.bit2020.paint.i.Drawable;
import com.bit2020.paint.point.ColorPoint;
import com.bit2020.paint.point.Point;
import com.bit2020.paint.shape.Circle;
import com.bit2020.paint.shape.Rect;
import com.bit2020.paint.shape.Shape;
import com.bit2020.paint.shape.Triangle;
import com.bit2020.paint.text.GraphicText;

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
		
		System.out.println("============================");
		
		
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Object);
		
		//오류 : class는 Hierachy 구조에서 상위,
		//        하위 클래스만 instanceof 연산자를
		//        사용할 수있다.
		//System.out.println(circle instanceof Rect);
		
		System.out.println("============================");
		
		Shape s = new Circle();
		
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Triangle);
		
		System.out.println("============================");
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);

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