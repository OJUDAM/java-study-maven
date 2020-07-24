package prob6;

public class Rectangle extends Shape implements Resizable{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}
	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		width = width*rate;
		height = height*rate;
	}
}
