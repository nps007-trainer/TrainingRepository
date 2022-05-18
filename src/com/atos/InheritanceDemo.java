package com.atos;

import com.org.*;
import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Shape;
import com.shapes.Square;

public class InheritanceDemo {

	public static void main(String[] args) {
	Circle obj=new Circle(6);
	obj.draw();
	
	Rectangle rect=new Rectangle(4, 5);
	rect.message();
	rect.draw();
	
	Square sq=new Square(6);
	
	sq.display();
	sq.draw();
	sq.draw2d();
	
	}

}
