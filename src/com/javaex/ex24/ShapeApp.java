package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
	
		//Shape[] sArray = new Shape[4];
		
		Drawable[] dArray = new Drawable[4];
		
		//포인트를 메모리에 올리고 Drawable이야 라고 속인다.
		Drawable dp = new Point(5, 5); 
		
		/*
		dp.draw();
		((Point)dp).getX();
		*/
		
		Drawable dt = new Triangle("빨강","빨강",10, 20);
		dt.draw();
		((Triangle)dt).getHeight();
		
		
		Drawable dr = new Rectangle("초록","초록",20, 200);
		Drawable dc = new Circle("파랑","파랑",5);
		
		dArray[0] = dt;
		dArray[1] = dr;
		dArray[2] = dc;
		dArray[3] = dp;
		
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		
		/*
		//dp가 Drawable 출신이냐?
		System.out.println(dp instanceof Drawable);
		
		
		//dp가 Point 출신이냐?
		System.out.println(dp instanceof Point);
		*/
		
		
		//
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape)
				((Shape)dArray[i]).area();
		}
		
	}
	
}
