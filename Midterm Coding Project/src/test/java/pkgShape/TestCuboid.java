package pkgShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuboid {

	@Test
	public void TestArea1() {
		
		Cuboid cub = new Cuboid (10,20,30);
		double Actual = cub.area();
		double Expected = 2200;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestArea2() {
		Cuboid cub = new Cuboid(12,8,15);
		double Actual = cub.area();
		double Expected = 792;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestPerimeter1() {
		Cuboid cub = new Cuboid(10,20,30);
		try {
			cub.perimeter();
		}
		catch(UnsupportedOperationException e){
			System.out.println("This operation cannot be performed on a Cuboid");
		}
	}
	@Test
	public void TestVolume() {
		Cuboid cub = new Cuboid (10,20,30);
		double Actual = cub.Volume();
		double Expected = 6000;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestgetiWidth() {
		Cuboid cub = new Cuboid (10,20,30);
		
		double Actual = cub.getiDepth();
		double Expected = 30;
		
		assertEquals(Expected, Actual, .01);
	}
	@Test
	public void TestSetiDepth() {
		Cuboid cub = new Cuboid(20,10,30);
		cub.setiDepth(10);
		
		assertTrue(cub.getiDepth() == 10);
	}
}
