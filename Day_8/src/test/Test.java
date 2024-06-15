package test;

public class Test {
	
	public static void main(String[] args) {
		method2();
		
	}
	
	//테스트 코드 : x,y좌표가 10, 20인 Point 인스턴스를 생성하고 화면에 좌표값을 출력
	static void method2() {
		Point p = new Point(10, 20);
		System.out.println(p.getLocation());
	}
	
	//테스트 코드 : 문의 갯수와 색상이 다음과 같은
//  2개의 Car 인스턴스를 생성하고 정보를 출력
//  1번 인스턴스 - 4, white
//  2번 인스턴스 - 3, red
	static void method1() {
		Car c1 = new Car();
		Car c2 = new Car(3, "red");
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
