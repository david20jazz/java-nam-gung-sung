package com.mycom.javaex;
//�߻�Ŭ���� Shape����
abstract class Shape {
	abstract void draw();
}

//�߻�Ŭ���� Shape�κ��� ��ӹ޴� Ŭ���� Rectangle����
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
