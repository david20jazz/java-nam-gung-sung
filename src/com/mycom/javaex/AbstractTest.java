package com.mycom.javaex;
//추상클래스 Shape선언
abstract class Shape {
	abstract void draw();
}

//추상클래스 Shape로부터 상속받는 클래스 Rectangle선언
class Rectangle extends Shape {
	//
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Traingle extends Shape {
	void draw() {
		System.out.println("Draw Traingle");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.draw();
		s1 = new Traingle();
		s1.draw();

	}

}
