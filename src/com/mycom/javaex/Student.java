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

		//�ڹٿ��� ���� ���(���������� ���α׷��� ���)�� ���� ������ �⺻ �ڷ�����
		//�Բ� ��ü�� ����Ű�� ������ ���۷��� ��(Reference) ������ �����Ѵ�.
		//null �� ���۷��� �� ������ �ʱ�ȭ�� ���� ���δ�.
		Student kim = null;
		Student hong = null;
		
		//new Ű���带 ����Ͽ� Student ��ü�� ����� ������ ��ü�� �������� kim��
		//�Ҵ�(����)�ϴ� �ڵ��̴�.
		kim = new Student();

		//���۷��� ���� ������ .(��Ʈ)�� �̿��Ͽ� ���۷��� �� ������ ����Ű�� �ִ�
		// ��ü�� �ʵ峪 �޼ҵ忡 ���� �� �� �ִ�.
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
