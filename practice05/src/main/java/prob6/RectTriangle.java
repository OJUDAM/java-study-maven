package prob6;

public class RectTriangle extends Shape implements Resizable {
	double width;
	double height;
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width+height+Math.sqrt(width*width+height*height);
	}
	@Override
	public void resize(double rate) {
		// TODO Auto-generated method stub
		width = width*rate;
		height = height*rate;
	}


}
