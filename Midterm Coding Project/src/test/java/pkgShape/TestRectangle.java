package pkgShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangle {

	@Test
	public void TestArea1() {
		Rectangle rec = new Rectangle (10,20);
		double Actual = rec.area();
		double Expected = 200;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestArea2() {
		Rectangle rec = new Rectangle(12,8);
		double Actual = rec.area();
		double Expected = 96;
		
		assertEquals(Expected, Actual, .01);
		}
	@Test
	public void TestPerimeter1() {
		Rectangle rec = new Rectangle(10,20);
		
		double Actual = rec.perimeter();
		double Expected = 60;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestPerimeter2() {
		Rectangle rec = new Rectangle(12,8);
		
		double Actual = rec.perimeter();
		double Expected = 40;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestgetiWidth() {
		Rectangle rec = new Rectangle (10,20);
		
		double Actual = rec.getiWidth();
		double Expected = 10;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestgetiHeight() {
		Rectangle rec = new Rectangle (10,20);
		
		double Actual = rec.getiHeight();
		double Expected = 20;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestSetiHeight1() {
		Rectangle rec = new Rectangle(20,20);
		rec.setiHeight(10);
		
		assertTrue(rec.getiHeight() == 10);
	}
	@Test
	public void TestSetiHeight2() {
		try {
			Rectangle rec = new Rectangle(10,10);
			rec.setiHeight(-10);
		}
		catch(IllegalArgumentException e){
			System.out.println("Height must be greater than 0!");
		}
		
	}
	@Test
	public void TestSetiWidht1() {
		Rectangle rec = new Rectangle(20,10);
		rec.setiWidth(10);
		
		assertTrue(rec.getiWidth() == 10);
	}
	@Test
	public void TestSetiWidth2() {
		try {
			Rectangle rec = new Rectangle(10,10);
			rec.setiWidth(-10);
		}
		catch(IllegalArgumentException e){
			System.out.println("Width must be greater than 0!");
		}
	}
	@Test
	public void TestcompareTo() {
		Rectangle rec1 = new Rectangle(10,10);
		Rectangle rec2 = new Rectangle(20,20);
		
	}
}
