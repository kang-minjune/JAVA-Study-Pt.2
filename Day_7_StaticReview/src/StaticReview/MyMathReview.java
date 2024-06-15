package StaticReview;

import java.util.Scanner;

public class MyMathReview {
public static void main(String[] args) {
		
		method2();
	}
	
	static void method1() {
		MyMath m = new MyMath();
		m.printNum();
		m.setNum(7);
		m.printNum();
		
		int sum = m.add(10, 5);	
		int maxNum = m.max(10, 5);
		System.out.println("10과 5의 합:" + sum + ", 더 큰값:" + maxNum);

	}
	
	//사용자로부터 두 개의 정수를 입력 받아 합과 그 중 큰 값을 출력하는 코드를
	//MyMath 클래스를 이용해서 구현
	static void method2() {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
//		MyMath m = new MyMath();
//		int sum = m.add(n1, n2);
//		int max = m.max(n2, n1);
		
		int sum = MyMath.add(n1, n2);
		int max = MyMath.max(n2, n1);
		
		System.out.println(sum +", " + max);
	}


}

class MyMath{

	static int add(int a, int b) {
		return a+b;
	}
	
	static int max(int x, int y) {
		int result;
		if(x>y) {
			result = x;
		}else {
			result = y;
		}
		
		return result;
	}
	
	
	int num = 0;

	void printNum() {
		System.out.println(num);
	}
	
	void setNum(int n) {
		num = n;
	}
}
	
	