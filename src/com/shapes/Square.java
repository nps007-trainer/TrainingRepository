package com.shapes;

public class Square extends Shape implements ITwoDShape {

	public Square(int side) {
		this.side=side;
	}
	@Override
	public void draw() {
		int area= side* side;
		System.out.println("Area of a square is "+ area);
		
		
	}

	@Override
	public void draw2d() {
		System.out.println("Drawing 2 d square");
		
	}


}
