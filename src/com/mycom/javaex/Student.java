package com.mycom.javaex;
class Student {
	String name; // name
	String mobile; // phone number
	int absentSum; // absent add value
	int comeLateSum; // come late add value
	int goEarlySum; // go early add value

	// absent
	void absent() {
		absentSum = absentSum + 1;
	}

	// come late
	void comeLate() {
		comeLateSum = comeLateSum + 1;
	}

	// go early
	void goEarly() {
		goEarlySum = goEarlySum + 1;
	}

	// add main method
	public static void main(String[] args) {

		//자바에는 기존 언어(절차지향적 프로그래밍 언어)의 변수 형태인 기본 자료형과
		//함께 객체를 가리키는 변수인 레퍼런스 형(Reference) 변수가 존재한다.
		//null 은 레퍼런스 형 변수의 초기화에 자주 쓰인다.
		Student kim = null;
		Student hong = null;
		
		//new 키워드를 사용하여 Student 객체를 만들고 생성된 객체의 참조값을 kim에
		//할당(대입)하는 코드이다.
		kim = new Student();

		//레퍼런스 변수 다음에 .(도트)을 이용하여 레퍼런스 형 변수가 가리키고 있는
		// 객체의 필드나 메소드에 접근 할 수 있다.
		kim.name = "Kim Sun Dal";
		kim.mobile = "010-1111-2222";

		hong = new Student();
		hong.name = "Hong Gil Dong";
		hong.mobile = "010-3333-4444";

		kim.absent();
		hong.absent();
		kim.absent();

		System.out.println(kim.absentSum);
		System.out.println(hong.absentSum);
	}
}
