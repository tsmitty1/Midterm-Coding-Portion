package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	
	private int iWidth;
	private int iHeight;
	
	public Rectangle(int width, int height) {
		setiWidth(width);
		setiHeight(height);
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		if (iWidth <= 0) {
			throw new IllegalArgumentException();
		}
		else
			this.iWidth = iWidth;
	}

	public int getiHeight() {
		return iHeight;
	}

	public void setiHeight(int iHeight) {
		if(iHeight <= 0) {
			throw new IllegalArgumentException();
		}
		else
			this.iHeight = iHeight;
	}
	
	public double area() {
		double area = this.iHeight*this.iWidth;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*(this.iHeight + this.iWidth);
		return perimeter;
	}
	
	public int compareTo(Rectangle rec) {
		
		Rectangle R = (Rectangle) rec;
		return (int) (this.area() - R.area());
		}
}
