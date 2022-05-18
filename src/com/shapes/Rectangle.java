package com.shapes;

public class Rectangle  extends Shape implements ITwoDShape, IThreeDShape{

	public Rectangle(int l, int b) {
		lenght=l;
		breadth=b;
	}
	@Override
	public void draw() {
		int area=lenght*breadth;
		System.out.println("Area of the rectangle is "+area);
		
	}
	@Override
	public void draw3d() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw2d() {
		// TODO Auto-generated method stub
		
	}
	

}
