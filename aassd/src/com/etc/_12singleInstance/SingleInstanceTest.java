package com.etc._12singleInstance;

public class SingleInstanceTest {
	public static void main(String[] args) {
		// Apple a1 = new Apple();
		// Apple a2 = new Apple();
		// Apple a3 = new Apple();
		// Apple a4 = new Apple();

		//
		// System.out.println(a1);
		// System.out.println(a2);
		// System.out.println(a3);
		// System.out.println(a4);

		// ����
		Apple a5 = Apple.getInstance();
		Apple a6 = Apple.getInstance();

		System.out.println(a5);
		System.out.println(a6);

		System.out.println("----------------------------");
		// ���� �Ƽ�
		AppleTwo a7 = AppleTwo.getInstance();
		AppleTwo a8 = AppleTwo.getInstance();
		System.out.println(a7);
		System.out.println(a8);

	}
}
