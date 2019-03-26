package pkgShape;

public class Cuboid extends Rectangle implements SortByArea, SortByVolume{
	
	private int iDepth;
	
	public Cuboid(int width, int height, int depth) {
		super(width, height);
		setiDepth(depth);
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		if(iDepth <= 0) {
			throw new IllegalArgumentException();
		}
		else
			this.iDepth = iDepth;
	} 
	
	@Override
	public double area() {
		double surfaceArea = ((2*super.getiWidth())*(super.getiHeight())) + ((2*getiDepth())*(super.getiHeight()) + (2*(super.getiWidth())*getiDepth()));          
  		return surfaceArea;
	}
	
	public double Volume() {
		return getiWidth() * iDepth * getiHeight();
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
}
